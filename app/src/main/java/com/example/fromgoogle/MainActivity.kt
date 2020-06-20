package com.example.fromgoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShortToast.setOnClickListener(){
            Toast.makeText(this, "This is a short toast", Toast.LENGTH_SHORT).show()
        }
        LongToast.setOnClickListener(){
            Toast.makeText(this,"This is a long toast",Toast.LENGTH_LONG).show()
        }
        ToastUL.setOnClickListener(){
          val ULtoast = Toast.makeText(this,"This toast should uppear on the left top corner",Toast.LENGTH_LONG)
            ULtoast.setGravity(Gravity.TOP,-200,0)
            ULtoast.show()
        }
        URtoast.setOnClickListener(){
            val URtoast = Toast.makeText(this,"This should be displayed on the upper right hand corner",Toast.LENGTH_LONG)
            URtoast.setGravity(Gravity.TOP,200,0)
            URtoast.show()
        }


    }
}