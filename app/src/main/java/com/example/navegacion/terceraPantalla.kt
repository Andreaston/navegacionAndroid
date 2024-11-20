package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class terceraPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Primero, establece el layout
        setContentView(R.layout.activity_tercera_pantalla)

        val btnToFirst = findViewById<Button>(R.id.btnToFirstActivity)
        val btnToThird = findViewById<Button>(R.id.btnToThirdActivity)

        btnToFirst.setOnClickListener {
            // Regresa a la segunda Actividad
            val intent = Intent(this, segundaPantalla::class.java)
            startActivity(intent)
        }

        btnToThird.setOnClickListener {
            // Navega a la primera Actividad
            val intent = Intent(this, PrimeraPantalla::class.java)
            startActivity(intent)
        }
    }
}