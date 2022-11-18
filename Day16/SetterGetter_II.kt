package com.trx.kotlinbasics

class Company {
    var name: String = ""
        get() = field        // getter
        set(value) {         // setter
            field = value
        }
}
fun main() {
    val c = Company()
    c.name = "TrX Pvt.ltd."  // access setter
    println(c.name)           // access getter
}
