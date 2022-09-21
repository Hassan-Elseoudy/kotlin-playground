package classes

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User $userName")
    }

}

fun main() {
    Authenticate.authenticate("Hassan", "NotAPassword")
}