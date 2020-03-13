package com.abs.clase01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val numberOne = button.text.toString().toInt()
            val numberTwo = button2.text.toString().toInt()
            if (numberOne > numberTwo) {
                Toast.makeText(this,"Respuesta Correcta",Toast.LENGTH_LONG).show()
            } else if ( numberOne == numberTwo) {
                Toast.makeText(this,"Respuesta Correcta, pero ojo son iguales",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Respuesta Incorrecta",Toast.LENGTH_SHORT).show()
            }
            setValues()
        }
        button2.setOnClickListener {
            val numberOne = button2.text.toString().toInt()
            val numberTwo = button.text.toString().toInt()
            if (numberOne > numberTwo) {
                Toast.makeText(this,"Respuesta Correcta",Toast.LENGTH_SHORT).show()
            } else if ( numberOne == numberTwo) {
                Toast.makeText(this,"Respuesta Correcta, pero ojo son iguales",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Respuesta Incorrecta",Toast.LENGTH_SHORT).show()
            }
            setValues()

        }
        setValues()
    }

    private fun setValues() {
        button.text = Random.nextInt(0,100).toString()
        button2.text = Random.nextInt(0,100).toString()
    }
}
