package iutinfo.lp.devmob.objectifsportifapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import kotlin.time.Duration
import java.util.*
import kotlin.time.ExperimentalTime

@Entity(
    tableName = "duration_goals",
    foreignKeys = [
        androidx.room.ForeignKey(
            entity = Sport::class,
            parentColumns = ["uid"],
            childColumns = ["sportId"],
            onDelete = CASCADE
        )]
)
class GoalDuration @ExperimentalTime constructor(
    @PrimaryKey override val id: Int = 0,
    override val sportId: Int = 0,
    @ColumnInfo override val beginDate: Date = Date(),
    @ColumnInfo override val endDate: Date = Date(),
    @ColumnInfo val duration: Duration? = Duration.ZERO
) : Goal {

//    override fun getTimeLeft(): Time {
//        TODO("Not yet implemented")
//    }

    override fun getProgress(): Int {
        TODO("Not yet implemented")
    }
}