import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Insert
    fun insertItem(item: MapMarker_DATA)
    @Query("SELECT * FROM markers")
    fun getAllItem(): Flow<List<MapMarker_DATA>>
}