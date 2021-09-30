package com.manish.kotlin.basics.clsobj

private fun demop() {

    val dv1 = Dv(11,20)
    val dv2 = Dv(10, 20)

    println( "Dv == ${dv1 == dv2}" )
    println( "Dv === ${dv1 === dv2}" )

    val i1 = 10
    val i2 = 20
    println( "i == ${i1 == i2}" )
    println( "i === ${i1 === i2}" )

    val s1 = "abc"
    val s2 = "abc"
    println(" S1 == ${s1 == s2}")
    println(" S1 === ${s1 === s2}")

    val st1 = String("hi".toByteArray())
    val st2 = String("hi".toByteArray())
    println(" St1 == ${st1 == st2}")
    println(" St1 === ${st1 === st2}")
}
fun main() {
    demop()
}