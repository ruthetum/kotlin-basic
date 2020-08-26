package `class`

// 코틀린은 getter/setter 생략 가능
// 생략하지 않고 선언도 가능

fun main(args: Array<String>) {
    var p = Person1(100)
    println(p.name)

    var e = Person2()
    e.age = 50
    println(e.age)
}

// 생략
class Person1(var id: Int) {
    var name: String = "heedong"
}

// getter/setter 선언
// getter/setter 선언 방법 : 프로퍼티 다음에 get()/set() 선언
// setter 선언할 때는 field를 활용해서 값 할당
class Person2() {
    var age: Int = 20
        set(value) {
            field = value
        }
    var name: String = "hd"
        get() = "kim"
}