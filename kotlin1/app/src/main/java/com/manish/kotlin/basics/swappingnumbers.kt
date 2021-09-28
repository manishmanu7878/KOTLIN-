package com.manish.kotlin.basics

fun main() {
    var a = 10
    var b = 20
    var c = 30
    println("Before swapping : ${a} ${b} ${c}")

    a = a + b + c
    c = a - (b + c)
    a = a - (b + c)

    println("After swapping :  ${a} ${b} ${c}")
}