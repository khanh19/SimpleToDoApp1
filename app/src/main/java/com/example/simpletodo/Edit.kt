package com.example.simpletodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val textView = findViewById<TextView>(R.id.editor)
        val butt = findViewById<Button>(R.id.butto)
        val ele = intent.getStringExtra("EXTRA_VALUE")
        textView.text = ele
    }
}