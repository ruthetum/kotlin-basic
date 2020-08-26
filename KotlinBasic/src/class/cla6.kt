package `class`

fun main(args: Array<String>) {
    var student = Student6(20)
    println(student.age)
}

// 상속을 위해서는 open 선언
// java에서 final : 상속 불가능
// kotlin에서 open : 상속 가능
open class Person6(var age: Int)

class Student6(subAge: Int): Person6(subAge)

// 추상 클래스
abstract class Student61 {
    abstract fun learnKotlin()  // 최소 하나 이상의 멤버가 abstract
    fun learnJava() {}
}