package control

fun main(args: Array<String>) {
    println(getBigger(1, 10))
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