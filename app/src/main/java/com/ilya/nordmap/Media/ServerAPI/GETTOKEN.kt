package com.ilya.nordmap.Media.ServerAPI

import android.util.Log
import com.google.gson.Gson
import com.ilya.nordmap.Media.DataModel.Formattoken
import com.ilya.nordmap.Media.DataModel.TokenResponse
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody



import okhttp3.*
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.X509TrustManager


import okhttp3.RequestBody
import okhttp3.FormBody
import okhttp3.Response
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager


fun sendNotificationToCloud(): Formattoken {
    // Создание кастомного TrustManager, который игнорирует ошибки сертификатов
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
    val client = OkHttpClient.Builder()
        .sslSocketFactory(sslSocketFactory, trustAllCertificates as X509TrustManager)
        .hostnameVerifier { _, _ -> true } // Отключаем проверку имени хоста
        .build()

    // Формирование тела запроса с параметром scope
    val formBody = FormBody.Builder()
        .add("scope", "GIGACHAT_API_PERS")
        .build()

    // Создание запроса
    val request = Request.Builder()
        .url("https://ngw.devices.sberbank.ru:9443/api/v2/oauth") // URL для получения токена
        .addHeader("Content-Type", "application/x-www-form-urlencoded")
        .addHeader("Accept", "application/json")
        .addHeader("RqUID", "6f0b1291-c7f3-43c6-bb2e-9f3efb2dc98e") // Замените на ваш уникальный идентификатор
        .addHeader("Authorization", "Basic ZmY3MWUyMWQtMjNjMi00ZWNhLWI0MzYtMmVjZGJmZTFjNjY0OjAyMWZhNDRlLWU2N2MtNDgwYi04ZWNjLWNjMzRjMGU3MjRhMA==") // Замените на ваш ключ авторизации
        .post(formBody)
        .build()

    // Логируем создание запроса
    Log.d("sendNotificationToCloud", "Request created: $request")

    try {
        // Отправка запроса и получение ответа
        val response: Response = client.newCall(request).execute()

        // Логируем код ответа
        Log.d("sendNotificationToCloud", "Response received, code: ${response.code}")

        // Логируем тело ответа (даже если оно неуспешно)
        val responseBody = response.body?.string() ?: "No body"
        Log.d("sendNotificationToCloud", "Response Body: $responseBody")

        // Если ответ успешен
        if (response.isSuccessful) {
            // Логирование успешного ответа
            Log.d("sendNotificationToCloud", "Success, response body: $responseBody")

            // Парсинг ответа в объект Formattoken
            val gson = Gson()
            return gson.fromJson(responseBody, Formattoken::class.java)
        } else {
            // Обработка ошибки, если ответ не успешен
            Log.e("sendNotificationToCloud", "Error response code: ${response.code}")
            throw Exception("Error: ${response.code} - $responseBody")
        }
    } catch (e: Exception) {
        // Логирование ошибок
        Log.e("sendNotificationToCloud", "Request failed: ${e.message}")
        throw Exception("Request failed: ${e.message}", e)
    }
}
