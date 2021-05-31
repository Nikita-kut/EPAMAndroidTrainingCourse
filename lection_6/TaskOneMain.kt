fun main() {

    println("Main Thread is run. Thread name: ${Thread.currentThread().name}")

    Thread {
        println("Thread 1 is run. Thread name: ${Thread.currentThread().name}")
        Thread {
            println("Thread 2 is run. Thread name: ${Thread.currentThread().name}")
        }.start()
    }.start()
}