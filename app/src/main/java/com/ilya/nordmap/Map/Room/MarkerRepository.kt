package com.ilya.nordmap.Map.Room

import Dao
import MapMarker_DATA
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MarkerRepository(private val dao: Dao) {
    fun getAllMarkers(): Flow<List<MapMarker_DATA>> = dao.getAllItem()

    suspend fun insertMarker(marker: MapMarker_DATA) {
        dao.insertItem(marker)
    }
}


class MarkerViewModel(private val repository: MarkerRepository) : ViewModel() {

    private val _markers = MutableStateFlow<List<MapMarker_DATA>>(emptyList())
    val markers: StateFlow<List<MapMarker_DATA>> = _markers

    init {
        // Подписка на данные из базы
        viewModelScope.launch {
            repository.getAllMarkers().collect { markerList ->
                _markers.value = markerList
            }
        }
    }

    fun addMarker(marker: MapMarker_DATA) {
        viewModelScope.launch {
            repository.insertMarker(marker)
        }
    }
}