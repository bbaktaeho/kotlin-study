package chap04.section1

fun main() {
    val a = 17
    val b = 6

    val max = if (a>b) {
        println("a : $a")
        a
    }else {
        println("b: $b")
        b
    }

    println(max)
}