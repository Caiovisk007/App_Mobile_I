package com.example.violaosobcontrole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.violaosobcontrole.Adapter.AdapterExercicio
import com.example.violaosobcontrole.model.Exercicio

class InicianteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciante)

        val toolbarIniciante = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbarIniciante)

        val recyclerView_iniciante = findViewById<RecyclerView>(R.id.lista_iniciante)
        recyclerView_iniciante.layoutManager = LinearLayoutManager(this)
        recyclerView_iniciante.setHasFixedSize(true)

        val listaIniciante: MutableList<Exercicio> = mutableListOf()
        val adapterIniciante = AdapterExercicio(this,listaIniciante)
        recyclerView_iniciante.adapter = adapterIniciante

        val iniciante1 = Exercicio(
            "Conceitos iniciais I",
            "Seu primeiro pontapé",
            R.drawable.seta,
            "Estamos muito felizes que você tenha dado seu primeiro passo para aprender esse instrumento tão maravilhoso que é o violão. Antes de começar a aprender os primeiros acordes e ritmos, é necessário que você entenda cada parte do violão, pois é com base nisso que você conseguirá entender os diagramas que serão apresentados nas próximas aulas. Essas barrinhas de metal que ficam ao longo do braço são chamadas de trastes, e são contados da esquerda para a direita, assim como as casas, que são os espaços entre os trastes.",
            "https://comoaprendertocarviolao.com/wp-content/uploads/2016/08/violao-partes.png",
            "Dica: Não é necessário gastar muito tempo nessa primeira etapa, assim que aprender cada parte do violão, pode avançar para a próxima aula."
        )
        listaIniciante.add(iniciante1)

        val iniciante2 = Exercicio(
            "Conceitos iniciais II",
            "Seu primeiro pontapé",
            R.drawable.seta,
            "Agora que você conhece cada parte do violão, é hora de falar sobre as cordas. Ao contrário do que muitos pensam, as cordas são contadas de baixo para cima, então a corda mais grossa é a 6ª corda, enquanto a corda mais fina é a 1ª. Vale ressaltar também que cada corda possui sua afinação própria, sendo a primeira corda um Mi (e), a segunda corda um Si (B), a terceira corda um Sol (G), a quarta corda um Ré (D), a quinta corda um Lá (A), e a sexta corda um Mi (E). Não entendeu essas letras entre parênteses? Não se preocupe, são apenas a representação dessas notas na cifra, que você aprenderá nas próximas aulas.",
            "https://musicclan.com.br/wp-content/uploads/2019/11/Nu%CC%81merac%CC%A7a%CC%83o-e-nome-das-cordas-Guitarra-e-Viola%CC%83o.jpg",
            "Dica: Para este módulo, é interessante (mas não uma obrigação) gravar a afinação de cada corda, pois é com base nisso que você aprende a afinar seu violão. Mesmo que você não consiga decorar todas, não se preocupe, com o tempo você vai gravando naturalmente."
        )
        listaIniciante.add(iniciante2)

        val iniciante3 = Exercicio(
            "Conceitos iniciais III",
            "Seu primeiro pontapé",
            R.drawable.seta,
            "Chegou a hora de entender como as suas mãos se comportam com o nosso amigo de 6 cordas. Sua mão esquerda é utilizada para apertar as casas do violão, e cada dedo é numerado, sendo o indicador nomeado como dedo 1, o médio como dedo 2, o anelar como dedo 3 e o mindinho como dedo 4. Já a sua mão direita é usada para fazer os dedilhados e os ritmos, ou seja, as batidas. Cada dedo tem sua abreviação, sendo o polegar o dedo P, o indicador o dedo I, o médio o dedo M e o anelar o dedo A.",
            "https://portalviolaoparatodos.com/wp-content/uploads/2018/12/nomenclatura-das-maos.png",
            "Dica: É de extrema importância que você compreenda como cada dedo se comporta, pois é com base nisso que você entenderá os diagramas de acordes e os exercícios de dedilhado que serão apresentados futuramente."
        )
        listaIniciante.add(iniciante3)

        val iniciante4 = Exercicio(
            "Cifras",
            "Entenda a representação de cada acorde",
            R.drawable.seta,
            "As cifras nada mais são que a representação de cada nota/acorde por uma letra:",
            "https://www.formulaviolao.com/wp-content/uploads/2019/04/cifras-musicais.png",
            "Dica: Tente decorar todas, pois assim ficará muito mais fácil para aprender as músicas, já que você saberá especificamente qual acorde está fazendo."
        )
        listaIniciante.add(iniciante4)

        val iniciante5 = Exercicio(
            "Primeiros acordes",
            "Aprenda a fazer os primeiros acordes",
            R.drawable.seta,
            "Chega de falação! Tá na hora de você pegar esse violão e executar seus primeiros acordes. Nos diagramas abaixo, é como se você tivesse deixado seu violão em pé, então as linhas horizontais representam os trastes e as linhas verticais representam as cordas, sendo a sexta corda (E) a primeira linha da direita e a primeira corda (e) a primeira linha da esquerda. Os números nada mais são do que os dedos da mão esquerda que você deve apertar, e as letras em cima de cada diagrama são as cifras referentes a cada acorde. Os traços em negrito são as pestanas, aqueles acordes em que você coloca o dedo 1 ocupando todas as cordas de uma casa:",
            "https://3.bp.blogspot.com/-TXFHb31F5qk/WlD6cR--K6I/AAAAAAAAC5U/jEzhQ6O6pBM_uO3TbgRKaEyHhWh47D2VQCLcBGAs/s1600/acordes%2Bmaiores%2B%2Be%2Bmenores.jpg",
            "Dica: NÃO tente executar os acordes com pestana agora, comece com os que não tem, pois você já vai sentir uma dor ao apertar as cordas, já que seus dedos ainda não acostumaram, então começar com a pestana seria uma cilada. E muito cuidado para que seus dedos não esbarrem nas cordas vizinhas, senão seu som será abafado, uma boa sacada é tocar uma corda de cada vez e conferir se o som está saindo. De 20 a 30 minutos por dia, pratique os acordes recomendados até o som sair limpo e até seus dedos pararem de doer."
        )
        listaIniciante.add(iniciante5)

        val inicianteTablatura = Exercicio(
            "Tablatura",
            "Aprenda a ler tablaturas para aprender solos",
            R.drawable.seta,
            "Tablatura é um conceito muito simples de entender, é a transcrição de um solo ou exercício específico para o violão, em que a primeira linha é a primeira corda do violão, e a sexta linha é a sexta corda. Os números representam a casa que você deve apertar, e o número 0 representa a corda solta. Tente executar a tablatura abaixo, é a transcrição da cantiga de roda “Atirei o pau no gato”:",
            "https://nossasmelodias.com/wp-content/uploads/2020/05/como-ler-tablatura-3-1.png",
            "Dica: Aprenda por tablatura somente as músicas que você já conhece, pois a tablatura não te dá o ritmo, o que pode ser uma cilada caso tente aprender uma música que você nunca ouviu. Entender os conceitos de tablatura é extremamente essencial para que você consiga entender os exercícios de dedilhado que serão apresentados futuramente."
        )
        listaIniciante.add(inicianteTablatura)

        val iniciante6 = Exercicio(
            "Dedilhado I",
            "Faça seu primeiro dedilhado",
            R.drawable.seta,
            "Para este primeiro exercício de dedilhado, não precisaremos da mão esquerda, pois o exercício consiste em tocar uma corda solta de cada vez. O polegar deve tocar a 6ª corda, o indicador a 3ª, o médio a 2ª e o anelar a 1ª, como na imagem abaixo:",
            "https://www.formulaviolao.com/wp-content/uploads/2019/06/dedilhado.jpg",
            "Dica: Tente fazer uma postura parecida com a da imagem, e não tensione sua mão. Pratique o dedilhado de 20 a 30 minutos. Para não ficar na mesmice, você pode alternar entre os exercícios de dedilhado que virão a seguir."
        )
        listaIniciante.add(iniciante6)

        val iniciante7 = Exercicio(
            "Dedilhado II",
            "Variação do primeiro dedilhado",
            R.drawable.seta,
            "Para este segundo exercício, vamos usar a mão esquerda para fazer os acordes Am e Dm, será excelente para praticar tanto o dedilhado como a troca de acordes:",
            "https://primeirosacordes.com.br/images/stories/violao/dedilhado5b.jpg",
            "Não se preocupe com os elementos abaixo da tablatura, é algo que não nos interessa no momento. Se você não gravou os acordes e os conceitos de tablatura, é recomendado voltar nas aulas específicas para não se perder. Pratique esse exercício junto com o primeiro exercício de dedilhado."
        )
        listaIniciante.add(iniciante7)

        val iniciante8 = Exercicio(
            "Dedilhado III",
            "Sugestões de variação",
            R.drawable.seta,
            "Este exercício é apenas uma variação do exercício anterior, passando agora pelos acordes E7 e Am:",
            "https://primeirosacordes.com.br/images/stories/violao/dedilhado5b.jpg",
            "Depois de treinar esses exercícios, tente criar suas próprias variações e tente usar diferentes acordes, boa diversão!"
        )
        listaIniciante.add(iniciante8)

        val iniciante9 = Exercicio(
            "Primeiros ritmos",
            "Aprenda suas primeiras batidas",
            R.drawable.seta,
            "Chegou a hora de aprender o que popularmente chamamos de batida. Abaixo temos um exemplo de um ritmo de rock/pop rock que é usado na maioria das músicas desse estilo. As setas pra baixo indicam que você deve tocar pra baixo com os dedos I, M e A, e as setas pra cima indicam que você deve tocar pra cima com o dedo P, ou então você pode usar uma palheta ao invés dos dedos.",
            "https://i.pinimg.com/originals/8a/61/b2/8a61b2be9c0b07293aab3d0b70079baf.png",
            "A sugestão é que você pratique os ritmos dos estilos de sua preferência pesquisando na internet, esse exercício é mais como um pontapé para que você não se perca."
        )
        listaIniciante.add(iniciante9)

        val iniciante10 = Exercicio(
            "Sugestões de músicas - Pop Rock",
            "Chegou a hora de criar seu repertório de rock nacional",
            R.drawable.seta,
            "Aqui vai algumas sugestões de músicas para você que gosta de um bom rock e quer criar seu repertório com base nesse maravilhoso estilo.  A ideia é procurar pelas cifras dessas músicas, e de repente uma explicação dos ritmos e solos, para que você não se perca no aprendizado.",
            "https://studiosol-a.akamaihd.net/tb/cifra-blog/pt/wp-content/uploads/2020/07/acorde-simples_violao.jpg",
            "O Passageiro - Capital Inicial \n Last Kiss - Pearl Jam \n Satisfaction - The Rolling Stones \n Alagados - Os Paralamas do Sucesso \n American Idiot - Green Day \n Dias de Lutas, Dias de Glória - Charlie Brown Jr \n Radioactive - Imagine Dragons"
        )
        listaIniciante.add(iniciante10)

        val iniciante11 = Exercicio(
            "Sugestões de músicas - Sertanejo",
            "Anime a galera com seu repertório sertanejo",
            R.drawable.seta,
            "Aqui vai algumas sugestões de músicas para você que gosta de um bom sertanejo e quer criar seu repertório com base nesse maravilhoso estilo.  A ideia é procurar pelas cifras dessas músicas, e de repente uma explicação dos ritmos e solos, para que você não se perca no aprendizado.",
            "https://studiosol-a.akamaihd.net/tb/cifra-blog/pt/wp-content/uploads/2020/07/acorde-simples_violao.jpg",
            "Não Aprendi Dizer Adeus - Leandro & Leonardo \n De Quem é a Culpa - Marília Mendonça \n Cem Mil - Gusttavo Lima \n Evidências - Chitâozinho & Xororó \n Menino da Porteira - Sérgio Reis \n Louca de Saudade - Jorge & Mateus \n Notificação Preferida - Zé Neto e Cristiano"
        )
        listaIniciante.add(iniciante11)

        val iniciante12 = Exercicio(
            "Sugestões de músicas - Pagode",
            "Ganhe aquela moral com um bom repertório de pagode",
            R.drawable.seta,
            "Aqui vai algumas sugestões de músicas para você que gosta de um bom pagode e quer criar seu repertório com base nesse maravilhoso estilo.  A ideia é procurar pelas cifras dessas músicas, e de repente uma explicação dos ritmos e solos, para que você não se perca no aprendizado.",
            "https://studiosol-a.akamaihd.net/tb/cifra-blog/pt/wp-content/uploads/2020/07/acorde-simples_violao.jpg",
            "Cheia de Manias - Raça Negra \n Melhor Eu Ir - Péricles \n Deixa Acontecer - Grupo Revelação \n Sinto Sua Falta - Ferrugem \n Falta Você - Thiaguinho \n É Tarde Demais - Raça Negra \n Até Que Durou - Péricles"
        )
        listaIniciante.add(iniciante12)

        val iniciante13 = Exercicio(
            "Sugestões de músicas - Gospel",
            "Chegou a hora de criar seu repertório gospel",
            R.drawable.seta,
            "Aqui vai algumas sugestões de músicas para você que gosta de um bom gospel e quer criar seu repertório com base nesse maravilhoso estilo.  A ideia é procurar pelas cifras dessas músicas, e de repente uma explicação dos ritmos e solos, para que você não se perca no aprendizado.",
            "https://studiosol-a.akamaihd.net/tb/cifra-blog/pt/wp-content/uploads/2020/07/acorde-simples_violao.jpg",
            "Lugar Secreto - Gabriela Rocha \n Lindo És - Juliano Son \n Aquieta Minh'alma - Ministério Zoe \n Galileu - Fernandinho \n Caminho No Deserto - Soraya Moraes \n Quão Grande É o Meu Deus - Soraya Moraes \n Pai Nosso - Padre Marcelo Rossi \n Eu Navegarei - Harpa Cristã"
        )
        listaIniciante.add(iniciante13)

        val iniciante14 = Exercicio(
            "Sugestões de músicas - Reggae",
            "Dê aquela relaxada com um bom repertório de reggae",
            R.drawable.seta,
            "Aqui vai algumas sugestões de músicas para você que gosta de um bom reggae e quer criar seu repertório com base nesse maravilhoso estilo.  A ideia é procurar pelas cifras dessas músicas, e de repente uma explicação dos ritmos e solos, para que você não se perca no aprendizado.",
            "https://studiosol-a.akamaihd.net/tb/cifra-blog/pt/wp-content/uploads/2020/07/acorde-simples_violao.jpg",
            "Me Namora - Edu Ribeiro \n Outra Vida - Armandinho \n Quero Ser Feliz Também - Natiruts \n Sorri, Sou Rei - Natiruts \n Andei Só - Natiruts \n Pisando Descalço - Maneva \n Redemption Song - Bob Marley"
        )
        listaIniciante.add(iniciante14)

        val iniciante15 = Exercicio(
            "Introdução a teoria musical",
            "Entenda vários conceitos por trás do violão",
            R.drawable.seta,
            "Muitos dos conceitos apresentados anteriormente fazem parte da teoria musical, mas alguns são essenciais para elevar seu nível. As principais notas (Dó, Ré, Mi, Fá, Sol, Lá, Si) fazem parte da escala maior natural, o que muitos não sabem é que entre essas notas existem os acidentes, que são o sustenido e o bemol. O sustenido aumenta a altura da nota em meio tom, já o bemol abaixa.",
            "https://tocandocomestilo.com/wp-content/uploads/2020/01/escala-crom%C3%A1tica-tocando-com-estilo.png",
            "Com esse conjunto de 12 notas, formamos a escala cromática. No violão, um tom corresponde a duas casas de distância, e meio tom/semitom corresponde a uma casa. Repare que entre as notas E e F, e B e C, não existe um acidente."
        )
        listaIniciante.add(iniciante15)
    }
}

