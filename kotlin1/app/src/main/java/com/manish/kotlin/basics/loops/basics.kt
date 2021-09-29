package com.manish.kotlin.basics.loops

import com.manish.kotlin.main

fun demo1() {
    for (i in 1..10) {
        println("i = $i")
    }
    for (i in 10.downTo(0).step(3)) {
        println("i = $i")
    }
    for (i in 10 downTo 0 step 3) {
        println("i = $i")
    }

}
fun demo2() {
    val nums = intArrayOf(56, 89, 23, 78, 65, 20, 12, 103)

    for (i in nums.indices) {
        println("index = $i , value = ${nums[i]}")
    }
    for (value in nums) {
        println("value = $value")
    }
    for ((index, value) in nums.withIndex()) {
        println("Index is ${index} , Value is ${value}")
    }
    for (i in 0 until nums.size - 2) {
        println(i)
    }
}
fun demo3() {
    var i = 0
    while (i<10) {
        i = i + 1
        println("I is $i")
    }

    var j=0
    do {
        j = j + 1
        println("J is $j")
    }while (j < 10)

}
fun main() {
    demo3()
}


