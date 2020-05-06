package chap04.section2

fun main() {
    var total = 0
    for (num in 2..100 step 2) total += num // 홀수 합

    println(total)

}