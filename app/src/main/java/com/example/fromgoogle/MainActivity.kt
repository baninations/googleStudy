package com.example.fromgoogle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastsBtn.setOnClickListener(){
            nextActivityToasts()
        }
        SnackbarBtn.setOnClickListener(){
            nextActivitySnackbars()
        }

    }

    fun nextActivityToasts(){
        val Toastsintent = Intent(this,toasts::class.java)
        startActivity(Toastsintent)
    }
    fun nextActivitySnackbars(){
        val SnackbarIntent = Intent(this,snackbar::class.java)
        startActivity(SnackbarIntent)
    }
}