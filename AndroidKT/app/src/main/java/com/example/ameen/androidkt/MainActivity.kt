package com.example.ameen.androidkt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        calcButton.setOnClickListener{
//
//            //Button clicked
//            val mBirthDay = birthDayNumber.text.toString().toInt()
//            textView.setText(mBirthDay)
//        }

        textAge.text = "Hii"

        calcButton.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.calcButton -> {
                val mBirthDay = birthDayNumber.text.toString().toInt()
                textAge.text = ((Calendar.getInstance().get(Calendar.YEAR) - mBirthDay)).toString()
            }
        }
    }
}