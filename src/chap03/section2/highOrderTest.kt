package chap03.section2

fun highFunc(a:Int, b: Int, sum: (Int, Int)-> Int):Int {
    return sum(a,b)
}

fun more(out: (String) -> String) {
    println(out("Hello"))
}

fun main() {
    val multi = { x:Int, y:Int -> x * y }
    val test = multi(10,2)
    val result = highFunc( 10, 20) {x,y -> x + y}
    more { "$it fsfsd" }
    println(test)
    println(result)
}