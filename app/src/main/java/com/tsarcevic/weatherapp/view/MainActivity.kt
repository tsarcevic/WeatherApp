package com.tsarcevic.weatherapp.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.tsarcevic.weatherapp.viewmodel.MainActivityViewModel
import com.tsarcevic.weatherapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewModel: MainActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTextView()
        activity_main_button.setOnClickListener {
            Toast.makeText(this, "HEHE", Toast.LENGTH_SHORT).show()
        }
        activity_main_text.setText("ČUDO")
    }

    private fun changeTextView() {
    }
}
