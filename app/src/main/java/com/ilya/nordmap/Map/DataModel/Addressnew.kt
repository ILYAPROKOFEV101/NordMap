package com.ilya.MeetingMap.Map.DataModel

data class Addressnew(
    val road: String?,       // Название улицы (может быть null)
    val house_number: String?, // Номер дома (может быть null)
    val suburb: String?,      // Район (может быть null)
    val city: String?,        // Город (может быть null)
    val state: String?,       // Штат/область (может быть null)
    val country: String?      // Страна (может быть null)
)
