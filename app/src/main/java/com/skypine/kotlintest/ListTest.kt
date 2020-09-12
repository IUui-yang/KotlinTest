package com.skypine.kotlintest

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
class ListTest {


}

fun main(args: Array<String>) {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (s in list) {
        // print(s)
    }

    val list2 = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val list4 = arrayListOf<String>()
    list2.add("Watermelon")
    for (s in list2) {
        // print(s)
    }
    val list3 = mutableListOf<Int>()
    list3.add(1)
    //list3.forEach { l -> println(l) }
    val set = mutableSetOf<Int>()

    val set2 = hashSetOf<String>()
    val map = mutableMapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
    map["Watermelon"] = 6
    println("Watermelon is number --> ${map["Watermelon"]}")
    for ((fruit, number) in map) {
        println("fruit is $fruit ,number is $number ")
    }
    val map2 = hashMapOf<String, Int>()



}