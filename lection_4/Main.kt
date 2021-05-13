
typealias NikitaUser = User

fun main() {

    val user = NikitaUser("Nikita", "Kutcyi", 25)

    user.print { lambda }
    println(user.getUserUIModel())
}