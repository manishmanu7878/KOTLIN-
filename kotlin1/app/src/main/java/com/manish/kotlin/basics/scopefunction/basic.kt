package com.manish.kotlin.basics.scopefunction

private class Person(
    private val name: String,
    private var age: Int,
    private var city: String
) {
    fun moveTo(newCity : String) {
        this.city = newCity
    }

    fun celebrateBirthday() {
        age++
    }
}

private fun demo1() {
    val p = Person("abc",12,"vvv")
    p.celebrateBirthday()

    val q = Person("abc",12,"vvv")
    q.moveTo("lll")
    p.celebrateBirthday()

    Person(
        "bcd",
        89,
        "nnn"
    ).let {
        it.moveTo("kkk")
        it.celebrateBirthday()
    }

    val list = listOf<String?>("abc", "pqr", "lmn", null, "ghh", "nnm")
    list.forEach { el ->
        el?.let {
            println(it.uppercase())
        }
    }
}

fun main() {
    demo1()
}