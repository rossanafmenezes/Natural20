package com.rossanamenezes.natural20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class D6 : AppCompatActivity() {

    var quantity = 0
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d6)

        var buttonDecrease: Button = findViewById(R.id.button_decrease)
        buttonDecrease.setOnClickListener {
            decrement(it)
        }

        var buttonIncrease: Button = findViewById(R.id.button_increase)
        buttonIncrease.setOnClickListener{
            increment(it)
        }

        var rollButton: Button = findViewById(R.id.button_roll)
        rollButton.setOnClickListener {

            rollDice()
        }

        var resetButton : Button = findViewById(R.id.button_reset)
        resetButton.setOnClickListener {

            resetAll()

        }
    }

    private fun resetAll() {
        quantity = 0
        sum = 0
        displayDice(quantity)
        displayTotal(sum)

    }

    private fun rollDice() {

        val diceRange = 1..6
        sum = 0
        for (i in 1..quantity) {

            sum += diceRange.random()
        }

        displayTotal(sum)
    }

    private fun displayTotal(total: Int) {

        var textViewTotal: TextView = findViewById(R.id.textView_total)
        textViewTotal.text = total.toString()
    }

    private fun increment(it: View?) {

        if (quantity == 20) {

            return
        }
        quantity+=1
        displayDice(quantity)

    }

    private fun decrement(it: View?) {

        if (quantity == 0) {

            return
        }

        quantity-=1
        displayDice(quantity)

    }

    private fun displayDice(quantity: Int) {
        var textViewDiceQty: TextView = findViewById(R.id.textView_dice_qty)
        textViewDiceQty.text = quantity.toString()

    }
}