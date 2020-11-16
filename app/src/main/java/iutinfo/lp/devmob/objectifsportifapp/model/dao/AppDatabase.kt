package iutinfo.lp.devmob.objectifsportifapp.model.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDistance
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDuration
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Database(entities = [Sport::class, GoalDistance::class, GoalDuration::class], version = 1)
@TypeConverters(DataConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sportDao(): SportDao
    abstract fun goalDistanceDao(): GoalDistanceDao
    abstract fun goalDurationDao(): GoalDurationDao

    object AppDatabaseProvider{
        val DB_NAME  : String = "app_database"
        private lateinit var INSTANCE : AppDatabase

        fun getAppDatabase(context: Context): AppDatabase {
            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java,
                    DB_NAME
                ).build()
            }
            return INSTANCE
        }
    }
}