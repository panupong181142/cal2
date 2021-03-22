package com.example.linear1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstfragment.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var vr1 = ""

        T1.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(1)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(1)
                show.setText(vr1)
            }
        }

        T2.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(2)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(2)
                show.setText(vr1)
            }
        }

        T3.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(3)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(3)
                show.setText(vr1)
            }
        }

        T4.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(4)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(4)
                show.setText(vr1)
            }
        }


        T5.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(5)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(5)
                show.setText(vr1)
            }
        }

        T6.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(6)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(6)
                show.setText(vr1)
            }
        }

        T7.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(7)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(7)
                show.setText(vr1)
            }
        }

        T8.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(8)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(8)
                show.setText(vr1)
            }
        }

        T9.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("")
                vr1 = show.text.toString().plus(9)
                show.setText(vr1)
            } else {
                vr1 = show.text.toString().plus(9)
                show.setText(vr1)
            }
        }

        T0.setOnClickListener {
            if(show.text.toString() == "0") {
                vr1 = show.text.toString()
            }
            else{
                vr1 = show.text.toString().plus(0)
                show.setText(vr1)
            }


        }
        TC.setOnClickListener{
            vr1 = "0"
            show.setText(vr1)
        }
        TDEL.setOnClickListener{
            if(vr1.length < 2){
                vr1 = "0"
                show.setText(vr1)
            }
            else if(vr1.isNotEmpty()) {
                vr1 = vr1.dropLast(1)
                show.text = vr1
            }
        }

    }
}
