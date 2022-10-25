package com.example.androidlabs

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var name = ""

    fun updateName() {
        val names = arrayOf("John", "Jane", "Mary", "Joe", "Jack", "Jill", "Bob", "Bill", "Ben", "Beth")
        val random = (0..9).random()
        name = names[random]
    }

}