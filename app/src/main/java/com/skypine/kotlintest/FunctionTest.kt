package com.skypine.kotlintest

import kotlin.math.max

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 25497
 * @version [1.0]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
class FunctionTest {
    fun largerNumber(num1: Int, num2: Int): Int {
        return max(num1, num2);//max --> Kotlin中的max方法，用来比较两个值的大小;
    }

    fun largerNumber1(num1: Int, num2: Int): Int = max(num1, num2)
    fun largerNumber2(num1: Int, num2: Int) = max(num1, num2)
}

fun main(args: Array<String>) {
    /**
     * Kotlin创建对象的方式；
     * functionTest -- 对象名；
     * FunctionTest --对象的数据类型；
     * (如果像示例这样立即创建对象则可以不写，Kotlin的类型推导机制会自动推导类型)；
     *
     * FunctionTest() -- 创建的对象；
     */
    val functionTest: FunctionTest = FunctionTest()
    val a = 37
    val b = 40
    val value = functionTest.largerNumber(a, b);
    println("larger number is $value");//$value 这种方式可以直接取值，而不需要在引号外面使用+号；
}