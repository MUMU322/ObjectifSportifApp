package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.Dao
import androidx.room.Query
import iutinfo.lp.devmob.objectifsportifapp.model.GoalDistance
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Dao
abstract class GoalDistanceDao : GoalDao<GoalDistance> {

    @Query("SELECT * FROM distance_goals")
    abstract fun getAll(): ArrayList<GoalDistance>

    @Query("SELECT * FROM distance_goals WHERE id LIKE :id LIMIT 1")
    abstract fun findById(id: Int): GoalDistance

    @Query("SELECT * FROM distance_goals d, sports s WHERE d.sportId == s.uid")
    abstract fun findBySport(sport: Sport): ArrayList<GoalDistance>

}