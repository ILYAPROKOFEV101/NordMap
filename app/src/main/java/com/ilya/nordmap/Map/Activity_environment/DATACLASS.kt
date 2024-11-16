import android.os.Parcel
import android.os.Parcelable
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import kotlinx.serialization.Serializable

data class MapProperties(val googleMap: com.google.android.gms.maps.GoogleMap)
data class MapUiSettings(val uiSettings: com.google.android.gms.maps.UiSettings)



// Класс для хранения состояния MapView
data class MapViewState(
    val userLocation: LatLng? = null,
    val userMarker: Marker? = null
)
@Serializable
data class MarkerData(
    val key: String,
    val username: String,
    val imguser: String,
    val photomark: String,
    val street: String,
    val id: String,
    val lat: Double,
    val lon: Double,
    val name: String,
    val whatHappens: String,
    val startDate: String,
    val endDate: String,
    val startTime: String,
    val endTime: String,
    val participants: Int,
    val access: Boolean
)


