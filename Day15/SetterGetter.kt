
fun main () {
    var L2 = SetterGetterTest("Setter Getter Program")
    println("The Owner of this program is : ${L2.Owner}")

    println("The Program is of :${L2.PRG}")
    L2.PRG= "Setter Getter"


}

class SetterGetterTest(PR : String){

    lateinit var Owner :String
    init {
        Owner = "Tanmay"
    }

    var PRG : String = PR
    get() = field
    set(value){
        field = value
    }

}
