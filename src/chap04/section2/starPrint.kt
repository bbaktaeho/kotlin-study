package chap04.section2

fun main() {
    print("Enter the lines: ")
    val input = readLine()!!.toInt()

    for (i in 0 until input) {
        println(i)
        for (j in input-2 downTo i) print(" ")
        for (z in 0..(i*2)) print("*")
        println()
    }
}