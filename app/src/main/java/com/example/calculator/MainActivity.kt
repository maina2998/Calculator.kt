package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNum1 = findViewById<EditText>(R.id.etNum1)
        var etNum2 = findViewById<EditText>(R.id.etNum2)
        var Button = findViewById<Button>(R.id.btnsum)
        var button2 = findViewById<Button>(R.id.btnminus)
        var button3= findViewById<Button>(R.id.btnmultiply)
        var button4= findViewById<Button>(R.id.btnmodulus)
        var tvResults = findViewById<TextView>(R.id.tvresultLBl)

        Button.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
            var input1=etNum1.text.toString().toInt()
            var input2=etNum2.text.toString().toInt()
            var sum=input1+input2
            tvResults.text="${sum}"
    }}
    Button.setOnClickListener {
        if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
            Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
        }else{
            var input1=etNum1.text.toString().toInt()
            var input2=etNum2.text.toString().toInt()
            var product=input1-input2
            tvResults.text="${product}"
    }}
        Button.setOnClickListener {
        if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
            Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
        }else{
            var input1=etNum1.text.toString().toInt()
            var input2=etNum2.text.toString().toInt()
            var multiply=input1*input2
            tvResults.text="${multiply}"
    }}
        Button.setOnClickListener {
            if(etNum1.text.toString()==""|| etNum2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_LONG).show()
            }else{
                var input1=etNum1.text.toString().toInt()
                var input2=etNum2.text.toString().toInt()
                var remainder=input1%input2
                tvResults.text="${remainder}"
    }}}}

