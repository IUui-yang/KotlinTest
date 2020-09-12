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
class IfTest {
    /**
     * Kotlin使用每个条件语句的最后一行代码作为返回值，并将返回值赋值给了value;
     */
    fun largerNumber(num1: Int, num2: Int): Int {
        return if (num1 > num2) {
            num1
        } else if (num2 > 10) {
            10
        } else {
            num2
        }
    }

    fun largerNumber2(num1: Int, num2: Int) = if (num1 > num2) {
        num1
    } else if (num2 > 10) {
        10
    } else {
        num2
    }

    fun largerNumber1(num1: Int, num2: Int) = if (num1 > num2) num1 else if (num2 > 10) 10 else num2
}

