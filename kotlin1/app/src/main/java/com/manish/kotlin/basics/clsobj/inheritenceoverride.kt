package com.manish.kotlin.basics.clsobj

open class Config {

    open val pool : Int = 12

    open fun doConfiguration() {
        println("Inside Config class")
    }
}

class DbConfig : Config() {

    override val pool = 56

    override fun doConfiguration() {
        println("Inside Db Configuration")

    }
}

class FileConfig : Config() {
    override fun doConfiguration() {

        println("Inside File Configuration")

    }
}

fun main() {

    val cfg1: Config = Config()
    cfg1.doConfiguration()

    val cfg2: DbConfig = DbConfig()
    cfg2.doConfiguration()

    val cfg3: FileConfig = FileConfig()
    cfg3.doConfiguration()

    val cfg4: Config = DbConfig()
    cfg4.doConfiguration()
    val cfg5: Config = FileConfig()
    cfg5.doConfiguration()


}