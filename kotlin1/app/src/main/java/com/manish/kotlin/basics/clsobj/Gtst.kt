package com.manish.kotlin.basics.clsobj

class Gtst(
    private var xPos : Int
) {
    var x : Int
    get() = this.xPos
    set(value) { this.xPos = value }

}

fun main() {
    val gt1 = Gtst(10)
    gt1.x = 10
    println("${gt1.x}")

}
