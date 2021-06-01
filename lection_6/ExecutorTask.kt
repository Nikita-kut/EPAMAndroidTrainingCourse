class ExecutorTask : Runnable {
    override fun run() {
        println("Task is run on thread: ${Thread.currentThread().name}")
    }
}