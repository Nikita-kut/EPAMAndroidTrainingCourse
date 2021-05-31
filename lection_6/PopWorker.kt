class PopWorker(private val stack: Stack) : Thread() {

    override fun run() {
        while (!isInterrupted) {
            stack.pop()
            println("Thread ${currentThread().name} pop element from stack")
        }
    }
}