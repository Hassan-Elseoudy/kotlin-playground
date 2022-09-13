package classes

class Person (private val name: String = "",
              private val age: Int) {


    fun action() {
        println("$name who walks has $age years.")
    }

    init {
        println("This will be executed whatever what")
    }
}

fun main() {
    val person = Person("Hassan", 25)
    person.action()
}