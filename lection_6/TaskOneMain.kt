fun main() {
    println("Main Thread is run. Thread name: ${Thread.currentThread().name}")

    val thread1 = Thread {
        println("Thread 1 is run. Thread name: ${Thread.currentThread().name}")
        Thread.sleep(5000)

        val thread2 = Thread {
            println("Thread 2 is run. Thread name: ${Thread.currentThread().name}")
            println("Thread 2 is end. Thread name: ${Thread.currentThread().name}")
        }
        thread2.start()
        thread2.join()
        println("Thread 1 is end. Thread name: ${Thread.currentThread().name}")
    }

    thread1.start()
    thread1.join()
    println("Main Thread is end. Thread name: ${Thread.currentThread().name}")
}