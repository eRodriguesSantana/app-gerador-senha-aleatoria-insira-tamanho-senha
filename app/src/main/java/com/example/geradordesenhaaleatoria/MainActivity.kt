package com.example.geradordesenhaaleatoria

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val caracteres = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvYyWwXxZzÇç!@#$%&*_-+=1234567890"
            val random = Random()

            val txtTamanho = txtTamanho.text.toString()
            val tam = txtTamanho.toInt()

            var senhaGerada = ""
            var index = -1

            for (i in 1..tam) {
                index = random.nextInt(caracteres.length)
                senhaGerada += caracteres.substring(index, index + 1)
            }

            txtFrase.text = senhaGerada
        }
    }
}


