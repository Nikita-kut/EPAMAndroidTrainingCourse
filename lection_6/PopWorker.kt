
class PopWorker(private val stack: Stack) : Thread() {

    override fun run() {
        stack.pop()
        println("Thread ${currentThread().name} pop element from stack")
        sleep(3000)
        interrupt()
        println("Thread ${currentThread().name} is interrupted = ${currentThread().isInterrupted}")
    }

}