package com.manish.kotlin.basics.conditonals

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
    when(os) {
        "10" -> println("oreo")
        "9" -> println("pie")
        "8","7" -> println("jelly bean")
        else -> println("android")
    }

}
fun main() {
    demo2()

}