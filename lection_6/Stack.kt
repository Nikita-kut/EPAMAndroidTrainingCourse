import java.util.concurrent.locks.ReentrantLock

class Stack {

    private val itemList: MutableList<Stack> = mutableListOf()

    private val lock = ReentrantLock()
    private val condition = lock.newCondition()

    private val isEmpty
        get() = itemList.isEmpty()

    @Synchronized
    fun push() {
        if (isEmpty) {
            itemList.add(Stack())
            condition.signal()
        } else {
            condition.await()
        }
    }

    @Synchronized
    fun pop() {
        if (!isEmpty) {
            itemList.remove(Stack())
            condition.signal()
        } else {
            condition.await()
        }
    }
}