package com.manish.kotlin.basics.loops

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

    for(i in nums.indices) {
        println("index = $i , value = ${nums[i]}")
    }
    for(value in nums) {
        println("value = $value")
    }
    for((index, value) in nums.withIndex()) {
        println("Index is ${index} , Value is ${value}")
    }

}
fun main() {
    demo2()
}