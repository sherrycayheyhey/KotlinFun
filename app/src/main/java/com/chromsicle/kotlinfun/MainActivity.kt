package com.chromsicle.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get that TextView!
        var myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.setText(count.toString())
    }

    //this shows the old way to set the text
    fun addButtonClicked(view: View) {
        count++
        myTextView.setText(count.toString())
    }

    //this is the cooler way to set the text
    fun resetButtonClicked(view: View) {
        count = 0
        myTextView.text = count.toString() //wow, so cool ;)
    }
}
