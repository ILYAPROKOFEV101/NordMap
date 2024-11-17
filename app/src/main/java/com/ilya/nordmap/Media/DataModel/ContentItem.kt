package com.ilya.nordmap.Media.DataModel

data class ContentItem(
    val id: Int,
    val previewUrl: String,  // URL картинки (или ресурс)
    val title: String,  // Заголовок
    val description: String,  // Первое описание
    val imageUrl: String,  // URL картинки (или ресурс) для первого изображения
    val description2: String,  // Второе описание
    val imageUrl2: String  // URL картинки (или ресурс) для второго изображения
)
