package com.lubinskiy.lesson15_16.studentsCheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.lubinskiy.lesson15_16.R

class MainActivity : AppCompatActivity() {
    private lateinit var textViewResult: TextView
    private var checker = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
    }

    private fun initialize() {
        textViewResult = findViewById(R.id.textViewResult)
        checker = intent.hasExtra(STUDENTS)
    }

    fun onClickChoose(view: View?) {
        if (checker) {
            val students = intent?.getStringArrayListExtra(STUDENTS) as ArrayList<String>
            textViewResult.text = students.random()
        } else {
            textViewResult.text = getString(R.string.nothing)
        }
    }

    fun onClickSettings(view: View?) {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}
