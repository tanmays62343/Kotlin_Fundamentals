fun main () {
    val l1 = lateinitTest()
    println("The Owner of this program is : ${l1.Owner}")
}

class lateinitTest{

    lateinit var Owner :String

    init {
    Owner = "Tanmay"
    }
}
