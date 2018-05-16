package com.example.propa.kotlinfrag

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//lanzamos el primer layout y la activity que se encarga de recoger los datos al pulsar el botón que hay en este
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start.setOnClickListener{
            val datos = Intent(this,Main2Activity::class.java)
                        datos.putExtra("key1","valor1")
                        startActivity(datos)
        }
    }
}
