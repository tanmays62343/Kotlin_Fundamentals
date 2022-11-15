package com.trx.kotlinbasics

fun main (){

    var fastCar = Car("Ford","Mustang",6500)
    var slowCar = Car("MS","MS800")
    slowCar.HorsePower = 800
}

class Car(Company : String , Model : String){
    var HorsePower : Int?  = null

    init{
        println("Company : $Company || Model : $Model" )
    }

    constructor(Company: String , Model: String , HorsePower : Int)
        :this(Company,Model){
            this.HorsePower=HorsePower
        println("Horse Power : $HorsePower")
    }

}
