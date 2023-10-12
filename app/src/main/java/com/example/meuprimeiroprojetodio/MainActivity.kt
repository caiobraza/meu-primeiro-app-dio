package com.example.meuprimeiroprojetodio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//class MainActivity : AppCompatActivity() {
    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //O desafio sera criar um valor dentro do string.xml
        // E trocar o texto do xml e tornar internacional (USA, Espanhol, etc...)
class MinhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minha)

        val welcomeMessage = getString(R.string.welcome_message)
        // Use a variável welcomeMessage onde você deseja exibir a saudação.
    }
}

