package chap05.section2

fun main() {
    data class Person(var name: String, var skills: String)

    val person = Person("임태호", "javascript")

    // 블록 결과를 반환(this 자체에 아무런 영향을 미치지 않음)
    val letResult = person.let {
        it.skills = "kotlin"
        "Success"
    }

    // this 자체를 반환
    val alsoResult = person.also {
        it.skills = "Typescript"
    }

    println(letResult)
    println(alsoResult)
}