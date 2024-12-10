package com.example.lesson_045.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply{
        value = "Home fragment"
    }
    val text: LiveData<String> = _text
}