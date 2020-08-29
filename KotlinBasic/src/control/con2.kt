package control

fun main(args: Array<String>) {
    val alpabet = "ABCDEFGH"
    for (i in alpabet) print("$i ")
    println()

    // 배열 값 바로 접근
    val x: IntArray = intArrayOf(10, 20, 30)
    for (a in x) {
        println("$a ")
    }

    // indices : index로 접근
    for (a in x.indices) {
        println("[$a] : ${x[a]}")
    }

    // withIndex : index와 value 모두 사용
    for ((i, v) in x.withIndex()) {
        println("[$i] : $v")
    }

    // 증감 연산 예제
    for (i in 0..10 step 2) {
        print("$i ")
    }
}