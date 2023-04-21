package com.example.pr2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class  nezn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nezn)



    }

    fun next2(view: View) {
        val intent= Intent(this,Pizza1_page::class.java)
        startActivity(intent)
        finish()
    }
}
