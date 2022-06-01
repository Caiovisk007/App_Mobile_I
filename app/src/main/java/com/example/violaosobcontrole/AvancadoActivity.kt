package com.example.violaosobcontrole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.violaosobcontrole.Adapter.AdapterExercicio
import com.example.violaosobcontrole.model.Exercicio

class AvancadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avancado)

        val toolbarAvancado = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarAvancado)

        val recyclerView_avancado = findViewById<RecyclerView>(R.id.lista_avancado)
        recyclerView_avancado.layoutManager = LinearLayoutManager(this)
        recyclerView_avancado.setHasFixedSize(true)

        val listaAvancado: MutableList<Exercicio> = mutableListOf()
        val adapterAvancado = AdapterExercicio(this,listaAvancado)
        recyclerView_avancado.adapter = adapterAvancado

        val avancado1 = Exercicio(
            "Introdução a modos gregos",
            "Conceitos iniciais",
            R.drawable.seta,
            "De uma maneira direta, os modos gregos nada mais são do que escalas que se originam dentro de uma outra escala, ou seja, a partir de inversões de escala. Ao reorganizar a ordem das notas que compõem uma escala maior partindo de cada uma das sete notas (transformando-as em tônica) iremos alterar a relação de tons e semitons entre elas, gerando sete novas escalas.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYvNYXw7siJqZ4dsPBSehpjL_u1yVbgyrX6g&usqp=CAU",
            "Dica: Não estudaremos o modo Jônio, pois nada mais é do que a própria escala de Dó maior. Sua principal característica dá-se por ser uma escala maior com intervalo de 4ª justa. Apesar de originalmente ser um modo, foi esta escala que serviu de base no surgimento da música tonal."
        )
        listaAvancado.add(avancado1)

        val avancado2 = Exercicio(
            "Modo dórico",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O modo Dórico surge quando transformamos a segunda nota de uma escala maior em tônica. Sua nota característica é a sexta maior, sendo o único modo menor a possuir tal intervalo, dando origem a uma sonoridade única, livre de tensões, muito distinta dos outros modos menores. É muito presente na música renascentista, na nordestina , e até mesmo no rock, blues e no jazz.",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Dorico.png",
            "Dica: Encontre as formas das escalas dóricas a partir das escalas menores que você já conhece, alterando apenas seu sexto grau."
        )
        listaAvancado.add(avancado2)

        val avancado3 = Exercicio(
            "Sweep em arpejos",
            "Evolua a sua técnica de sweep",
            R.drawable.seta,
            "Sweep é uma técnica em que a palheta move-se como uma vassoura (do inglês sweep: varrer); isto, combinado com o movimento correspondente da mão esquerda, produzindo uma série de notas de sonoridade rápida e fluida. É necessário total sincronismo entre as duas mãos para se obter o efeito de forma fluente. Comece com este primeiro exemplo:",
            "https://tomhess.net/files/images/SweepPickingBasics/CMajor2ndInversion.jpg",
            "Dica: Comece treinando o sweep devagar, para que saia o som de todas as notas e você consiga coordenar o movimento da palheta, aumentar a velocidade com o tempo, e também treinar com outros arpejos. Apesar de ser uma técnica muito utilizada na guitarra, funciona muito bem ao violão."
        )
        listaAvancado.add(avancado3)

        val avancado4 = Exercicio(
            "Modo frígio",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O modo Frígio é a escala originada a partir da terça de uma escala maior. É um modo menor, sua nota característica é a segunda menor, gerando uma sonoridade tensa, misteriosa.",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Frigio.png",
            "Dica: Encontre as formas das escalas do modo frígio a partir das escalas menores que você já conhece, alterando apenas seu segundo grau."
        )
        listaAvancado.add(avancado4)

        val avancado5 = Exercicio(
            "Tapping",
            "Evolua seu tapping",
            R.drawable.seta,
            "O tapping nada mais é do que uma variação do ligado, ou técnica de notas ligadas. Consiste em utilizar uma ou as duas mãos para \"martelar\" (tap) notas na escala do instrumento, ligando-as, adquirindo assim efeito de grande velocidade. O guitarrista Eddie Van Halen foi o responsável por popularizar essa técnica. Comece praticando o primeiro exemplo abaixo:",
            "https://blob.contato.io/machine-user-images/img-49819-20170209190226.png",
            "Dica: Comece treinando o tapping devagar para coordenar o movimento das duas mãos e aumentar a velocidade com o tempo. Depois, tente aplicá-lo nos seus improvisos e nas músicas que você gosta."
        )
        listaAvancado.add(avancado5)

        val avancado6 = Exercicio(
            "Modo lídio",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O modo Lídio é a escala gerada a partir da quarta de uma escala maior. É um modo maior cujo intervalo característico é a quarta aumentada, o que irá definir sua sonoridade espacial, fantasiosa e épica, sendo muito utilizado em trilhas sonoras e no rock.",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Lidio.png",
            "Dica: Encontre as formas das escalas do modo lídio a partir das escalas maiores que você já conhece, alterando apenas seu quarto grau."
        )
        listaAvancado.add(avancado6)

        val avancado7 = Exercicio(
            "Ghost notes",
            "Conceitos para melhorar sua pegada",
            R.drawable.seta,
            "Uma ghost note ou nota fantasma em português é uma nota musical com um valor rítmico, mas nenhum tom discernível quando tocado. Na notação musical, isso é representado por um “X” na tablatura ou partitura para a “cabeça” da nota. Treine esse exercício:",
            "https://everyguitarchord.com/wp-content/uploads/2020/10/ghost-notes.png",
            "Dica: Treine as ghost notes com a mão bem leve e sem tensionamento, para obter melhor fluência e coordenação com as notas limpas."
        )
        listaAvancado.add(avancado7)

        val avancado8 = Exercicio(
            "Modo mixolídio",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O modo Mixolídio surge ao transformarmos a quinta em tônica. Tem como nota característica a sétima menor, gerando tensão em sua sonoridade. É muito utilizado na música nordestina, no blues, no rock e também no jazz.",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Mixolidio.png",
            "Dica: Encontre as formas das escalas do modo mixolídio a partir das escalas maiores que você já conhece, alterando apenas seu sétimo grau."
        )
        listaAvancado.add(avancado8)

        val avancado9 = Exercicio(
            "Palhetada híbrida",
            "Aprenda a coordenar sua palhetada com o dedilhado",
            R.drawable.seta,
            "A palhetada híbrida é a combinação da palhetada regular com o uso dos demais dedos da mão da palheta. Muitas vezes ela também é chamada (ou confundida) com a técnica de chicken picking (muitos consideram o chicken picking um efeito gerado pela palhetada híbrida). De uma forma geral, em um fraseado com a palhetada híbrida, usamos a palheta para digitar as notas mais graves e os dedos para digitar as mais agudas. Treine o seguinte exercício:",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQf-IgXqJkYUnkmCBo7e18o541TtIeKE6dRvLmNAGTcEOI0P-ghsHuco0JvmfWPAxKwxvQ&usqp=CAU",
            "Dica: Nesse exercício, as notas da primeira corda devem ser tocada por algum dedo e não pela palheta. Você pode palhetar normalmente como você sempre faz e explorar todo o conforto e as possibilidades sonoras no que diz respeito ao ataque, dinâmica e o timbre obtido pelo uso dos demais dedos da mão da palheta. Isso vai permitir gerar um timbre diferenciado."
        )
        listaAvancado.add(avancado9)

        val avancado10 = Exercicio(
            "Modo eólio",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O modo Eólio surge a partir da sexta nota da escala maior. Assim como o modo Jônio possui a mesma estrutura de uma escala maior, a estrutura do modo Eólio é exatamente a mesma da escala menor natural, também servindo como base no surgimento da música tonal. ",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Eolio.png",
            "Dica: Sua nota característica é a sexta menor. Por ser uma escala menor, sua sonoridade é mais melancólica, sombria, porém menos tensa do que o modo Frígio. É muito presente em músicas do período da Renascença e em estilos derivados do heavy metal."
        )
        listaAvancado.add(avancado10)

        val avancado11 = Exercicio(
            "Harmônicos artificiais",
            "Execute os harmônicos e aplique nas suas músicas",
            R.drawable.seta,
            "Para esses harmônicos, diferentes dos naturais, são feitos com a corda presa, sendo executados apenas com a mão direita. Para aplicá-lo, coloque a ponta do indicador na altura do traste, e depois utilize qualquer um dos outros dedos da mão direita (polegar, médio, anular ou mindinho) para vibrar a corda. Pode ser feito com palheta também.",
            "https://violaoparainiciantes.com/wp-content/uploads/2017/10/HAMONICO-ARTIFICIAL-VIOLAO.jpg",
            "Dica: Você sempre obterá esses harmônicos a partir dos naturais, então se uma corda estiver solta, seus harmônicos estarão no 5º, 7º e 12º trastes, se pressionar a primeira corda, seus harmônicos estarão no 6º, 8º e 13º trastes, e assim por diante."
        )
        listaAvancado.add(avancado11)

        val avancado12 = Exercicio(
            "Modo lócrio",
            "Entendendo a escala e sua aplicação",
            R.drawable.seta,
            "O último modo gerado a partir da escala de Dó maior é o Lócrio. Suas notas características são a 2ª menor e a 5ª diminuta, o que a torna a única escala diminuta entre os sete modos gregos, possuindo uma sonoridade ainda mais tensa que o modo Frígio. Pode ser encontrado em trechos de obras eruditas e principalmente em riffs de heavy metal.",
            "https://musicclan.com.br/wp-content/uploads/2018/07/Figuras-Tons-e-Semitons-Modos-Gregos-aplicacoes_Locrio.png",
            "Dica: Encontre as formas das escalas do modo lócrio a partir das escalas menores que você já conhece, alterando apenas seu segundo e quinto grau.",
        )
        listaAvancado.add(avancado12)
    }
}