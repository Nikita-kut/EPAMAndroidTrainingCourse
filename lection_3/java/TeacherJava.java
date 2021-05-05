public class TeacherJava {

    private String name;
    private String surname;
    private int age;
    private SchoolClass schoolClass;
    private Double workExperience;

    public TeacherJava(String name, String surname, int age, SchoolClass schoolClass, Double workExperience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schoolClass = schoolClass;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Double getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Double workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeacherJava)) return false;
        TeacherJava that = (TeacherJava) o;
        return age == that.age &&
                name.equals(that.name) &&
                surname.equals(that.surname) &&
                schoolClass == that.schoolClass &&
                workExperience.equals(that.workExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, schoolClass, workExperience);
    }

    @Override
    public String toString() {
        return "TeacherJava{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", schoolClass=" + schoolClass +
                ", workExperience=" + workExperience +
                '}';
    }
}
