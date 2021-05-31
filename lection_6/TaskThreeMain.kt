import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun main() {

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
            Thread.currentThread().name
        })
        println(future.get())
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
            println(Thread.currentThread().name)
            Thread.sleep(3000)
            println(Thread.currentThread().name)
            Thread.sleep(3000)
            println(Thread.currentThread().name)
            Thread.sleep(3000)
        }
        shutdown()
    }
}