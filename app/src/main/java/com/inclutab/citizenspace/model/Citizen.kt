package com.inclutab.citizenspace.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="citizen_entity")
data class Citizen(
    val name: String,
    val address: String,
    val age: String,
    val occupation: String,
    val maritalStatus: String
) {
    @PrimaryKey(autoGenerate= true)
    var id:Int = 0
}