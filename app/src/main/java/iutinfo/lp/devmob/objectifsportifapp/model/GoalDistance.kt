package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "distance_goals",
    foreignKeys = [
        ForeignKey(
            entity = Sport::class,
            parentColumns = ["uid"],
            childColumns = ["sportId"],
            onDelete = CASCADE
        )]
)
class GoalDistance(
    @PrimaryKey override val id: Int = 0,
    @ColumnInfo override val beginDate: Date = Date(),
    @ColumnInfo override val endDate: Date = Date(),
    override val sportId: Int = 0,
    @ColumnInfo val distance: Float? = null

) : Goal {

//    override fun getTimeLeft(): Time {
//        TODO("Not yet implemented")
//    }

    override fun getProgress(): Int {
        TODO("Not yet implemented")
    }
}