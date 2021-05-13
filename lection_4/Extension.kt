
val lambda = { printString: String -> println(printString) }

fun User.print(spaceCount: Int = 5, outputPrinter: (String) -> Unit) {
    val spacer = " ".repeat(spaceCount)
//    первый вариант по заданию
//    println("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
    outputPrinter("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
}

fun User.getUserUIModel(): UserUIModel = UserUIModel(name, surname)

inline fun User.printInline(spaceCount: Int = 5, outputPrinter: (String) -> Unit) {
    val spacer = " ".repeat(spaceCount)
//    первый вариант по заданию
//    println("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
    outputPrinter("Name: $name${spacer}Surname: $surname${spacer}Age: $age${spacer}")
}