package com.ilya.nordmap.Media

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ilya.nordmap.Media.ServerAPI.Postquashen

import com.ilya.nordmap.Media.ServerAPI.sendNotificationToCloud
import com.ilya.nordmap.Media.ui.theme.MarkersktTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MediaActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val tokenResponse = sendNotificationToCloud()
                // Получаем access_token из ответа

                Log.d("Igot_new_Token:","$tokenResponse")
                Log.d("Igot_new_Token:","${tokenResponse.access_token}")

                    val answer =  Postquashen(tokenResponse.access_token, "Расскажи о достопримечательностях Арктики, где они находятся и чем они интересны.")
                Log.d("Igot_new_Token:","$answer")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        setContent {

            MarkersktTheme {

            }


        }
    }

}

@Composable
fun Greeting2(token: String) {
    Text(
        text = "Hello $token!",

    )
}

