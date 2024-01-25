package mehod

fun main() {
    twoLambda("result", {println("hi")}, {a -> a})
    twoLambda("result", {println("hi")}) {a -> a}
    twoLambda("result", {println("hi")}) {"$it is good"}

}

fun twoLambda(str: String, a: () -> Unit, b: (String) -> String) {
    a()
    println(b(str))
}