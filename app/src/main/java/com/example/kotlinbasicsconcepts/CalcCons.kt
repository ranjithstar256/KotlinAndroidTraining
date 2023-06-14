package com.example.kotlinbasicsconcepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CalcCons : AppCompatActivity() {
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_cons)
        tv=findViewById(R.id.textView)
    }

    fun addd(view: View) {
       tv.setText( add(5.0,6.0).toString())
    }
    fun subb(view: View) {
        tv.setText( sub(60.0,50.0).toString())


    }
    fun mull(view: View) {
        tv.setText(mul(15.0,6.0).toString())


    }
    fun divv(view: View) {
        tv.setText(div(15.0,6.0).toString())
    }
    
    fun add(a : Double,b: Double):Double{
        return a+b
    } 
    fun sub(a : Double,b: Double):Double{
        return a-b
    } 
    fun mul(a : Double,b: Double):Double{
        return a*b
    } 
    fun div(a : Double,b: Double):Double{
        return a/b
    }
}