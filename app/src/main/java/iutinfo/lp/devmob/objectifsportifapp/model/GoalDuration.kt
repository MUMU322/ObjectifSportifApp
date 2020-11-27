package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Duration
import java.util.*

@Entity(
    tableName = "duration_goals",
)
class GoalDuration constructor(
    @PrimaryKey override val id: Int,
    @Embedded override val sport: Sport,
    override val beginDate: Date,
    override val endDate: Date,
    val duration: Duration,
) : Goal {

//    override fun getTimeLeft(): Time {
//        TODO("Not yet implemented")
//    }

    override fun getProgress(): Int {
        TODO("Not yet implemented")
    }
}