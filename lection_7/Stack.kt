import java.util.concurrent.locks.ReentrantLock

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class Stack {

    private val itemList: MutableList<Int> = mutableListOf()

    private val lock = ReentrantLock()
    private val condition = lock.newCondition()

    private val isEmpty
        get() = itemList.isEmpty()

    fun push() {
        lock.withLock {
            if (isEmpty) {
                itemList.add(1)
                println("Thread ${Thread.currentThread().name} push element from stack")
                condition.signal()
            } else {
                try {
                    condition.await()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun pop() {
        lock.withLock {
            if (!isEmpty) {
                itemList.remove(1)
                println("Thread ${Thread.currentThread().name} pop element from stack")
                condition.signal()
            } else {
                try {
                    condition.await()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
    }
}