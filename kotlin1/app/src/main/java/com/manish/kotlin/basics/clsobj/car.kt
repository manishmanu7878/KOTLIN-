package com.manish.kotlin.basics.clsobj

private class car {
    var speed = 10
    fun speedUp() = ++speed
    fun putNthGear(n: Int) {
        println("speed is ${speedUp() * n}")
    }
}

fun main() {
    val c = car()
    println("Speed is ${c.speedUp()}")
    c.putNthGear(2)
}