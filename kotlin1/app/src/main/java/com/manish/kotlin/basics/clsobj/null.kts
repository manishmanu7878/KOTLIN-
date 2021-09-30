package com.manish.kotlin.basics.clsobj

import java.util.*

fun main{
    var dt: Date? = null

    if(System.currentTimeMillis() > 5988) { // random condition
        dt = Date()
    }


    println("Time is ${dt!!.time}")


    println("Time is ${dt?.time}")

    if(dt != null) {
        println("Time is ${dt.time}")
    }
}

