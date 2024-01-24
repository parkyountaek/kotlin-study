package mehod

fun main() {
    test(::param)
}

fun param(a: String, b: String): String {
    return "hey $a $b"
}


fun test(param: (String, String) -> String): Unit {
    println(param("hi", "kotlin"))
}