package com.example.lesson_045.chat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply{
        value = "Chat fragment"
    }
    val text: LiveData<String> = _text
}