package com.manish.kotlin.basics
typealias SimpleFunction = (n: Int) -> String

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
    val fn: (num1: Int, num2: Int)-> Int = fun(n1: Int , n2: Int): Int {
        val amt = 45
        return n1 * n2 + dt + amt

    }
    hi()
    println(fn)
    println(fn(10,20))
}
fun outer(): (n1: Int) -> String {
    /*
        if variable holds integer value its type is Int, so
        if variable holds function value, what its type would be ?
     */

    return fun(n: Int): String {
        return "abc"
    }
}
fun outer2(): SimpleFunction {
    return fun (n: Int): String {
        return "manish"
    }
}


fun main() {
    objDemo()

    fnDemo()
    val fn = outer2()
    val str = fn(10)

    println(fn)
    println(str)


}
