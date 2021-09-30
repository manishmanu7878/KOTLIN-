package com.manish.kotlin.basics.collections

import java.util.LinkedList

private fun demo1(){
    val list = LinkedList<String>()
    list.add("abc")
    list.add("pqr")
    list.add("zyc")
    list.add("lmn")

    list.forEach {
        println(it)
    }

    list.forEach() { el ->
        println(el)
    }

    list.forEach { el ->
        println(el)
    }

    list.forEach(fun (el){
        println(el)
    })
}

fun main() {
    demo1()
}