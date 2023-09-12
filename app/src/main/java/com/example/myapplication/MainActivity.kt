


package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val LOG_TAG: String = MainActivity::class.java.getSimpleName()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "	")
        Log.d(LOG_TAG, "onCreate")
        val mMessageEditText = findViewById<EditText>(R.id.editText_main)
        val mReplyHeadTextView =  findViewById<TextView>(R.id.text_header_reply)
        val mReplyTextView =  findViewById<TextView>(R.id.text_message_reply)

    }



    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart");
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart");
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume");
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy");
    }
}