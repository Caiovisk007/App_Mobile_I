package com.example.violaosobcontrole.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.violaosobcontrole.ResumoConceitos
import com.example.violaosobcontrole.R
import com.example.violaosobcontrole.model.Exercicio

class AdapterExercicio(private val context: Context, private val exercicios: MutableList<Exercicio>) : RecyclerView.Adapter<AdapterExercicio.ExercicioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExercicioViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.exercicio_item,parent,false)
        val holder = ExercicioViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ExercicioViewHolder, position: Int) {
        (holder as? ExercicioViewHolder)?.bind(position, exercicios[position])
    }

    override fun getItemCount(): Int = exercicios.size

    inner class ExercicioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nome = itemView.findViewById<TextView>(R.id.nomeExercicio)
        val descricaoResumo = itemView.findViewById<TextView>(R.id.descricaoExercicio)
        val foto = itemView.findViewById<ImageView>(R.id.imagemSeta)

        fun bind(position: Int,exercicio: Exercicio){

            nome.text = exercicios[position].nome
            descricaoResumo.text = exercicios[position].descricao
            foto.setImageResource(exercicios[position].imageSeta)

            foto.setOnClickListener{
                val detalhesExercicio = Intent(context,ResumoConceitos::class.java)
                detalhesExercicio.putExtra("nome",exercicio.nome)
                detalhesExercicio.putExtra("descricaoResumo",exercicio.descricaoResumo)
                detalhesExercicio.putExtra("fotoResumo",exercicio.fotoExercico)
                detalhesExercicio.putExtra("dica",exercicio.dica)
                context.startActivity(detalhesExercicio)
            }
        }
    }
}