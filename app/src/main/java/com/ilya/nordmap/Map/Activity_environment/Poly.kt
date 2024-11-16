import com.google.android.gms.maps.model.LatLng
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.util.UUID

class DirectionsJSONParser {
    fun parse(jObject: JSONObject): List<List<HashMap<String, String>>> {
        val routes = ArrayList<List<HashMap<String, String>>>()

        val jRoutes = jObject.getJSONArray("routes")

        for (i in 0 until jRoutes.length()) {
            val jLegs = (jRoutes[i] as JSONObject).getJSONArray("legs")
            val path = ArrayList<HashMap<String, String>>()

            for (j in 0 until jLegs.length()) {
                val jSteps = (jLegs[j] as JSONObject).getJSONArray("steps")

                for (k in 0 until jSteps.length()) {
                    val polyline = ((jSteps[k] as JSONObject)["polyline"] as JSONObject)["points"] as String
                    val list = decodePoly(polyline)

                    for (l in list.indices) {
                        val hm = HashMap<String, String>()
                        hm["lat"] = java.lang.Double.toString(list[l].latitude)
                        hm["lng"] = java.lang.Double.toString(list[l].longitude)
                        path.add(hm)
                    }
                }
                routes.add(path)
            }
        }

        return routes
    }

    private fun decodePoly(encoded: String): List<LatLng> {
        val poly = ArrayList<LatLng>()
        var index = 0
        val len = encoded.length
        var lat = 0
        var lng = 0

        while (index < len) {
            var b: Int
            var shift = 0
            var result = 0

            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1F shl shift)
                shift += 5
            } while (b >= 0x20)

            val dlat = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lat += dlat

            shift = 0
            result = 0

            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1F shl shift)
                shift += 5
            } while (b >= 0x20)

            val dlng = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lng += dlng

            val p = LatLng(lat.toDouble() / 1E5, lng.toDouble() / 1E5)
            poly.add(p)
        }

        return poly
    }
}
object Utils {
    @Throws(IOException::class)
    fun downloadUrl(strUrl: String): String {
        var data = ""
        var iStream: InputStream? = null
        var urlConnection: HttpURLConnection? = null
        try {
            val url = URL(strUrl)

            // Creating an http connection to communicate with url
            urlConnection = url.openConnection() as HttpURLConnection

            // Connecting to url
            urlConnection.connect()

            // Reading data from url
            iStream = urlConnection.inputStream

            val br = BufferedReader(InputStreamReader(iStream))
            val sb = StringBuilder()

            var line: String?
            while (br.readLine().also { line = it } != null) {
                sb.append(line)
            }

            data = sb.toString()
            br.close()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            iStream?.close()
            urlConnection?.disconnect()
        }
        return data
    }
}



fun generateUID(): String {
    return UUID.randomUUID().toString()
}


