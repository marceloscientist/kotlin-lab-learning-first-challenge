// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
/*
A DIO possui
**Formacoes**
incríveis que têm como objetivo oferecer um conjunto de
**ConteudosEducacionais**
voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.
Formacoes possuem algumas características importantes, como
**nome, nivel e seus respectivos conteudosEducacionais**
.
Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio,
definido pela
**capacidade de matricular um ou mais Alunos**.
 */

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome:String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")
    val conteudo3 = ConteudoEducacional("Desenvolvimento Android com Kotlin")

    val formacaoKotlinBasico = Formacao("Kotlin Básico", Nivel.BASICO, listOf(conteudo1, conteudo2))
    val formacaoKotlinAvancado = Formacao("Kotlin Avançado", Nivel.INTERMEDIARIO, listOf(conteudo2, conteudo3))

    val aluno1 = Usuario("João")
    val aluno2 = Usuario("Maria")

    formacaoKotlinBasico.matricular(aluno1)
    formacaoKotlinAvancado.matricular(aluno2)

    // Exibindo informações sobre os inscritos
    println("Inscritos na formação ${formacaoKotlinBasico.nome}: ${formacaoKotlinBasico.inscritos.map { it.nome }}")
    println("Inscritos na formação ${formacaoKotlinAvancado.nome}: ${formacaoKotlinAvancado.inscritos.map { it.nome }}")
}
