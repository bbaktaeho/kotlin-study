package chap03.section1

fun sum(a: Int = 1, b: Int = 5) = a+b
fun max(a:Int,b:Int) = if (a > b) a else b
fun test(vararg a: Int) {
    for (num in a) {
        print(num)
    }
}

fun avgfunc(initial:Float = 0f, vararg numbers: Float): Double {
    var result = 0f
    for (num in numbers) {
        result += num
    }
    println("result: $result , numbers.size: ${numbers.size}")
    val avg = result/numbers.size
    return (avg+initial).toDouble()
}

fun main() {
    val result = avgfunc(5f, 100f,90f,80f)
    println(result)
}