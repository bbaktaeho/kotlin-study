package chap05.section1

fun main() {
//    val score: Int? = 32
//
//    fun checkScore() {
//        if (score != null) {
//            println("Score: $score")
//        }
//    }
//
//    fun checkScoreLet() {
//        score?.let { println("Score: $it") }
//        val str = score.let { it.toString() }
//        println(str)
//    }
//
//    checkScore()
//    checkScoreLet()

    var a = 1
    val b = 2
    a = a.let { it + 2 }.let {
        println("a = $a")
        val i = it + b
        i
    }
    println(a)
}