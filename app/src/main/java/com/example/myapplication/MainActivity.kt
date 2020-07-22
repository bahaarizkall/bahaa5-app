package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText( context this, text:"THIS IS BRANCH-NUMBER2", Toast.LENGTH_LONG).show()
        Toast.makeText( context this, text:"THIS IS BRANCH-NUMBER2", Toast.LENGTH_LONG).show()


    }
}