package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.Dao
import androidx.room.Query
import iutinfo.lp.devmob.objectifsportifapp.model.Goal
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDuration
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Dao
abstract class GoalDurationDao : GoalDao<GoalDuration> {

    @Query("SELECT * FROM duration_goals")
    abstract fun getAll(): ArrayList<GoalDuration>

    @Query("SELECT * FROM duration_goals WHERE id LIKE :id LIMIT 1")
    abstract fun findById(id:Int) : GoalDuration

    @Query("SELECT * FROM duration_goals d, sports s WHERE d.sportId == s.uid")
    abstract fun findBySport(sport: Sport): ArrayList<GoalDuration>
}