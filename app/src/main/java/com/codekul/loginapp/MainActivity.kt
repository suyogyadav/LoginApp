package com.codekul.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = user.text

        btnLogin.setOnClickListener{
        /*val intent = Intent(this,welcome::class.java)
            intent.putExtra("nm",username)
            startActivity(intent)*/
            hello.text = hello.text.toString()+ username

            Toast.makeText(this,"login successful",Toast.LENGTH_SHORT).show()
        }

        /*chk.setOnClickListener {
            if(chk.isChecked) {
                pass.inputType = InputType.TYPE_CLASS_TEXT
            }
            if(!chk.isChecked)
            {
                pass.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }*/
        chk.setOnCheckedChangeListener { compoundButton, b ->

            if (b){
                pass.transformationMethod = HideReturnsTransformationMethod()
            }else{
                Log.i("@codekul","else entered")
                pass.transformationMethod= PasswordTransformationMethod.getInstance()
            }
        }
    }

}
