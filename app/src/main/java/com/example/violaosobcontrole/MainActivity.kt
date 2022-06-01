package com.example.violaosobcontrole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import coil.load

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView
    lateinit var botaoIniciante : Button
    lateinit var botaoIntermediario : Button
    lateinit var botaoAvancado : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarMain = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarMain)

        image = findViewById(R.id.imagem_violao)
        image.load("https://blog.pajaris.com.br/wp-content/uploads/2020/12/como-tocar-violao-2.jpg")

        botaoIniciante = findViewById(R.id.button_iniciante)
        botaoIniciante.setOnClickListener{
            IrParaIniciante()
        }

        botaoIntermediario = findViewById(R.id.button_intermediario)
        botaoIntermediario.setOnClickListener{
            IrParaIntermediario()
        }

        botaoAvancado = findViewById(R.id.button_avancado)
        botaoAvancado.setOnClickListener{
            IrParaAvancado()
        }
    }

    private fun IrParaIniciante(){
        val telaIniciante = Intent(this,InicianteActivity::class.java)
        startActivity(telaIniciante)
    }

    private fun IrParaIntermediario(){
        val telaIntermediario = Intent(this,IntermediarioActivity::class.java)
        startActivity(telaIntermediario)
    }

    private fun IrParaAvancado(){
        val telaAvancado = Intent(this,AvancadoActivity::class.java)
        startActivity(telaAvancado)
    }
}