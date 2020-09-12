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
object Singleton {
    var i: Int = 1

    @JvmField
    var iExt: Int = 2
    fun singletonTest() {
        println("singletonTest is called.")
    }

    @JvmStatic
    fun singletonTestExt() {
        println("singletonTestExt is called.")
    }
}
