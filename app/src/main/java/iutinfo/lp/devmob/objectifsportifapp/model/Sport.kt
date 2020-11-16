package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sports")
data class Sport(
    @PrimaryKey val uid : Int = 0,
    @ColumnInfo val name :String = "",
    @ColumnInfo val duration:Boolean = false,
    @ColumnInfo val distance:Boolean = false
) {
}
