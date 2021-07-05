package com.example.branch_test

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        asd()
    }

    fun asd(){
        Toast.makeText(applicationContext,"asdasd",Toast.LENGTH_LONG).show()
    }
}