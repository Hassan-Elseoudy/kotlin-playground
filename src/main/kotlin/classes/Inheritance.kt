package classes

open class User(val name: String) {
    open fun login() {
        println("Inside login")
    }
}

class Student(name: String) : User(name) {
    override fun login() {
        super.login()

        println("Student login")

    }
}

class Instructor(name: String) : User(name) {
    override fun login() {
        super.login()
        println("Instructor login")

    }

}


fun main() {
    val student = Student("Alex")
    println(student.name)
    student.login()
    val instructor = Instructor("Dilip")
    println(instructor.name)
    instructor.login()
}