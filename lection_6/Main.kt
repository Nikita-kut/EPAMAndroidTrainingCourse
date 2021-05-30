
import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun main() {

    // 1 task

    println("UI Thread is run. Thread name: ${Thread.currentThread().name}")

    Thread {
        println("Thread 1 is run. Thread name: ${Thread.currentThread().name}")
        Thread {
            println("Thread 2 is run. Thread name: ${Thread.currentThread().name}")
        }.start()
    }.start()

    // 2 task

    var stack: Stack? = null

    Thread {
        stack = StackFactory().createStack()
        println("Create Stack element from Thread ${Thread.currentThread().name}")
    }.start()

    val popWorkerThread = PopWorker(stack ?: Stack())
    val pushWorkerThread = PushWorker(stack ?: Stack())

    with(pushWorkerThread) {
        start()
        join()
        with(popWorkerThread) {
            start()
        }
    }

    // 3 task

    val mySingleExecutor = Executors.newSingleThreadExecutor()
    with(mySingleExecutor) {
        execute {
            for (i in 0..2) {
                println("Task in thread: ${Thread.currentThread().name}")
            }
        }
        shutdown()
    }
    val myFixedExecutor = Executors.newFixedThreadPool(3)
    for (i in 0..4) {
        val future = myFixedExecutor.submit(Callable {
            "${Thread.currentThread().name}"
        })
        println("${future.get()}")
    }
    myFixedExecutor.shutdown()

    val myCachedExecutor = Executors.newCachedThreadPool()

    with(myCachedExecutor) {
        execute {
            for (i in 0..2) {
                println("Task in thread: ${Thread.currentThread().name}")
            }
        }
        shutdown()
    }

    val myScheduledExecutor = Executors.newScheduledThreadPool(2)
    with(myScheduledExecutor) {
        execute {
            println( "${Thread.currentThread().name}")
            Thread.sleep(3000)
            println( "${Thread.currentThread().name}")
            Thread.sleep(3000)
            println( "${Thread.currentThread().name}")
            Thread.sleep(3000)
        }
        shutdown()
    }


}