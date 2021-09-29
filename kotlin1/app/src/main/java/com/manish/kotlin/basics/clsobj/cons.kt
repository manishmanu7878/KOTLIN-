package com.manish.kotlin.basics.clsobj

class Empty1 {  }
class Empty2

class Cls1 constructor(nm : String)
class Cls2(nm : String)
class Cls3(nm : String) {
    val name = nm
    fun whatYourName() = name
}
class Cls4(val name : String) {
    fun whatYourName() = name
}

fun main() {
    val c1 = Cls3("android")
    println("Name is ${c1.whatYourName()}")

    val c2 = Cls3("iOS")
    println("Name is ${c2.whatYourName()}")

    val c3 = Cls4("again android")
    println("Name is ${c3.whatYourName()}")
}