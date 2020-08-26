fun main(args: Array<String>) {

    // 1. var/val

    // 읽기,쓰기가 가능한 일반 변수
    var variable: String = "var"
    // 읽기만 가능한 final 변수
    val valuable: String = "val"

    // 코틀린 변수 선언 형태
    // [var/val] [변수명]: [변수 타입] = [값]

    // 예제
    var name: String = "heedong"
    println("name = $name")
    name = "hd"
    println("name = $name")
}