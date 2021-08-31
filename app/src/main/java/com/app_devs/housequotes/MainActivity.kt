package com.app_devs.housequotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.app_devs.housequotes.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainActivityViewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainActivityViewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.mainViewModel=mainActivityViewModel

        //Sets the LifecycleOwner that should be used for observing changes of LiveData in this binding.
        // If a LiveData is in one of the binding expressions and no LifecycleOwner is set,
        // the LiveData will not be observed and updates to it will not be propagated to the UI.
        binding.lifecycleOwner=this



    }

}