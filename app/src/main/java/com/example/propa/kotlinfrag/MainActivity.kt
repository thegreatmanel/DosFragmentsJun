package com.example.propa.kotlinfrag

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//prueba commit
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
