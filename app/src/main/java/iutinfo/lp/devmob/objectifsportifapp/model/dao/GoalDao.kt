package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import iutinfo.lp.devmob.objectifsportifapp.model.Goal

interface GoalDao<Goal> {
    @Insert
    fun insert(goal: Goal)

    @Update
    fun update(goal: Goal)

    @Delete
    fun delete(goal: Goal)


}