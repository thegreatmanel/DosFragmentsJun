package com.example.propa.kotlinfrag

/**
 * Created by propa on 14/05/2018.
 */

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
class Main2Activity : AppCompatActivity() {
    //lanza el segundo layout que lanza su propio fragment (SecondFragment)
    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main2)
}}