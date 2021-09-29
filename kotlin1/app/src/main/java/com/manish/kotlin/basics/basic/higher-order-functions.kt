package com.manish.kotlin.basics

fun main() {

    val fn1: () -> Int = fun(): Int {
        return 10
    }
    val fn2: () -> Int = { -> 10}//arrow is also optinal
    val fn3: () -> Int = {10}

    val fn4: (st: String) -> Int = fun(st: String): Int {
        return st.length
    }
    val fn5: (st: String) -> Int = {st: String -> st.length}
    val fn6: (st: String) -> Int = {st -> st.length}
    val fn7: (st: String) -> Int = { st -> 10 }
    val fn8: (st: String) -> Int = { 10 }

    val fn9: (st: String, dt: Int, prc: Double) -> Int =
        fun(st: String, dt: Int, prc: Double): Int {
            return 10
        }
    val fn10: (String, Int, Double) -> Unit = { st, dt, prc  -> 10}
        val fn11: (st: String, dt: Int, prc: Double) -> Int = { _, _, _ -> 10}


}