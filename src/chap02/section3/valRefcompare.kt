package chap02.section3

fun main() {
    val a:Int = 124 // 컴파일되면 기본형 int 가 되어있음

    val b:Int? = 124 // 컴파일되면 객체가 되어있음

    println(a == b) // true

    println(a === b) // false
}