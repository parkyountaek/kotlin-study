package mehod

fun main() {
    varArgMethod(1, 2, 3, 4, 5)
    varArgMethod()
}

fun varArgMethod(vararg numbers: Int): Unit {
    for (num in numbers) {
        println(num);
    }
}