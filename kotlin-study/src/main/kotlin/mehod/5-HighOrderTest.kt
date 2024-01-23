package mehod

fun main() {
    val result: Int = highOrder({ x, y -> x + y}, 3, 4)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b);
}