import kotlinx.coroutines.*
import java.security.cert.X509Certificate
import javax.net.ssl.*
import okhttp3.*
import com.google.gson.Gson
import android.util.Log
import com.ilya.nordmap.Media.DataModel.Formattoken

class NotificationSender(private val scope: CoroutineScope) {
    private val client: OkHttpClient
    private val gson = Gson()

    init {
        // Создание кастомного TrustManager
        val trustAllCertificates: TrustManager = object : X509TrustManager {
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                // Пропускаем проверку
            }

            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                // Пропускаем проверку
            }

            override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
        }

        // Создание SSLContext с кастомным TrustManager
        val sslContext: SSLContext = SSLContext.getInstance("TLS")
        sslContext.init(null, arrayOf(trustAllCertificates), java.security.SecureRandom())

        // Создание SSLSocketFactory для клиента
        val sslSocketFactory: SSLSocketFactory = sslContext.socketFactory

        // Создание OkHttpClient с игнорированием SSL-сертификатов
        client = OkHttpClient.Builder()
            .sslSocketFactory(sslSocketFactory, trustAllCertificates as X509TrustManager)
            .hostnameVerifier { _, _ -> true } // Отключаем проверку имени хоста
            .build()
    }

     fun sendNotificationToCloud(): Formattoken {
        val formBody = FormBody.Builder()
            .add("scope", "GIGACHAT_API_PERS")
            .build()

        val request = Request.Builder()
            .url("https://ngw.devices.sberbank.ru:9443/api/v2/oauth")
            .addHeader("Content-Type", "application/x-www-form-urlencoded")
            .addHeader("Accept", "application/json")
            .addHeader("RqUID", "6f0b1291-c7f3-43c6-bb2e-9f3efb2dc98e")
            .addHeader("Authorization", "Basic ZmY3MWUyMWQtMjNjMi00ZWNhLWI0MzYtMmVjZGJmZTFjNjY0OjAyMWZhNDRlLWU2N2MtNDgwYi04ZWNjLWNjMzRjMGU3MjRhMA==")
            .post(formBody)
            .build()

        Log.d("sendNotificationToCloud", "Request created: $request")

        try {
            val response: Response = client.newCall(request).execute()
            Log.d("sendNotificationToCloud", "Response received, code: ${response.code}")

            val responseBody = response.body?.string() ?: "No body"
            Log.d("sendNotificationToCloud", "Response Body: $responseBody")

            if (response.isSuccessful) {
                Log.d("sendNotificationToCloud", "Success, response body: $responseBody")
                return gson.fromJson(responseBody, Formattoken::class.java)
            } else {
                Log.e("sendNotificationToCloud", "Error response code: ${response.code}")
                throw Exception("Error: ${response.code} - $responseBody")
            }
        } catch (e: Exception) {
            Log.e("sendNotificationToCloud", "Request failed: ${e.message}")
            throw Exception("Request failed: ${e.message}", e)
        }
    }

    // Функция для запуска периодических запросов
    fun startPeriodicNotifications(intervalMillis: Long) {
        scope.launch {
            while (true) {
                try {
                    sendNotificationToCloud()
                    Log.d("NotificationSender", "Notification sent successfully.")
                } catch (e: Exception) {
                    Log.e("NotificationSender", "Error sending notification: ${e.message}")
                }
                delay(intervalMillis)  // Ждем заданное время перед следующим запросом
            }
        }
    }
}

// Пример использования:
fun main() {
    // Создаем CoroutineScope для работы с корутинами
    val scope = CoroutineScope(Dispatchers.IO)

    // Создаем объект NotificationSender и начинаем отправку уведомлений каждые 30 минут
    val notificationSender = NotificationSender(scope)
    notificationSender.startPeriodicNotifications(30 * 60 * 1000L)  // 30 минут в миллисекундах
}



