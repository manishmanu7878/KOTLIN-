package com.manish.kotlin.basics

fun simple(): Int {
    return 10
}

fun addition(num1: Int, num2: Int): Int {
    return num1 + num2

}

fun rtntyp(): Unit {
    println("Just call")
}

fun main() {
    val ab = simple()
    println("ab is $ab")
    println("Addition is ${addition(12, 3)}")
    rtntyp()
}