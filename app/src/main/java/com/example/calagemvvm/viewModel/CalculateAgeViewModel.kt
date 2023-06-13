package com.example.calagemvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.calagemvvm.model.Person
import com.example.calagemvvm.repository.CalculateRepoImplement
import com.example.calagemvvm.repository.ICalculateRepo

class CalculateAgeViewModel:ViewModel() {

    val calAgeRepo:ICalculateRepo = CalculateRepoImplement()

    fun calculateAge(name: String, age: String): LiveData<Person> {

        var personMutibleLiveData =  calAgeRepo.CalculateYourAge(name,age)

        return personMutibleLiveData

    }

}