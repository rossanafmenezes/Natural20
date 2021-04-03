package com.rossanamenezes.natural20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val buttonD4: ImageButton = findViewById(R.id.imageButton_d4)
        buttonD4.setOnClickListener{

            val intentD4 = Intent(this, D4::class.java)
            startActivity(intentD4)
        }

        val buttonD6: ImageButton = findViewById(R.id.imageButton_d6)
        buttonD6.setOnClickListener{

            val intentD6 = Intent(this, D6::class.java)
            startActivity(intentD6)
        }

        val buttonD8: ImageButton = findViewById(R.id.imageButton_d8)
        buttonD8.setOnClickListener{
            val intentD8 = Intent (this, D8::class.java)
            startActivity(intentD8)
        }

        val buttonD10: ImageButton = findViewById(R.id.imageButton_d10)
        buttonD10.setOnClickListener {
            val intentD10 = Intent(this, D10::class.java)
            startActivity(intentD10)
        }



    }


}