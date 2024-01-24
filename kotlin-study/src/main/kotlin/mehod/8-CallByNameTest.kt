package mehod

fun main() {
    println(callByName(test2))
}

fun callByName(d: () -> Boolean): Boolean {
    println("call by name")
    return d()
}

val test2: () -> Boolean = {
    println("hi")
    true
}