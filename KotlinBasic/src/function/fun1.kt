package function

fun main(args: Array<String>) {

    // 멤버 함수 사용
    Date().getDate()

    // 확장 함수 사용
    val a = "apple"
    val b = "banana"
    print(a.getLonggerLength(b))
}

// 1. 멤버 함수 : 클래스 안에 정의된 함수
// class의 instance를 생성해서 메소드 호출
class Date() {
    fun getDate() {
        println("2020-08-26")
    }
}

// 2. 확장 함수
fun String.getLonggerLength(x: String): String {
    return if (this.length > x.length) {
        this
    } else {
        x
    }
}