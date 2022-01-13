package com.inclutab.citizenspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.inclutab.citizenspace.databinding.ActivityDataFormBinding
import com.inclutab.citizenspace.databinding.ActivityMainBinding
import com.inclutab.citizenspace.db.CitizenDatabase
import com.inclutab.citizenspace.model.Citizen

class DataForm : AppCompatActivity() {

    private lateinit var binding: ActivityDataFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addButton = binding.addButton
        val name = binding.nameInputEditField.text.toString()
        val address = binding.addressInputEditField.text.toString()
        val age = binding.ageInputEditField.text.toString()
        val occupation = binding.occupationInputEditField.text.toString()
        val maritalStatus = binding.maritalInputEditField.text.toString()

        addButton.setOnClickListener {
            val citizen: Citizen = Citizen(
            name, address, age, occupation, maritalStatus
            )

            val dataBase : CitizenDatabase = Room.databaseBuilder(
                applicationContext,
                CitizenDatabase::class.java,
                "citizen_db")
                .allowMainThreadQueries().build()

            dataBase.citizenDao().create(citizen)
        }


    }
}