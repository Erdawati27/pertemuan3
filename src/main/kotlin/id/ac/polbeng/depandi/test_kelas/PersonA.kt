package id.ac.polbeng.depandi.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val erda = PersonA("erda", "wati", 21)
    println("Name : ${erda.firstName} ${erda.lastName}")
    println("Age : ${erda.age}")
}