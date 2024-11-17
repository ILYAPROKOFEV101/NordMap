package com.ilya.nordmap.Map.DataModel

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
@Serializable
data class AIanswer(
    val choices: List<Choice>,
    val created: Int,
    val model: String,
    val `object`: String,
    val usage: Usage
) {
    @Serializable
    data class Choice(
        val finish_reason: String,
        val index: Int,
        val message: Message
    )

    @Serializable
    data class Message(
        val content: String,
        val role: String
    )

    @Serializable
    data class Usage(
        val completion_tokens: Int,
        val prompt_tokens: Int,
        val total_tokens: Int
    )
}

fun extractRussianLettersWithSpaces(input: String): String {
    // Найдем первую русскую букву и последнюю русскую букву в строке
    val start = input.indexOfFirst { it in 'а'..'я' || it in 'А'..'Я' || it == 'ё' || it == 'Ё' }
    val end = input.indexOfLast { it in 'а'..'я' || it in 'А'..'Я' || it == 'ё' || it == 'Ё' }

    // Если русские буквы есть в строке
    if (start != -1 && end != -1) {
        // Берем подстроку с первой русской буквы по последнюю
        val subString = input.substring(start, end + 1)

        // Регулярное выражение для поиска русских букв и знаков препинания между ними
        val regex = "[а-яА-ЯёЁ\\s.,!?;:]".toRegex()

        // Извлекаем только русские буквы и знаки препинания между ними
        return regex.findAll(subString)
            .joinToString("") { it.value }
    }

    // Если нет русских букв, возвращаем пустую строку
    return ""
}