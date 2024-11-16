package com.ilya.MeetingMap.Map.DataModel



data class NominatimResponse(
    val place_id: String,
    val lat: String,
    val lon: String,
    val display_name: String,
    val address: Addressnew
)