package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrimeraPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primera_pantalla)

        val btnToSecond = findViewById<Button>(R.id.btnToSecondActivity)
        btnToSecond.setOnClickListener {
            // Navega a la Segunda Actividad
            val intent = Intent(this, segundaPantalla::class.java)
            startActivity(intent)
        }
    }
}