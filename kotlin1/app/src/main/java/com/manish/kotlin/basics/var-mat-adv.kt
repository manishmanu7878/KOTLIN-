package com.manish.kotlin.basics

fun objDemo() {
    val obj = object {
        var dt = 10
        var os = "android"
    }
    println("dt is ${obj.dt} os is ${obj.os}")
}

fun main() {
    objDemo()
}
