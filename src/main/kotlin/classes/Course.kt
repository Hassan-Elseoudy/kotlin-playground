package classes

data class Course(
    val id: Int,
    val name: String,
    var author: String
)

fun main() {
    val course = Course(1, "Reactive Programming", "Dilip")
    val another_course = Course(1, "Reactive Programming", "Dilip")
    println(course == another_course)
}