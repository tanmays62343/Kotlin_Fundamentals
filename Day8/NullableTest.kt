package com.trx.kotlinbasics

fun main() {

    var nullableName : String? = "TANMAY D."

    println(nullableName?.lowercase())
    nullableName?.let { println(it.length) }

    val name = nullableName ?: "Guest"
    println("Name is $name")

}
