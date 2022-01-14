package com.lubinskiy.lesson15_16.studentsCheck

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.lubinskiy.lesson15_16.R

const val STUDENTS = "STUDENTS"

class SettingsActivity : AppCompatActivity() {
    private lateinit var students: List<CheckBox>
    private lateinit var studentsChecked: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        initialize()
    }

    private fun initialize() {
        students = listOf(
            findViewById(R.id.checkBox1),
            findViewById(R.id.checkBox2),
            findViewById(R.id.checkBox3),
            findViewById(R.id.checkBox4),
            findViewById(R.id.checkBox5),
            findViewById(R.id.checkBox6),
            findViewById(R.id.checkBox7),
            findViewById(R.id.checkBox8),
            findViewById(R.id.checkBox9),
            findViewById(R.id.checkBox10),
            findViewById(R.id.checkBox11),
            findViewById(R.id.checkBox12),
            findViewById(R.id.checkBox13)
        )
        studentsChecked = arrayListOf()
    }

    fun onClickSave(view: View?) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putStringArrayListExtra(STUDENTS, data())
        startActivity(intent)
    }

    private fun data(): ArrayList<String> {
        students.forEachIndexed { _, student ->
            if (student.isChecked) studentsChecked.add(student.text.toString())
        }
        return studentsChecked
    }
}
