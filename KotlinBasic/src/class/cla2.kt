package `class`

fun main(args: Array<String>) {
    val car = Car()
    println(car.getPrice())
    println(car.getColor())

    val car1 = Car(20000, "BLUE") // 코틀린에서는 추가 생성자 필요 없음
    println(car1.getPrice())
    println(car1.getColor())
}

class Car constructor(
    val carPrice: Int = 10000,
    val carColor: String = "RED"){

    fun getPrice() : Int {
        return carPrice
    }
}

// in JAVA
//class Car {
//    private int carPrice;
//    private String carColor;
//
//    Car() {
//        carPrice = 10000;
//        carColor = "RED";
//    }
//
//    public int getPrice() {
//        return carPrice;
//    }
//}

fun Car.getColor(): String {
    return carColor
}