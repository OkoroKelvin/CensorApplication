package com.inclutab.citizenspace.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.inclutab.citizenspace.model.Citizen


@Database(entities = arrayOf(Citizen::class), version=1)
abstract class CitizenDatabase: RoomDatabase() {
    abstract fun citizenDao(): DataDao
}