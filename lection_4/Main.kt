
typealias NikitaUser = User

fun main() {

    val user = NikitaUser(name = "Nikita", surname = "Kutcyi", age = 25)

    user.print(outputPrinter = lambda)
    println(user.getUserUIModel())
}