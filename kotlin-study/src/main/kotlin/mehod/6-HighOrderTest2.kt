package mehod

fun main() {
    val out: () -> Unit = {println("hi")}
    out()

    val new = out
    new()
}