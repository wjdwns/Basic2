package com.example.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name:String =""
    var phone:String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            name = nameinput.text.toString()
            phone = phoneinput.text.toString()

            Toast.makeText(this,"name : ${name} phone : ${phone}",Toast.LENGTH_SHORT).show()
        }
    }

}