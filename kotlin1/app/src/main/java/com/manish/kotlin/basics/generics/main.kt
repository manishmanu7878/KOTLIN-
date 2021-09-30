package com.manish.kotlin.basics.generics

import java.util.Date

fun demo8() {
    class Box<T, U>(
    val t : T,
    val u : U
) {
    fun getDt() : T {
        return t
    }

    fun getDu() : U {
        return u
    }
}
}
fun demo9() {
    private class Box<in T, out U>(
        private val t : T,
        private val u : U
    ) {

        fun calc(t : T)  { // t used as input to the function
        }

        fun getDu() : U { // u used to output/return from the function
            return u
        }
    }
}

fun main() {
    val box1: Box<Int, Double> = Box(10, 56.9)
    box1.getDt()
    val box2 = Box<String, Boolean>("abc", true)
    val box3 = Box('c', Date())
}
