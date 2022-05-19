package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber: EditText
    lateinit var etNumber2: EditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnmultiply: Button
    lateinit var btnModulus: Button
    lateinit var Tvcalculate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnModulus = findViewById(R.id.btnModulus)
        Tvcalculate = findViewById(R.id.Tvcalculate)


        btnAddition.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            addition(num1.toInt(), num2.toInt())
        }
        btnSubtraction.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            subtraction(num1.toInt(), num2.toInt())
        }
        btnmultiply.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            multiplication(num1.toInt(), num2.toInt())
        }

        btnModulus.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            Modulus(num1.toInt(), num2.toInt())

        }
    }

    fun addition(num1: Int, num2: Int) {
        var addition = num1 + num2
        Tvcalculate.text = addition.toString()
    }

    fun subtraction(num1: Int, num2: Int) {
        var subtraction = num1 - num2
        Tvcalculate.text = subtraction.toString()
    }

    fun multiplication(num1: Int, num2: Int) {
        var multiplication = num1 * num2
        Tvcalculate.text = multiplication.toString()
    }

    fun Modulus(num1: Int, num2: Int) {
        var modulus = num1 % num2
        Tvcalculate.text = modulus.toString()
    }
}


