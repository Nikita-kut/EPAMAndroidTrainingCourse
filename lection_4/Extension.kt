
val lambda = { printString: String -> println(printString) }

fun User.print(countSpace: Int = 5, stringFun: (String) -> Unit) {
    val spacer = Array(countSpace) { ' ' }.joinToString(separator = "")
//    первый вариант по заданию
//    println("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
    lambda("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
}

fun User.getUserUIModel(): UserUIModel = UserUIModel(name, surname)

inline fun User.printInline(countSpace: Int = 5, stringFun: (String) -> Unit) {
    val spacer = Array(countSpace) { ' ' }.joinToString(separator = "")
//    первый вариант по заданию
//    println("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
    lambda("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
}
