package com.ilya.nordmap.Media.DataModel

import kotlinx.serialization.Serializable

data class ContentItem(
    val id: Int,
    val previewUrl: String,  // URL картинки (или ресурс)
    val title: String,  // Заголовок
    val description: String,  // Первое описание
    val imageUrl: String,  // URL картинки (или ресурс) для первого изображения
    val description2: String,  // Второе описание
    val imageUrl2: String  // URL картинки (или ресурс) для второго изображения
)

// Модель для сериализации и десериализации JSON
data class Message(
    val role: String,
    val content: String
)

// Основной класс для запроса
@Serializable
data class ChatRequest(
    val model: String,
    val messages: List<Message>,
    val stream: Boolean,
    val update_interval: Int
)
