package com.example.thapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textoRecuperado = intent.getStringExtra("texto")
        val resultado = findViewById(R.id.textFinal) as TextView
        resultado.text = textoRecuperado

    }
}