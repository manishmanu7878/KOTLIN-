package com.manish.kotlin.basics.array

import java.util.*

fun demo1() {
    val nums = intArrayOf(1, 98, 2, 78, 63, 52 )
    println("0 is ${nums.get(0)}")
    println("1 is ${nums[1]}")
    println(nums.contentToString())

    val intNums = IntArray(5)
    intNums[0] = 45
    intNums[1] = 12
    intNums[2] = 9
    intNums[3] = 96
    intNums[4] = 78

    println(intNums.contentToString())
}

fun demo2() {
    val dates = Array<Date>(5) {Date()}
    println("0th is ${dates[0]}")
    println("0th is ${dates.get(0)}")
    println(dates.contentToString())

    val names = arrayOf<String>("android","ios","linux","mac")
    println(names.contentToString())
}
fun main() {
    demo2()
}