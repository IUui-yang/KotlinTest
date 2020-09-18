package com.skypine.sharedpreferences

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author ypeng
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
class InfixTest {
    fun startsWithTest() {
        if ("Hello Kotlin".startsWith("Hello")) {
            //处理具体的逻辑；
        }

        /**
         * 调用"Hello Kotlin"这个字符串的beginsWith()函数，并传入一个
         * "Hello"字符串作为参数。但是infix函数允许我们将函数调用时的
         * 小数点，括号等计算机相关的语法去掉；
         */
        if ("Hello Kotlin" beginsWith "Hello"){
            //处理具体逻辑；
        }
    }
}

/**
 * 在String类添加一个beginsWith()拓展函数，他用于判断一个字符串是否
 * 以某个指定参数开头；内部实现就是调用了String类的startsWith()函数；
 * 加上infix修饰之后，这个就变成了一个infix函数；
 */
infix fun String.beginsWith(prefix: String) = startsWith(prefix)