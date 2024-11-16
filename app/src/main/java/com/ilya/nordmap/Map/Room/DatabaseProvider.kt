import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MapMarker_DATA::class], version = 2, exportSchema = false)
abstract class MainDb : RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        private var instance: MainDb? = null

        fun getDb(context: Context): MainDb {
            return instance ?: synchronized(this) {
                val tempInstance = Room.databaseBuilder(
                    context.applicationContext, // важно!
                    MainDb::class.java,
                    "marker.db"
                ).build()
                instance = tempInstance
                tempInstance
            }
        }
    }
}
