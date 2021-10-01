package com.manish.kotlin.basics.asynchronous

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private fun demo1() {
    println()
    print("one ")
    print("two ")

    Thread {
        print("three ")
        print("four ")
    }.start()

    print("five ")
    print("six ")
    println()
}

private fun demo2() {
    runBlocking {
        println("one")
        println("two")

        launch {
            println("three")
            println("four")
        }

        launch {
            println("five")
            println("six")
        }

        launch {
            println("seven")
            println("eight")
        }

        println("nine")
        println("ten")
    }
}
fun main() {
    demo2()
}
