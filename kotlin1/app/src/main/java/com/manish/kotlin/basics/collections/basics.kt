package com.manish.kotlin.basics.collections

import java.util.*


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
private fun demo2() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)

    list.forEach {
        if (it > 40) {
            print("$it, ")
        }
    }
    println()

    val filteredList = list.filter { it > 40 }
    println(filteredList.toString())

    val lst = list.findLast { it > 40 }
    println(lst)

    println("First - ${list.first()}")
    println("Last - ${list.last()}")

    val max = list.maxOrNull() ?: -1
    println("Max On List is $max")
}

private fun demo3() {
    val list1 = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)
    val list2 = listOfNotNull(10, 72, 41, 36, 711, 211, 96, 10)

    val commons = list1.filter { list2.contains(it) }
    println(commons)
}

private fun demo4() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)

    val squared = ArrayList<Int>()
    list.forEach { squared.add(it * it) }

    val sqd = list.map { it * it }
    list.map(fun(el): Int {
        return el * el
    })

    println(list)
    println(squared)
    println(sqd)
}
fun myFn(n : Int) : Unit {

}

fun demo5() {
    val list = listOfNotNull(1, 89, 56, 42, 6, 78, 96, 10)
    list.forEach(::println)
    list.forEach(::myFn)
    list.forEach({ el -> print(el) })
    list.forEach{ print(it) }
    list.forEach(fun(n : Int){
        print(n)
    })
}

fun demo6() {
    val set = setOf<String?>("abc", null, "zxv", "pqr", "hij" ,"abc", "lmn")
    set.forEach(::println)

    val set1 = setOf<String?>("abc","zxv", "pqr", "hij" ,"abc", "lmn")
    val arr = set1.toTypedArray()
    val sortedSet = TreeSet<String>(set1)
    sortedSet.forEach(::println)

    println("---------------------")
    println(arr.contentToString())
    Arrays.sort(arr)
    println(arr.contentToString())
}
fun demo7() {
    val kvDs = HashMap<Int, String>()
    kvDs.put(1, "abc")
    kvDs[2]= "pqr"
    kvDs[3]= "lmn"
    kvDs[4]= "xyz"
    kvDs[5]= "def"
    kvDs[6]= "hij"
    kvDs[8]= "hij"

    kvDs.entries.forEach {
            entry -> println("Key - ${entry.key} Value - ${entry.value}")
    }
    kvDs.entries.forEach(::println)

    for ( (k,v) in kvDs ) {
        println("Key - $k Value - $v")
    }
}


fun main() {
    demo7()
}