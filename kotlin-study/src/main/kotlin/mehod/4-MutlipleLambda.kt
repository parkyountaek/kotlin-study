package mehod

fun main() {
    multipleLambda()()
}

val multipleLambda: () -> () -> Unit = {{println("hi")}}