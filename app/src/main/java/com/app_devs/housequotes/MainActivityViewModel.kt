package com.app_devs.housequotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    //val quoteLiveDataObj=MutableLiveData<String>("Everybody Lies. The only variable is about what.")
    val quoteLiveData: LiveData<String>
    get() = QuotesRepository.currentQuote
    fun nextQuote()
    {
       QuotesRepository.changeCurrentQuote()
    }

}