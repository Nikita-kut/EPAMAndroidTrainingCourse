class TeacherKotlin(
    val name: String,
    val surname: String,
    val age: Int,
    val schoolClass: SchoolClass,
    val workExperience: Double
) {

    //на самом деле можно было создать Data class, но по заданию надо было эти методы переопределить

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TeacherKotlin) return false

        if (name != other.name) return false
        if (surname != other.surname) return false
        if (age != other.age) return false
        if (schoolClass != other.schoolClass) return false
        if (workExperience != other.workExperience) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + age
        result = 31 * result + schoolClass.hashCode()
        result = 31 * result + workExperience.hashCode()
        return result
    }

    override fun toString(): String {
        return "TeacherKotlin(name='$name', surname='$surname', age=$age, schoolClass=$schoolClass, workExperience=$workExperience)"
    }


}