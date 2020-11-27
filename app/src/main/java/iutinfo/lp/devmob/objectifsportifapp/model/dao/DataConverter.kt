package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import iutinfo.lp.devmob.objectifsportifapp.model.Sport
import java.lang.reflect.Type
import java.time.Duration
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Because we can't do object reference within room we have to convert objects to basic java object (POJO)
 *
 * In this class we create 2 function for each data type that need to be converted : 1 for each way of converting the type.
 * @see <a href ="https://developer.android.com/training/data-storage/room/referencing-data#kotlin" > Official Doc</a>
 * @see <a href ="https://stackoverflow.com/questions/44580702/android-room-persistent-library-how-to-insert-class-that-has-a-list-object-fie" >SO:Converter with GSON</a>
 */
class DataConverter {

    @TypeConverter
    fun dateToTimeStamp(date: Date?): Long? = date?.time

    @TypeConverter
    fun timeStampToDate(longDate: Long?): Date? {
        return longDate?.let { Date(it) }
    }

    @TypeConverter
    fun durationToStamp(duration: Duration): Long{
        return duration.toMinutes()
    }

    @TypeConverter
    fun durationToStamp(input: Long): Duration {
        return Duration.ofMinutes(input)
    }

    @TypeConverter
    fun sportToString(sport: Sport?): String? {
        val gson = Gson()
        val type: Type = object : TypeToken<Sport>() {}.type
        return gson.toJson(sport, type)
    }

    @TypeConverter
    fun stringToSport(value: String?): Sport? {
        val gson = Gson()
        val type: Type = object : TypeToken<Sport>() {}.type
        return gson.fromJson(value, type)
    }

}