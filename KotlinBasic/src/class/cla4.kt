package `class`

fun main(args: Array<String>) {
    val car = Car1()
    println(car.getColor())
}

class Car1 constructor(
    var carPrice: Int,
    var carColor: String) {

    constructor(): this(0, "")

    fun getPrice(): Int {
        return carPrice
    }

    init {
        carPrice = 10000
        carColor = "RED"
    }
}

fun Car1.getColor(): String {
    return carColor
}