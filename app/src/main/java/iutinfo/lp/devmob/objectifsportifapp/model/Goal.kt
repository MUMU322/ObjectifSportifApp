package iutinfo.lp.devmob.objectifsportifapp.model

import java.util.*

/**
 * Model for a goal
 * @param beginDate begining date of this goal
 * @param endDate ending date of this goal
 * @param sport sport practiced with this goal
 */
interface Goal {

    val id: Int
    val beginDate: Date
    val endDate: Date
    val sportId: Int

    //var duration: Duration? = null
    //var distance: Float? = null
    //fun getTimeLeft(): Time
    fun getProgress(): Int


}