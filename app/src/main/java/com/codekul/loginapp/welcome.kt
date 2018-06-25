package com.codekul.loginapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_welcome.*

class welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val username = intent.extras.get("nm")
        Log.i("@Codekul","Username = "+username)
        welcomTxt.text = welcomTxt.text.toString() +" "+ username
        Log.i("@Codekul","WelcomeTExt = "+welcomTxt.text)
    }
}
