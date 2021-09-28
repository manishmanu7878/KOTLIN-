package com.manish.kotlin.basics

fun main() {

    var a = "abc"
    var b = "pqr"
    var c = "xyz"
    println("Before swapping: $a $b $c")

    var temp = ""
    temp = a
    a = c
    c = temp
    println("After swapping: $a $b $c")

}