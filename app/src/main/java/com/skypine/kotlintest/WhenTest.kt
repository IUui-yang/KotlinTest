package com.skypine.kotlintest

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 25497
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
class WhenTest {
}

fun getScore(name: String) = when (name) {
    "tom" -> 86
    "jim" -> 77
    "jack" -> 98
    "lily" -> 100
    else -> 0
}

/**
 * Number 数值类型
 * Boolean 布尔类型
 * Char 字符类型
 * String 字符串类型
 * Array 数组类型
 *
 * when 语句进行类型匹配
 *
 *is 关键字相当于 java中instance of 关键字
 *
 * Int Long Float Double 等与数字相关的都是Number的子类；
 * 所以这里可以使用类型匹配来判断传入的参数到底属于什么类型；
 * 当类型指定为Number后，is 后面只能跟Number的子类进行判断；
 */
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

fun getScore2(name: String) = when {
    name == "Tom" -> 86
    name.startsWith("Tom") -> 86
    name == "Jim" -> 86
    name == "Jack" -> 86
    name == "Lily" -> 86
    else -> 0
}

fun largerNumber3(num1: Int, num2: Int) = when {
    num1 > num2 -> num1
    num2 > 10 -> 10
    else -> num2
}