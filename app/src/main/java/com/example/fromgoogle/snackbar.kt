package com.example.fromgoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.fromgoogle.R.color.RedColor
import com.example.fromgoogle.R.color.mtrl_tabs_colored_ripple_color
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_snackbar.*

class snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

       SimpleSnackbarBtn.setOnClickListener(){
           showSimpleSnackbar()
       }
        Snackbar1btn.setOnClickListener(){
            showSnackbar1()
        }
        Snackbar2btn.setOnClickListener(){
            showSnackbar2()
        }
        Snackbar3btn.setOnClickListener(){
            showSnackbar3()
        }

    }


    fun showSimpleSnackbar(){
        val snackbarSimple = Snackbar.make(root_layout,"This is a simple snackbar",Snackbar.LENGTH_LONG)
        snackbarSimple.show()
    }
    fun showSnackbar1(){
        val snackbar1 = Snackbar.make(root_layout,"There will be a close option to dismiss this snackbar",Snackbar.LENGTH_INDEFINITE)
        snackbar1.setAction("Close", View.OnClickListener {
            snackbar1.dismiss()
        })
        snackbar1.show()
    }
    fun showSnackbar2(){
        val snackbar2 = Snackbar.make(root_layout,
            "There will be a close option to dismiss this snackbar and the action button should have a modified color",
            Snackbar.LENGTH_INDEFINITE)
        snackbar2.setAction("Close",View.OnClickListener {
            snackbar2.dismiss()
        })
        snackbar2.setActionTextColor(ContextCompat.getColor(this,R.color.RedColor))
        snackbar2.show()
    }
    fun showSnackbar3(){
        val snackbar3 = Snackbar.make(root_layout,"This is the third and last snackbar",Snackbar.LENGTH_INDEFINITE)
        snackbar3.setAction("Close",View.OnClickListener {
            snackbar3.dismiss()
        })

            snackbar3.setActionTextColor(ContextCompat.getColor(this, RedColor))
            snackbar3.show()
    }
    }



