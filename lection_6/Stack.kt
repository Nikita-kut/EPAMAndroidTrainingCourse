class Stack {

    private var stack: List<Stack> = listOf()

    fun push() {
        stack = stack + Stack()
    }

    fun pop(): List<Stack> {
        stack = stack - stack.toMutableList().removeAt(0)
        return stack
    }

}