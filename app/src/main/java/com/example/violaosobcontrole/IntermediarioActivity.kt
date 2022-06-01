package com.example.violaosobcontrole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.violaosobcontrole.Adapter.AdapterExercicio
import com.example.violaosobcontrole.model.Exercicio

class IntermediarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intermediario)

        val toolbarIntermediario = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarIntermediario)

        val recyclerView_intermediario = findViewById<RecyclerView>(R.id.lista_intermediario)
        recyclerView_intermediario.layoutManager = LinearLayoutManager(this)
        recyclerView_intermediario.setHasFixedSize(true)

        val listaIntermediario: MutableList<Exercicio> = mutableListOf()
        val adapterIntermediario = AdapterExercicio(this,listaIntermediario)
        recyclerView_intermediario.adapter = adapterIntermediario

        val intermediario1 = Exercicio(
            "Intervalos",
            "Entenda um dos principais conceitos da teoria musical",
            R.drawable.seta,
            "Resumidamente, Intervalo é a “distância” entre duas notas musicais. Essa distância é medida em tons e semitons. Por exemplo: Entre a nota Dó e a nota Mi, existe um intervalo de 2 tons. Esse intervalo será classificado de acordo com a ordem natural da notas: Se a nota Dó é a primeira nota da escala, a nota Mi ocupa a terceira posição. Portanto, dizemos que Mi é a terça de Dó. E uma terça é um intervalo de dois tons.",
            "https://musicclan.com.br/wp-content/uploads/2020/05/01-Escala-Do%CC%81-Maior-1024x91.png",
            "Dica: Pratique todas as possiblidades de intervalos, e também os intervalos justos, aumentados e diminutos, que seguem a mesma lógica dos acidentes."
        )
        listaIntermediario.add(intermediario1)

        val intermediario2 = Exercicio(
            "Escala diatônica",
            "Aplicação da escala e exercícios",
            R.drawable.seta,
            "Escala diatônica é uma escala de sete notas com cinco intervalos de tons e dois intervalos de semitons entre as notas. Este padrão se repete a cada oitava nota numa sequência tonal específica. A escala diatônica é típica da música ocidental e concerne à fundação da tradição da música europeia. As escalas modernas maior e menor são diatônicas, assim como todos os sete modos tonais utilizados atualmente. O exemplo a seguir mostra desenhos de escalas em A:",
            "https://juarezbarcellos.files.wordpress.com/2013/01/escala-diatc3b4nica-de-lc3a1-maior-e-fc3a1-menor-cinco-desenhos-para-improvisac3a7c3a3o.jpg",
            "Dica: Pratique cada uma dessas escalas e tente improvisar com elas nas músicas que você gosta e que estejam na tonalidade de A."
        )
        listaIntermediario.add(intermediario2)

        val intermediario3 = Exercicio(
            "Acordes com pestana",
            "Aprenda a fazer a pestana",
            R.drawable.seta,
            "Um tópico que muitos iniciantes correm são os acordes com pestana, pois é preciso apertar com um único dedo todas (ou quase todas) as cordas de uma mesma casa. Mas para que você acostume com esses acordes, pratique os mais usados:",
            "https://paulosousaviolao.com/wp-content/uploads/2021/03/acordes-com-pestana.png",
            "Dica: Quando fizer a pestana, alinhe o seu polegar que está atrás do braço com a pestana que você está fazendo, para obter mais firmeza. Aprender a pestana te abrirá um leque, pois te possibilitará aprender várias músicas que antes não eram possíveis."
        )
        listaIntermediario.add(intermediario3)

        val intermediario4 = Exercicio(
            "Campo harmônico",
            "Entenda tudo por trás das tonalidades",
            R.drawable.seta,
            "A definição de campo harmônico pode ser considerada como o conjunto de acordes gerado pelas notas de uma tonalidade. Na prática, são montados todos os acordes possíveis de serem construídos com as 7 notas daquele tom. Para ter uma referência de estudo, montando os 7 acordes da tonalidade de Dó maior, o resultado é o seguinte: C - Dm - Em - F - G - Am - Bdim. Essa é a única possibilidade, qualquer outro acorde aqui usaria notas fora da tonalidade e fugiria do Campo Harmônico. É interessante reparar que há sempre uma lógica que se repete, independente da tonalidade.",
            "https://www.descomplicandoamusica.com/wp-content/uploads/2014/08/campo-harmonico-formado-por-triade.png",
            "Dica: Decorar pode tornar sua vida mais fácil e trazer respostas mais rápidas. Porém, mais importante do que decorar esses acordes, é entender como chegar nessa resposta. Assim, você conseguirá montar qualquer campo harmônico, de qualquer tonalidade, em poucos minutos. No exemplo foi usada apenas a tonalidade maior, mas o essencial é que você explore todas, como a menor, diminuta, etc."
        )
        listaIntermediario.add(intermediario4)

        val intermediario5 = Exercicio(
            "Principais técnicas",
            "Conheça as principais técnicas do violão",
            R.drawable.seta,
            "Está afim de dar aquela apimentada nos seus solos e colocar mais pegada nas suas frases? Aqui abaixo encontra-se uma lista das principais técnicas para você pesquisar e praticar no seu som. Pratique uma de cada vez e veja de quais você mais vai gostar, é a partir dessas técnicas que você consegue criar sua identidade nos seus solos e improvisos.",
            "https://catracalivre.com.br/wp-content/uploads/2013/12/violao.jpg",
            "Hammer on \n Pull off \n Percussão com o polegar \n Slide \n Abafamento com a mão esquerda \n Técnica de fingerstyle \n Palm Mute \n Bend"
        )
        listaIntermediario.add(intermediario5)

        val intermediario6 = Exercicio(
            "Escala pentatônica",
            "Aplicação da escala e exercícios",
            R.drawable.seta,
            "Essa escala segue um conceito extremamente simples. A escala pentatônica maior é, na verdade, um apanhado de notas que estão na escala maior. Todo mundo sabe que essa escala tem sete notas diferentes, e a escala pentatônica escolheu cinco notas dentre estas sete para criar uma escala completamente diferente. O mesmo vale para a penta menor",
            "https://juarezbarcellos.files.wordpress.com/2013/02/escala-pentatc3b4nica-maior-de-lc3a1.jpg",
            "Dica: A escala pentatônica é utilizada em quase todos os estilos, pouquíssimas vezes em um jazz ou fusion, então tente aplicá-la nas músicas que você gosta, as escalas apresentadas servem para as tonalidades de A e F#m."
        )
        listaIntermediario.add(intermediario6)

        val intermediario7 = Exercicio(
            "Harmônico natural",
            "Aprenda os harmônicos e execute em suas músicas",
            R.drawable.seta,
            "Os harmônicos naturais são sons “escondidos” gerados por apoio leve nas cordas sobre os trastes. Ele consiste em tocar uma corda solta e logo depois encostar o dedo levemente em uma determinada corda próxima ao traste do violão. Para a tocabilidade correta, não faça pressão sobre o traste. Apenas encoste o dedo de leve e logo em seguida, retire.",
            "https://www.michael.com.br/site/blog/wp-content/uploads/2016/09/viol%C3%A3oharmonico-600x305.jpg",
            "Dica: Faça os harmônicos nas cordas G, D e A, pois elas têm mais vibração, e opte pelos trastes 5, 7 e 12, que são os que possuem harmônicos mais presentes."
        )
        listaIntermediario.add(intermediario7)

        val intermediario8 = Exercicio(
            "Acordes relativos",
            "Entenda os acordes relativos e suas aplicações",
            R.drawable.seta,
            "Basicamente, o acorde relativo é o sexto grau do campo harmônico maior, ou seja, o acorde que é o sexto grau no campo harmônico de C é o Am7, consequentemente, seu relativo. Já no campo harmônico menor, o acorde relativo se encontra no terceiro grau. No campo harmônico de Em, seu acorde relativo é o G. Aqui vai uma lista com todos os acordes relativos:",
            "https://i.pinimg.com/originals/1c/f2/66/1cf2669fab3fe098784233768b57061f.png",
            "Dica: Conseguir usar os acodes relativos na harmonia vai abrir sua visão musical. Vale ressaltar que esse é um dos primeiros passos em direção a rearmonização."
        )
        listaIntermediario.add(intermediario8)

        val intermediario9 = Exercicio(
            "Arpejos",
            "Entenda o conceito de arpejos",
            R.drawable.seta,
            "Um arpejo é a execução sucessiva das notas de um acorde. Enquanto que num acorde as notas são tocadas todas de uma vez, no arpejo essas mesmas notas são tocadas uma a uma. Execute o arpejo abaixo:",
            "https://studiosol-a.akamaihd.net/gcs/cifraclub/contrib/img/tutoriais/licao_3_-_arpejos_aumentado1_-_page_1_1172070890.gif",
            "Dica: Depois de treinar esse primeiro exercício, tente encontrar os arpejos de todos os acordes através de suas respectivas notas, ou um arpejo em algum solo de uma música que você goste."
        )
        listaIntermediario.add(intermediario9)

        val intermediario10 = Exercicio(
            "Variação de acordes",
            "Aprenda a variar os acordes ao longo do braço",
            R.drawable.seta,
            "É hora de sair do início do braço através do que chamamos de sistema CAGED. Também chamado de Sistema 5, ele nada mais é do que um método de estudo de acordes, que serve também para escalas, licks e arpejos. A sigla representa as letras das cifras dos cinco acordes mais simples de serem feitos e visualizados, pois não precisam de pestana. São eles: Dó (C), Lá (A), Sol (G), Mi (E) e Ré (D). Bem intuitivo! No sistema CAGED, esses cinco shapes servem de modelo para que você possa encontrar acordes de tonalidades diferentes. Em outras palavras, você não precisa quebrar a cabeça para memorizar vários acordes.",
            "https://studiosol-a.akamaihd.net/gcs/cifra-blog/pt/wp-content/uploads/2022/01/1bd625e-caged_acorde-de-a-1024x345.png",
            "Dica: Transpondo os cinco modelos básicos, você será capaz de fazer acordes em qualquer tonalidade e em todo o braço do instrumento. No exemplo acima, aplicamos o CAGED no acorde de A, mas o ideal é você praticar com todos acordes. É uma carta na manga para você parar de tocar seu repertório apenas no início do braço."
        )
        listaIntermediario.add(intermediario10)
    }
}