package com.abs.clase01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        button.setOnClickListener {
            reviewResult(button,button2)
        }
        button2.setOnClickListener {
            reviewResult(button2,button)
        }
    }
    private fun reviewResult(pressedButton: Button, unpressedButton: Button) {
        val numberOne = pressedButton.text.toString().toInt()
        val numberTwo = unpressedButton.text.toString().toInt()
        if (numberOne >= numberTwo)  showAlert("Respuesta Correcta")  else showAlert("Respuesta Incorrecta")
        setValues()
    }

    private fun showAlert(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    private fun setValues() {
        button.text = Random.nextInt(0,100).toString()
        button2.text = Random.nextInt(0,100).toString()
    }
}
