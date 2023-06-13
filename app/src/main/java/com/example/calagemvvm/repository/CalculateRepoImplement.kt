package com.example.calagemvvm.repository


import androidx.lifecycle.MutableLiveData
import com.example.calagemvvm.model.Person
import java.util.Calendar

class CalculateRepoImplement : ICalculateRepo {

    override fun CalculateYourAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutableLiveData = MutableLiveData<Person>()

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val yourAge = currentYear - age.toInt()
        val person = Person(name,yourAge)

        infoMutableLiveData.postValue(person)
        return infoMutableLiveData
    }

}