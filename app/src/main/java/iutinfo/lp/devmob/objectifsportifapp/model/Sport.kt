package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sports")
data class Sport(
    @PrimaryKey(autoGenerate = true) val uid : Int,
    val name :String,
    val durationOption:Boolean,
    val distanceOption:Boolean
) {
    constructor(name: String, durationOption: Boolean, distanceOption: Boolean) : this(0,name,durationOption,distanceOption)
}
