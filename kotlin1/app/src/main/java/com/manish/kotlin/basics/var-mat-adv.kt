package com.manish.kotlin.basics

fun objDemo() {
    val obj = object {
        var dt = 10
        var os = "android"
    }
    println("dt is ${obj.dt} os is ${obj.os}")

}
fun fnDemo() {
    val dt = 10

    fun hi() {
        println("dt is ${dt}")
    }
    val fn = fun(n1: Int , n2: Int): Int {
        val amt = 45
        return n1 * n2 + dt + amt

    }
    hi()
    println(fn)
    println(fn(10,20))
}

fun main() {
    objDemo()

    fnDemo()

}
