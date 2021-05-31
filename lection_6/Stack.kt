class Stack {

    private val itemList: MutableList<Stack> = mutableListOf()

    @Synchronized
    fun push() {
        itemList.add(Stack())
    }

    @Synchronized
    fun pop() {
        itemList.remove(Stack())
    }
}