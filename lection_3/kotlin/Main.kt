fun main() {
    // 1 task
    println("---1 task---")
    val teacherKotlinA = TeacherKotlin("A", "A", 5, SchoolClass.A, 2.0)
    val teacherKotlinB = TeacherKotlin("B", "B", 5, SchoolClass.B, 2.0)
    val teacherJavaA = TeacherJava("A", "A", 5, SchoolClass.A, 2.0)
    val teacherJavaB = TeacherJava("B", "B", 5, SchoolClass.B, 2.0)

    println("Teacher Kotlin A equals Teacher Kotlin B = ${teacherKotlinA == teacherKotlinB} ")
    println("Teacher Java A equals Teacher Java B = ${teacherJavaA == teacherJavaB} ")

    // 2 task
    val car = Car(Color.BLACK, "Audi", 4, 6)
    car.displayTransportInfo()
    val moto = Moto(Color.RED, "Yamaha", 2, 2)
    moto.displayTransportInfo()
    val bus = Bus(Color.GREEN, "Bus", 8, 30)
    bus.displayTransportInfo()

    // 3 task

    // 4 task
    val student = Human.Student("A", 15, 5.0, SchoolClass.A, Status.NOT_MARRIED)
    val teacher = Human.Teacher("B", 15.3, 35, Status.MARRIED)
    val rector = Human.Rector("C", 35.5, "MIT", Status.MARRIED)

}