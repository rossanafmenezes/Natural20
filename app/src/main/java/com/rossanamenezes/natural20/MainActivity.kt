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

    }


}