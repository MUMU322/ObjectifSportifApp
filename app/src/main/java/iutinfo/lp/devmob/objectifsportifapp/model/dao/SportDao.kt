package iutinfo.lp.devmob.objectifsportifapp.model.dao

import androidx.room.*
import iutinfo.lp.devmob.objectifsportifapp.model.Sport

@Dao
interface SportDao {
    @Query("SELECT * FROM sports")
    fun getAll(): List<Sport>

    @Query("SELECT * FROM sports WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): Sport

    @Insert
    fun insert(sport: Sport)

    @Update
    fun update(sport: Sport)

    @Delete
    fun delete(sport: Sport)
}