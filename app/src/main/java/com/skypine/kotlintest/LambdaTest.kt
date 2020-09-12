package com.skypine.kotlintest

import java.nio.channels.Selector
import java.util.*

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 25497
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
class LambdaTest {
}

fun main(args: Array<String>) {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val newList = list.map { it.toUpperCase(Locale.CHINESE) }
    newList.forEach { println(it) }

    val list2 = list.filter { it.length <= 5 }.map { it.toUpperCase(Locale.CHINESE) }
    list2.forEach { s -> println(s) }

    val anyResult = list.any { it.length <= 5 }
    var allResult = list.all { it.length <= 5 }

    Thread{ println("Thread is runing") }.start()

}