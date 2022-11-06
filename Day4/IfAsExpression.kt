fun main () {
    val kms = 205
    val fast = "CBR 600"
    val faster = "Yamaha R1"
    val fastest = "Kawasaki H2R"


    val Ride = if (kms <= 100) {
        println("You will Drive $fast")
        fast
    } else if (kms <= 200){
        println("You will Drive $faster")
        faster
    } else if(kms <=300){
        println("You will Drive $fastest")
        fastest
    }
    else
        println("You need to take a flight")
        kms
}
