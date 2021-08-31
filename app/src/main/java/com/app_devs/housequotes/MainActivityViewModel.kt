package com.app_devs.housequotes

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide

class MainActivityViewModel:ViewModel() {
    //val quoteLiveDataObj=MutableLiveData<String>("Everybody Lies. The only variable is about what.")
    val quoteLiveData: LiveData<String>
    get() = QuotesRepository.currentQuote
    fun nextQuote()
    {
       QuotesRepository.changeCurrentQuote()
    }
    val url="https://c4.wallpaperflare.com/wallpaper/265/559/732/house-md-doctor-tablets-hugh-laurie-wallpaper-thumb.jpg"



}