class PopWorker(private val stack: Stack) : Thread() {

    override fun run() {
        while (!isInterrupted) {
            stack.pop()
        }
    }
}