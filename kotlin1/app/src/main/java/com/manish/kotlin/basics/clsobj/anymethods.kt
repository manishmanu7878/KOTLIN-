package com.manish.kotlin.basics.clsobj

class Dv(
    private val x : Int,
    private val y : Int
)  {

    override fun toString() = " x = $x, y = $y "

    override fun equals(other: Any?): Boolean {
        val oth = other as Dv
        return (this.x == oth.x) && (this.y == oth.y)
    }
}

fun main() {

    val dv1 = Dv(10, 465)

    val dv2 = Dv(10, 465)

    println( dv1.equals(dv2))
    println( dv2.equals(dv1))
}