package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.*
import androidx.room.ForeignKey.CASCADE
import java.util.*

@Entity(
    tableName = "distance_goals",
)
class GoalDistance(
    @PrimaryKey(autoGenerate = true) override val id: Int,
    override val beginDate: Date,
    override val endDate: Date,
    @Embedded override val sport : Sport,
    val distance: Float? = null

) : Goal {

//    override fun getTimeLeft(): Time {
//        TODO("Not yet implemented")
//    }

    override fun getProgress(): Int {
        TODO("Not yet implemented")
    }
}