package chap04.section1

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

/*    if (score >= 90.0) {
        grade = 'A'
    }else if (score in 80.0..89.9) {
        grade = 'B'
    }else grade = 'C'*/

    grade = when(score) {
        in 90.0..100.0 -> 'A'
        in 80.0..89.9 -> 'B'
        else -> 'C'
    }


    println(grade)
}