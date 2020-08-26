package `class`

fun main(args: Array<String>) {
    val student = Person() // new 사용하지 않음
    student.id = 10
    student.name = "kim"
    Person.age = 20

    println("student.id = ${student.id}")
    println("student.name = ${student.name}")
    println("Person.age = ${Person.age}")
}

class Person {
    var id: Int = 0                 // int id
    var name: String = "heedong"    // String name
    companion object {
        // java에서 static 변수 개념
        var age: Int = 0
    }
}