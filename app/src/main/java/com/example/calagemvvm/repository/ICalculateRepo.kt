package com.example.calagemvvm.repository

import androidx.lifecycle.MutableLiveData
import com.example.calagemvvm.model.Person

interface ICalculateRepo {

    fun CalculateYourAge(name:String, age:String): MutableLiveData<Person>

}