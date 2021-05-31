class PushWorker(private val stack: Stack) : Thread() {

    override fun run() {
        while (!isInterrupted) {
            stack.push()
            println("Thread ${currentThread().name} push element from stack")
        }
    }
}