package mehod

fun main() {
    defaultMethod()
    defaultMethod("test")
}

fun defaultMethod(arg: String = "default"): Unit {
    println(arg)
}