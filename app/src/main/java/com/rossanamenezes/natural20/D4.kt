package com.rossanamenezes.natural20

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class D4 : AppCompatActivity() {

    private val TAG = "MyActivity"
    var quantity = 0
    var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d4)

        var buttonDecrease: Button = findViewById(R.id.button_decreased4)
        buttonDecrease.setOnClickListener {
            decrement(it)
        }

        var buttonIncrease: Button = findViewById(R.id.button_increased4)
        buttonIncrease.setOnClickListener{
            increment(it)
        }

        var rollButton: Button = findViewById(R.id.button_roll)
        rollButton.setOnClickListener {

            rollDice()
        }

    }

    private fun rollDice() {

        val diceRange = 1..4
        val randomNumber = diceRange.random()
      displayTotal(randomNumber)
        Log.i (TAG, "total printed")

    }

    private fun displayTotal(total: Int) {

        var textViewTotal: TextView = findViewById(R.id.textView_total)
        textViewTotal.text = total.toString()
    }

    private fun increment(it: View?) {
        quantity+=1
        displayDice(quantity)
        Log.i (TAG, "plus printed")

    }

    private fun decrement(it: View?) {

        quantity-=1
        displayDice(quantity)
        Log.i (TAG, "minus printed")

    }

    private fun displayDice(quantity: Int) {
        var textViewDiceQty: TextView = findViewById(R.id.textView_dice_qty)
        textViewDiceQty.text = quantity.toString()

    }

}








