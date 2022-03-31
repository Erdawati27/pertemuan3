package id.ac.polbeng.depandi.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 21
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val riska = PersonE("Febriani", "Valentina")
    riska.cetakInfo()
    println()
    val erda = PersonE("Erda", "Wati", 21)
    erda.cetakInfo()
}