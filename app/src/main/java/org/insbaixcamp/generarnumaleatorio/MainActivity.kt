package org.insbaixcamp.generarnumaleatorio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val min = findViewById<EditText>(R.id.et_Min)
        val max = findViewById<EditText>(R.id.et_Max)

        val minMas = findViewById<Button>(R.id.B_Min_mes)
        val minMenos = findViewById<Button>(R.id.B_Min_menys)

        val maxMas = findViewById<Button>(R.id.B_Max_mes)
        val maxMenos = findViewById<Button>(R.id.B_max_menys)

        val boton = findViewById<Button>(R.id.Start)
        val resultado = findViewById<TextView>(R.id.Resultat)

        minMas.setOnClickListener {
            min.setText((min.text.toString().toInt() + 1).toString())
        }

        minMenos.setOnClickListener {
            min.setText((min.text.toString().toInt() - 1).toString())
        }


        maxMas.setOnClickListener {
            max.setText((max.text.toString().toInt() + 1).toString())
        }


        maxMenos.setOnClickListener {
            max.setText((max.text.toString().toInt() - 1).toString())
        }


        boton.setOnClickListener {
            val minimo = min.text.toString().toInt()
            val maximo = max.text.toString().toInt()

            val numero = Random.nextInt(minimo, maximo + 1)

            resultado.text = numero.toString()
        }
    }
}
