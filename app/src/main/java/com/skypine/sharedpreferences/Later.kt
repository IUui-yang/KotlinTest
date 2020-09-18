package com.skypine.sharedpreferences

import kotlin.reflect.KProperty

/**
 * 定义一个Later类，并将它指定成泛型类，Later的主构造函数中接收一个函数类型参数，
 * 这个函数类型参数不接收任何参数，并且返回值类型就是Later类指定的泛型；
 * 在Later类中实现getValue()方法；
 * getValue()方法的第一个参数指定成Any?类型，表示我们希望Later的俄日托功能在
 * 所有类中都可以使用，然后使用了一个value变量对值进行缓存，如果value为空就调用
 * 构造函数中传入的函数类型参数去获取值，否则就直接返回；
 *
 */
class Later<T>(val block: () -> T) {
    private var value: Any? = null

    @Suppress("UNCHECKED_CAST")
    operator fun getValue(any: Any?, prop: KProperty<*>): T {
        if (value == null) {
            value = block()//运行Lambda表达式之后，最后一行为返回值，"test later"
        }
        return value as T
    }

}

/**
 * 为了让功能更加接近于lazy函数，最好再定义一个顶层函数，
 * 我们将这个顶层函数也定义成泛型函数，并且接收一个函数类型的参数，
 * 作用：创建Later类的实例，并将接收到的函数类型参数传给Later类的构造函数；
 */
fun <T> later(block: () -> T) = Later(block)

fun main(args: Array<String>) {
    val p by later {
        println("tun codes inside later block")
        "test later"//lambda 表达式最后一行为返回值；
    }
    println("调用p")
    println(p)
    println(p)
}