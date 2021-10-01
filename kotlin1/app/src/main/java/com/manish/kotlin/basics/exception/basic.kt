package com.manish.kotlin.basics.exception

private class InvalidAgeException(
    private val age: Int
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Entered Age $age is invalid, Age must less than 60"
    }
}

private class InvalidPasswordException(
    private val password: String
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Your entered password $password, is not satisfying criteria"
    }
}

private fun demo1() {
    val age = readLine()?.toInt() ?: 0

    if (age > 60)
        throw InvalidAgeException(age)
}

private fun demo2() {
    println("Enter Age")
    readLine()?.let {
        if (it.toInt() > 60)
            throw Exception("something unwanted happened")
        else println("its good")
    }

    println("Enter Password (No. $ % ^ &)")
    val pass = readLine()
    pass?.let {
        if (it.contains("$")) {
            throw InvalidPasswordException(it)
        } else println("its good")
    }
}

private fun demo3() {


    try {

        var age1 = readLine()?.toInt()
    } catch (e: NumberFormatException) {
        println("You are not entering numbers")
        var age1 = 0
    } finally {

        println("Exception in there or not, this be getting executed")
    }
    println("Executed this line")
}

fun main() {
    demo3()
}