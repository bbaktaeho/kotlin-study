package chap04.section2

fun main() {
    // 5라는 입력을 받게 되면 
    // 12345, 23451, 34512, 45123, 51234끝
    do {
        print("Enter the number: ")
        val input = readLine()!!.toInt()

        for (i in 0 until input) {
            for (j in 0 until input) {
                print((i+j) % input + 1)
            }
            println()
        }
    }while (input != 0)
}