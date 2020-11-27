package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.Dao
import androidx.room.Query
import iutinfo.lp.devmob.objectifsportifapp.model.Goal
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDuration
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Dao
interface GoalDurationDao : GoalDao<GoalDuration> {

    @Query("SELECT * FROM duration_goals")
    fun getAll(): List<GoalDuration>

    @Query("SELECT * FROM duration_goals WHERE id LIKE :id LIMIT 1")
    fun findById(id:Int) : GoalDuration

    @Query("SELECT * FROM duration_goals d WHERE d.uid = :uid")
    fun findBySport( uid : Int): List<GoalDuration>
}