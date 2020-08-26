package `class`

fun main(args: Array<String>) {
    val name: String? = "Kim"

    // let : null 체크해서 null이 아닐 때 값 사용
    name?.let {
        println(it)
    }

    val name2: String? = null
    name2?.let {
        println(it) // null 이라 출력 안됨
    }


    // lateinit 예제
    val myName = MyName()
    myName.initName()
    myName.printName()


    // lazy : 초기화 시 무거운 동작을 하는 경우 사용 (시간 허비를 막기 위해)
    // 실제 해당 변수가 사용될 때 초기화됨
    val name1 = MyName()
    val allName by lazy { name1.loadNameList() }
    // 여기까지는 초기화 안 되고 있다가
    allName // 이렇게 사용할 때 초기화
}

class MyName {
    // 프로퍼티를 초기화하지 않으면 error 발생
    // lateinit을 쓰면 나중에 초기화 가능
    private lateinit var name: String
    fun initName() {
        name = "hd"
    }
    fun printName() {
        println("name = $name")
    }

    fun loadNameList(): List<String> {
        println("loading data...")
        return listOf("A", "B", "C", "...")
    }
}