package com.inclutab.citizenspace.db

import androidx.room.*
import com.inclutab.citizenspace.model.Citizen


@Dao
interface DataDao {

    @Insert
    fun create(citizen: Citizen):Long

    @Query("select * from citizen_entity")
    fun retrieveAll():List<Citizen>

    @Update
    fun update(citizen: Citizen)

    @Delete
    fun delete(citizen: Citizen)
}