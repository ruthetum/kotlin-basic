package variable

fun main(args: Array<String>) {

    // 2. Non-null / Nullable
    // Non-null : null 값 불가능
    // Nullable : null 값 가능

    // var name: String = null // 에러
    // name이 Non-null 타입이기 때문

    // Nullable 타입이 되려면 끝에 물음표를 선언
    var name: String? = null

    // Nullable은 Non-null 할당 가능
    // 반대는 불가능

    // 안전 호출(safe call)
    var firstName: String? = "heedong"
    var lastName: String = "kim"

    // Nullable 타입을 호출할 때 ? 를 사용해서 호출
    print("${firstName?.length}" + ", " + "${lastName.length}")
}