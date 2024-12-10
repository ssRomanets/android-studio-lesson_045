package com.example.lesson_045.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply{
        value = "Note fragment"
    }
    val text: LiveData<String> = _text
}