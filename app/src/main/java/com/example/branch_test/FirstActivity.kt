package com.example.branch_test

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        Toast.makeText(applicationContext,"브랜치 테스트 시작하기",Toast.LENGTH_SHORT).show()
    }
}