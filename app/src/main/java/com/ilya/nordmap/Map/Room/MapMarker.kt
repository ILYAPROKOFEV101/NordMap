import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

    @Entity(tableName = "markers")
    data class MapMarker_DATA(
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        @ColumnInfo(name = "name")
        val name: String,
        @ColumnInfo(name = "type")
        val type: String,
        @ColumnInfo(name = "lon")
        val lon: Double,
        @ColumnInfo(name = "lat")
        val lat: Double,
        @ColumnInfo(name = "description")
        val description: String,
        @ColumnInfo(name = "visitTime")
        val visitTime: String,
        @ColumnInfo(name = "isVisited")
        val isVisited: Boolean,
        @ColumnInfo(name = "imageUrl")
        val imageUrl: String,
        @ColumnInfo(name = "queryPrompt")
        val queryPrompt: String
    )
