package com.manish.kotlin.basics.companionobjects

class DbConnector {

    private val nm = "nnn"
    val dbNm = "nnn"

    companion object {
        val url = "http://abc.com"
        val userName = "acc"
        val PASSWORD = "acbv"

        fun crackPassword() {

            println("Accessing URL $url")
        }
    }

    fun connect() {
        println("Accessing URL $url")

        crackPassword()
    }
}

fun main() {
    val dc = DbConnector()
    dc.connect()

    println("Url - ${DbConnector.url}")
    println("User Name - ${DbConnector.userName}")
    println("Password - ${DbConnector.PASSWORD}")
    DbConnector.crackPassword()

    val cmp = DbConnector
    cmp.userName
    cmp.crackPassword()
    cmp.PASSWORD
}