package com.posibolt.twowaydatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var  username = MutableLiveData<String>()
    init {
        username.value = "Francos"
    }
}