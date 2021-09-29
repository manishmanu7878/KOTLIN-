package com.manish.kotlin.basics.conditonals
import java.util.*

fun demo1() {
    println("enter your version:")
    val os = readLine()
    if (os.equals("10")) {
        println("Oreo")
    } else if (os.equals("9")) {
        println("pie")
    } else {
        println("android")
    }
}

fun demo2() {
    println("enter your version:")
    val os = readLine()
    when (os) {
        "10" -> println("oreo")
        "9" -> println("pie")
        "8", "7" -> println("jelly bean")
        else -> println("android")
    }

}
fun demo3() {
    println("Enter Name:")
    val nm = readLine()
    val info = if (nm.equals("android")) 10 else 30
    val dt = when(nm) {
        "123" -> 123
        else -> 23
    }
    println(" info $info dt $dt")
}

fun demo4() {

    val safeNums = intArrayOf(45, 89, 50)
    val `when` = 10
    println("When is ${`when`}")

    val sc = Scanner(System.`in`)
    println("Enter your Number")
    val num = sc.nextInt()


    when(num) {
        in 1..10 -> println("it is in range")
        in safeNums -> println("it is in safe range")
        !in 96..100 -> println("it is not in safe range")
        else -> println("invalid number")
    }
}

fun main() {
    demo4()

}