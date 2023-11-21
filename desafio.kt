// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, private val conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun exibirConteudos() {
        println("Conteúdos da formação $nome:")
        conteudos.forEach { println("- ${it.nome} (${it.duracao} minutos)") }
    }
}

fun main() {
    // Criação de objetos para teste
    val usuario1 = Usuario("Usuário 1")
    val usuario2 = Usuario("Usuário 2")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 90)

    val formacaoKotlin = Formacao("Formação Kotlin")
    formacaoKotlin.adicionarConteudo(conteudo1)
    formacaoKotlin.adicionarConteudo(conteudo2)

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    formacaoKotlin.exibirConteudos()

    println("Inscritos na formação ${formacaoKotlin.nome}:")
    formacaoKotlin.inscritos.forEach { println("- ${it.nome}") }
}

