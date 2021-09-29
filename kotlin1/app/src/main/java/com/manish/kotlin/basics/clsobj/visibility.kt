package com.manish.kotlin.basics.clsobj

private fun hello() = "hi"
internal class Abc
public var data = 56

open class Visibility (
    private var x : Int = 40,
    protected var y : Int = 50,
    internal var z :Int = 60,
    public var v :Int = 70
)
class SubSubVisibility : Visibility() {
    fun vs() {
        y = 10
    }
}