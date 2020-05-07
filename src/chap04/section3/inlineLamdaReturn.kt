package chap04.section3

fun main() {
    labelBreak()
}

fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@ for (j in 1..5) {
            if (j == 3) break
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")
}

inline fun inlineLamda(a:Int, b:Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc() {
    println("Start of func")
    inlineLamda(1,3) lit@{a,b ->
        val result = a+b
        if (result > 10) return@lit
        println("result: $result")
    }
    println("end of Func")
}