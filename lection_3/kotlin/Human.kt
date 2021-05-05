sealed class Human {
    data class Student(
        val name: String,
        val age: Int,
        val egeScore: Double,
        val schoolClass: SchoolClass,
        val status: Status
    ) : Human()

    data class Teacher(
        val name: String,
        val workExperience: Double,
        val age: Int,
        val status: Status
    ) : Human()

    data class Rector(
        val name: String,
        val workExperience: Double,
        val university: String,
        val status: Status
    ) : Human()
}