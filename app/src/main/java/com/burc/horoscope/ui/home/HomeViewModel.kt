package com.burc.horoscope.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val text_example = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text1: LiveData<String> = text_example
}