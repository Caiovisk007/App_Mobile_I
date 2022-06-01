package com.example.violaosobcontrole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load

class ResumoConceitos : AppCompatActivity() {

    lateinit var imagem : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo_conceitos)

        val dados = intent.extras
        var nome = dados?.getString("nome")
        var descricaoResumo = dados?.getString("descricaoResumo")
        val foto = dados?.getString("fotoResumo")
        val dica = dados?.getString("dica")

        var nomeView = findViewById<TextView>(R.id.titulodoexercicio)
        nomeView.text = nome

        var descricaoView = findViewById<TextView>(R.id.descricaodoexercicio)
        descricaoView.text = descricaoResumo

        imagem = findViewById(R.id.imagemdoexercicio)
        imagem.load(foto)

        var dicaView = findViewById<TextView>(R.id.dicadoexercicio)
        dicaView.text = dica
    }
}