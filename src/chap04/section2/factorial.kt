@file:Suppress("UNREACHABLE_CODE")

package chap04.section2

fun main() {
    var result: Int = 1
    var number = readLine()!!.toInt()
    while (number > 1) {
        result *= number
        --number
    }
    print(result)
}