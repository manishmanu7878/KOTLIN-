package com.manish.kotlin.basics.clsobj

private class Gtst(
    private var xPos : Int
) {
    var x : Int
    get() = this.xPos
    set(value) { this.xPos = value }

}
private class SubVisibility : Visibility() {
    fun sb() {
        y = 25
    }

    fun main() {
        val gt1 = Gtst(10)
        gt1.x = 10
        println("${gt1.x}")

        val sv = Visibility()
        sv.v = 10
        sv.z = 56

        val sb = SubVisibility()
        sb.v = 10
        sb.z = 10

    }
}
