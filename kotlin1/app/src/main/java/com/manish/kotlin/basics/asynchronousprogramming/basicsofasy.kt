package com.manish.kotlin.basics.asynchronousprogramming

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
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

private fun demo3() {
    runBlocking {
        launch { demoCode() }
    }
}

private suspend fun demoCode() {
    for(i in 1..100) {
        delay(1000)
        println(i)
    }
}

private fun demo4() {
    runBlocking {
        demoCoScp()
    }
}

private suspend fun demoCoScp() {
    coroutineScope {
        println("one")
        println("two")
        launch {
            println("three")
            println("four")
        }
        println("five")
        println("six")
    }
}
fun main() {
    demo4()
    val t1 = Thread {

    }
    t1.start()
    t1.suspend()
    t1.state
}
