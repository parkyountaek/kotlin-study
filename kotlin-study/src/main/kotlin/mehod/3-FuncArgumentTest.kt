package mehod

fun main() {
    println(sum(1, 3))
    println(sum2(1, 2))
    println(sum3(1, 3))

    println(mul(sum(1, 3), 3))
    println(mul(sum2(1, 3), 3))
    println(mul(sum3(1, 3), 3))
}

fun sum(a: Int, b: Int) = a + b
fun sum2(a: Int, b: Int): Int {
    return a + b
}
val sum3 = {a: Int, b:Int -> a + b}
fun mul(a: Int, b: Int) = a * b