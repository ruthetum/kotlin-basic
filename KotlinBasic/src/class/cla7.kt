package `class`

fun main(args: Array<String>) {
    val person = Person7("kim", 24)
    println(person)

    val person1 = Person71("hd", 20)
    println(person1)
}

// 코틀린은 Any 클래스에서 상속받음
// java의 Object가 아니기 때문에 equals(), toString() 같은 멤버를 갖지 않기 않아서 구현해줘야됨
class Person7(val name: String, val age: Int) {
    override fun toString():String {
        return "Person(name=$name, age=$age)"
    }
}

// 이렇게 매번 구현하면 코드가 복잡하지기 때문에 data 키워드를 이용
data class Person71(val name:String, val age: Int)