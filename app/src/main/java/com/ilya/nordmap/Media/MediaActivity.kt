package com.ilya.nordmap.Media

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.ilya.nordmap.Media.DataModel.ContentItem
import com.ilya.nordmap.Media.ServerAPI.Postquashen

import com.ilya.nordmap.Media.ServerAPI.sendNotificationToCloud
import com.ilya.nordmap.Media.ui.theme.MarkersktTheme
import com.ilya.nordmap.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MediaActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val background = if (isSystemInDarkTheme()) Color.Black else Color.White
            MarkersktTheme() {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(background)
                ) {
                    ContentList(contentItems)
                }
            }


        }
    }

}

@Composable
fun ContentList(contentItems: List<ContentItem>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contentItems) { item ->
            ArticleCard(item)
        }
    }
}


@Composable
fun ArticleCard(item: ContentItem) {
    val font = FontFamily(
        Font(R.font.roboto_bold, FontWeight.Normal),
    )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Preview image
            Image(
                painter = rememberImagePainter(item.previewUrl),
                contentDescription = item.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            // Title
            Text(
                text = item.title,
                fontFamily = font,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp)
            )

            // First description
            Text(
                text = item.description,
                fontFamily = font,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp)
            )

            // Image and second description
            Column(modifier = Modifier.padding(top = 16.dp)) {
                Image(
                    painter = rememberImagePainter(item.imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop
                )



                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.description2,
                        fontFamily = font,
                        fontSize = 16.sp
                    )
                }
            }

            // Second image
            Image(
                painter = rememberImagePainter(item.imageUrl2),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 16.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

