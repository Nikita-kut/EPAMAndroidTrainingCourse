import java.util.concurrent.Callable

class StackFactory : Callable<Stack> {

    override fun call(): Stack {
        println("Create Stack element from Thread ${Thread.currentThread().name}")
        return createStack()
    }

    companion object {
        private fun createStack(): Stack = Stack()
    }
}