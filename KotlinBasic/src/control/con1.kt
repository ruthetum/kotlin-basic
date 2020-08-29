package control

fun main(args: Array<String>) {
    println(getBigger(1, 10))

    val a = 1
    // 코틀린에는 when 분기문이 존재 - switch와 유사
    when (a) {
        1 -> println("a : 1")
        2 -> println("a : 2")
        else -> println("a : default") // switch문에서 default 개념이 else
    }
}

// if문이 삼항 연산자 역할을 할 수 있기 때문에
// 코틀린에는 삼항 연산자가 없음
fun getBigger(a: Int, b:Int) : Int {
//    var big = a
//    if (a < b)
//        big = b
//    return big

    return if (a < b) b else a
}