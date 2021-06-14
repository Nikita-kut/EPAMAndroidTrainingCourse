import java.util.concurrent.FutureTask

fun main() {

    val future: FutureTask<Stack> = FutureTask(StackFactory())
    Thread(future).start()

    val stack: Stack = future.get()

    val pushWorkerThread = PushWorker(stack)
    val popWorkerThread = PopWorker(stack)

    pushWorkerThread.start()
    popWorkerThread.start()
    Thread.sleep(3000)
    try {
        pushWorkerThread.interrupt()
        popWorkerThread.interrupt()
    } catch (e: InterruptedException) {
        println("Threads has been interrupted")
    }
    println("Thread pushWorkerThread ${pushWorkerThread.name} is interrupted = ${pushWorkerThread.isInterrupted}")
    println("Thread popWorkerThread ${popWorkerThread.name} is interrupted = ${popWorkerThread.isInterrupted}")
}