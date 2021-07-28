package com.example.thapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById(R.id.button) as Button

        val textA = findViewById(R.id.editTextA) as EditText
        val textB = findViewById(R.id.editTextB) as EditText
        val textC = findViewById(R.id.editTextC) as EditText

        btnClick.setOnClickListener{

            //Converte os valores dos EditText Para String e Armazena nas variaveis
            var a = textA.text.toString()
            var b = textB.text.toString()
            var c = textC.text.toString()

            //cria um Intent para trocar de telas
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            //cria param para passar parametros para o tela ser chamada
            val param = Bundle()
            var delta = 0.0
            var x1 = 0.0
            var x2 = 0.0

            delta = Math.pow(b.toDouble(),2.0) - 4 * a.toDouble() * c.toDouble()

            if (delta < 0) {

                    var textoParaResultado = "DELTA MENOR QUE ZERO! Não possui valores reais"
                    param.putString("texto", textoParaResultado)
                    intent.putExtras(param)
                    startActivity(intent)
                    textA.text.clear()
                    textB.text.clear()
                    textC.text.clear()
                    textA.requestFocus()

            }
            else {
                x1 = (-b.toDouble() + sqrt(delta)) / (2 * a.toDouble())
                x2 = (-b.toDouble() - sqrt(delta)) / (2 * a.toDouble())
                var textoParaResultado = "X1 = $x1  X2 = $x2"
                param.putString("texto", textoParaResultado)
                intent.putExtras(param)
                startActivity(intent)
                textA.text.clear()
                textB.text.clear()
                textC.text.clear()
                textA.requestFocus()
            }
        }
    }


    }
