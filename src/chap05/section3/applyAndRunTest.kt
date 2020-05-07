package chap05.section3

fun main() {
    data class Person(var name: String, var skills: String)
    
    val person = Person("태호", "C++")
    
    // 반환이 없음(있어도 this), this 만 사용하고 this 로 객체 자신에게 접근함
    person.apply {
        this.name = "임태호"
        skills = "c#"
    }
    println("apply person : $person")
    
    // 반환이 있음!!
    val runTest = person.run {
        name += "ㅋㅋ"
        skills += ", Javascript"
        true
    }
    println(runTest)
    println(person)
}