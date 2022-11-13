package com.trx.kotlinbasics

fun main (){
    var Tanmay = person("Tanmay","Deopurkar")
    var Don = person()
}

class person (FirstName : String = "Don", LastName :String = "No1"){

    init{
        println("Object of Person is created with First Name:$FirstName and Last Name:$LastName")
    }
}
