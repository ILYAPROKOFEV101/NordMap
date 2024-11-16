import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.location.Address
import android.location.Geocoder
import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory

import java.io.IOException
import java.util.Locale

fun bitmapDescriptorFromVector(context: Context, icon: Any, colorString: String, width: Int, height: Int): BitmapDescriptor {
        when (icon) {
            is Int -> {
                val vectorDrawable = ContextCompat.getDrawable(context, icon)
                vectorDrawable?.let {
                    val drawable = DrawableCompat.wrap(it).mutate()

                    val color = Color.fromHex(colorString).toArgb() // Получаем ARGB представление цвета


                    DrawableCompat.setTint(drawable, color)
                    drawable.setBounds(0, 0, width, height) // Устанавливаем заданный размер
                    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
                    val canvas = Canvas(bitmap)
                    drawable.draw(canvas)
                    return BitmapDescriptorFactory.fromBitmap(bitmap)
                }
            }
            is BitmapDrawable -> {
                val bitmap = Bitmap.createScaledBitmap(icon.bitmap, width, height, false)
                return BitmapDescriptorFactory.fromBitmap(bitmap)
            }
            else -> {
                // Обработка других типов источников, если необходимо
            }
        }
        // В случае ошибки возвращаем стандартный маркер
        return BitmapDescriptorFactory.defaultMarker()
    }



    fun Color.Companion.fromHex(colorString: String): Color {
        val colorWithoutHash = colorString.removePrefix("#") // Убираем #, если он есть

        if (colorWithoutHash.length != 6 && colorWithoutHash.length != 8) {
            throw IllegalArgumentException("Invalid hex color string: $colorString")
        }

        val color = android.graphics.Color.parseColor("#$colorWithoutHash") // Добавляем #, если его не было
        return Color(color)
    }


fun getAddressFromLatLon(context: Context, lat: Double, lon: Double): String? {
    val geocoder = Geocoder(context, Locale.getDefault())
    val addresses: List<Address>?
    val address: Address?
    var addressText: String? = null

    try {
        // Получаем список адресов по координатам
        addresses = geocoder.getFromLocation(lat, lon, 1)

        if (addresses != null && addresses.isNotEmpty()) {
            address = addresses[0]
            addressText = address.getAddressLine(0) // Получаем полный адрес
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }

    return addressText
}











