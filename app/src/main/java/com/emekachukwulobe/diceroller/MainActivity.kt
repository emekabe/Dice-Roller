package com.emekachukwulobe.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        var resultText: TextView = findViewById(R.id.result_text)

        val randomInt = Random.nextInt(6) + 1

        resultText.text = randomInt.toString()

    }
}
