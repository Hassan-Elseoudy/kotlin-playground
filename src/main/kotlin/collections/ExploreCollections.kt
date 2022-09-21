package collections

fun calculate(x: Int, y: Int, op: (x: Int, y:Int) -> Int) : Int {
    return op(x, y)
}
fun main() {

    val names = listOf<Int>(1, 2, 3)
    println("names : $names")

    val namesMutable = mutableListOf<Int>(1, 2, 3)
    namesMutable.add(4)
    println("names : $namesMutable")

    val set = setOf<Int>(1, 2, 3)
    println("set : $set")

    val setM = mutableSetOf<Int>(1, 2, 3)
    setM.add(4)
    println("set : $setM")

    val map = mapOf("A" to 1, "B" to 2, "C" to 3)
    println("map : $map")

    val mapM = mutableMapOf("A" to 1, "B" to 2, "C" to 3)
    mapM["D"] = 4
    println("map : $mapM")

    val add = { num: Int -> num * 2 }
    val multiply = { x: Int, y: Int -> x * y }

    names.forEach {
        val result = add(it)
        println(result)
    }

    println(calculate(4, 5, multiply))


}