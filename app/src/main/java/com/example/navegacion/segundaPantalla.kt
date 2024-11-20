package com.example.navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class segundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Primero, establece el layout
        setContentView(R.layout.activity_segunda_pantalla)

        // Ahora puedes acceder a los botones porque el layout ya está cargado
        val btnToFirst = findViewById<Button>(R.id.btnToFirstActivity)
        val btnToThird = findViewById<Button>(R.id.btnToThirdActivity)

        // Configurar los listeners para los botones
        btnToFirst.setOnClickListener {
            // Regresa a la Primera Actividad
            val intent = Intent(this, PrimeraPantalla::class.java)
            startActivity(intent)
        }

        btnToThird.setOnClickListener {
            // Navega a la Tercera Actividad
            val intent = Intent(this, terceraPantalla::class.java)
            startActivity(intent)
        }
    }
}