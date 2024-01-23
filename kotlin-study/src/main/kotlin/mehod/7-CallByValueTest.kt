package mehod

fun main() {
    callByValue(test())
}

fun callByValue(value: Boolean): Boolean {
    println("call by value")
    return value
}

val test: () -> Boolean = {
    println("hi")
    true
}