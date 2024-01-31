package mehod

fun main() {
    shortFun(3) {
        println("before")
        println("$it")
        return
    }
    shortFun2(3) {
        println("before")
        println("$it")
//        return   // <- return 불가
    }
}

inline fun shortFun(a: Int, b: (Int) -> Unit) {
    println("1")
    b(a)
    println("2")
}

inline fun shortFun2(a: Int, crossinline b: (Int) -> Unit) {
    println("1")
    b(a)
    println("2")
}