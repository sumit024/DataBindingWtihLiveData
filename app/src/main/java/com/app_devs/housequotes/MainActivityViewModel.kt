package com.app_devs.housequotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    val quoteLiveData=MutableLiveData<String>("Everybody Lies. The only variable is about what.")
//    val quoteLiveData: LiveData<String>
//    get() = quoteLiveDataObj
    fun nextQuote()
    {
        quoteLiveData.postValue("Truth begins in lies.")
    }

}