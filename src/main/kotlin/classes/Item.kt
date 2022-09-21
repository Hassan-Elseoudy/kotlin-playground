package classes

class Item() {
    var name: String = ""
    var price: Double = 0.0

        get() {
            println("Inside Getter")
            return field
        }

        set(value) {

        }

    constructor(_name: String) : this() {
        this.name = _name
    }
}

fun main(){

}