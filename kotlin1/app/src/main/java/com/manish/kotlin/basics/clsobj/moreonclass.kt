package com.manish.kotlin.basics.clsobj

private data class MsInfo(
    val nm: String = "abc",
    val age: Int = 20,
    var isNri : Boolean = false
)

fun main() {
    val d1 = MsInfo()
    println(d1.toString())
}