class PushWorker(private val stack: Stack) : Thread() {

    override fun run() {
        stack.push()
        println("Thread ${currentThread().name} push element from stack")
        sleep(3000)
        interrupt()
        println("Thread ${currentThread().name} is interrupted = ${currentThread().isInterrupted}")
    }


}