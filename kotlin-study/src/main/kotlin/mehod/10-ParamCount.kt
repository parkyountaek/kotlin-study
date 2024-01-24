package mehod

fun main() {
    noParam { "yes" }
    noParam({ "hello" })
    noParam(a)
}

val a: () -> String = { "hi" }
fun noParam(out: () -> String) = println(out())