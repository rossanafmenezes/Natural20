package com.rossanamenezes.natural20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val buttonD4: ImageButton = findViewById(R.id.imageButton_d4)
        buttonD4.setOnClickListener{

            val intentD4 = Intent(this, D4Activity::class.java)
            startActivity(intentD4)
        }

        val buttonD6: ImageButton = findViewById(R.id.imageButton_d6)
        buttonD6.setOnClickListener{

            val intentD6 = Intent(this, D6Activity::class.java)
            startActivity(intentD6)
        }

        val buttonD8: ImageButton = findViewById(R.id.imageButton_d8)
        buttonD8.setOnClickListener{
            val intentD8 = Intent (this, D8Activity::class.java)
            startActivity(intentD8)
        }

        val buttonD10: ImageButton = findViewById(R.id.imageButton_d10)
        buttonD10.setOnClickListener {
            val intentD10 = Intent(this, D10Activity::class.java)
            startActivity(intentD10)
        }

        val buttonD12: ImageButton = findViewById(R.id.imageButton_d12)
        buttonD12.setOnClickListener {
            val intentD12 = Intent(this, D12Activity::class.java)
            startActivity(intentD12)
        }

        val buttonD20: ImageButton = findViewById(R.id.imageButton_d20)
        buttonD20.setOnClickListener {
            val intentD20 = Intent (this, D20Activity::class.java)
            startActivity(intentD20)
        }


    }


}