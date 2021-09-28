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

fun nTimes(num: Int, n: Int) = n * num

fun defaultValues(
    num1: Int = 30,
    num2: Int = 20
): String {
    return "Num1 = ${num1} , Num2 = ${num2}"

}

infix fun Int.sq(n: Int) = n * n

fun main() {
    val ab = simple()
    println("ab is $ab")
    println("Addition is ${addition(12, 3)}")
    rtntyp()

    println("10 * 3 times is ${nTimes(10, 3)}")
    println("default values() ${defaultValues()}")
    println("defaultValues(89,56) ${defaultValues(89, 56)}")
    println("defaultValues(num2 = 4555, num1= 10) ${defaultValues(num2 = 4555, num1 = 10)}")
    println("defaultValue(num2=878) ${defaultValues(num2 = 878)}")

    println("Square is ${1 sq 2}")
    println("Square is ${1.sq (2)}")
}