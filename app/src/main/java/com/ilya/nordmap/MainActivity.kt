package com.ilya.nordmap

import android.content.Intent
import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilya.MeetingMap.Mine_menu.Map_Activity
import com.ilya.nordmap.ui.theme.NordMapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NordMapTheme {
                SplashScreen { // Передаем действие для перехода
                    val intent = Intent(this@MainActivity, Map_Activity::class.java)
                    startActivity(intent)
                    finish() // Закрываем текущую Activity
                }
            }
        }
    }
}


@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    val font = FontFamily(
        Font(R.font.roboto_bold, FontWeight.Normal),
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // Фон для сплэш-скрина
    ) {
        Image(
            painter = painterResource(id = R.drawable.spalashscreen), // Укажите свой ресурс
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Текст в правом нижнем углу
        Text(
            text = buildAnnotatedString {
                appendLine("ГУАП (группа С324):")
                appendLine("Прокофьев Илья,")
                appendLine("Прокудин Александр,")
                appendLine("Шульга Иван,")
                appendLine("Ларин Александр,")
                appendLine("Бондарев Максим,")
                appendLine("Мосолова Татьяна.")
            },
            modifier = Modifier
                .align(Alignment.BottomEnd) // Размещение в правом нижнем углу
                .padding(16.dp), // Отступ от края
            color = Color.Black, // Цвет текста
            style = TextStyle(
                fontSize = 16.sp, // Размер шрифта
                fontFamily = font,
                fontWeight = FontWeight.Bold // Толщина шрифта
            )
        )
    }

    // Запускаем эффект с задержкой
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(2000) // Задержка 2 секунды
        onTimeout() // Переход к следующему экрану
    }
}

