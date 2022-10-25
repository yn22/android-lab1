package com.example.androidlabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_click_me)
        val textView = findViewById<TextView>(R.id.tv_greeting)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        textView.text = getString(R.string.hello) + " " + viewModel.name
        button.setOnClickListener {
            viewModel.updateName()
            textView.text = getString(R.string.hello) + " " + viewModel.name
        }
    }
}