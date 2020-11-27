package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.Dao
import androidx.room.Query
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDistance
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Dao
interface GoalDistanceDao : GoalDao<GoalDistance> {

    @Query("SELECT * FROM distance_goals")
    fun getAll(): List<GoalDistance>

    @Query("SELECT * FROM distance_goals WHERE id LIKE :id LIMIT 1")
    fun findById(id: Int): GoalDistance

    @Query("SELECT * FROM distance_goals d WHERE d.uid = :uid")
    fun findBySport(uid : Int): List<GoalDistance>

}