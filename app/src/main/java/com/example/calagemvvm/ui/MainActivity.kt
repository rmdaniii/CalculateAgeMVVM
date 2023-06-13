package com.example.calagemvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.calagemvvm.R
import androidx.lifecycle.ViewModel
import com.example.calagemvvm.model.Person
import com.example.calagemvvm.viewModel.CalculateAgeViewModel

class MainActivity : AppCompatActivity() {

    lateinit var ageTv:     TextView
    lateinit var nameEdt:    EditText
    lateinit var ageEdt :    EditText
    lateinit var calAgeBtn:  Button

    private val calculateAgeViewModel: CalculateAgeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageTv = findViewById(R.id.your_age_tv)
        nameEdt = findViewById(R.id.name_edt)
        ageEdt = findViewById(R.id.age_edt)
        calAgeBtn = findViewById(R.id.calAge_btn)


        calAgeBtn.setOnClickListener{

            val name = nameEdt.text.trim().toString()
            val age = ageEdt.text.trim().toString()

            calculateAgeViewModel.calculateAge(name, age).observe(this, Observer {  person ->
                ageTv.text = "${person.name} your age: ${person.age}"
            })

        }


    }
}