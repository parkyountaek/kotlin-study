package mehod

import java.util.concurrent.locks.ReentrantLock

var share = 1
fun main() {
    val reLock = ReentrantLock()

    lock(reLock, { add() })
    lock(reLock) { add() }
    lock(reLock, ::add)

    println(share)
}

fun add(){
    share++
}
fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}
