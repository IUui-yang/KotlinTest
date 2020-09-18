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
class HasTest {
    fun hashTest() {
        val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
        if (list.contains("Banana")) {
            //处理具体逻辑；
        }
        if(list has "Banana"){
            //处理具体业务逻辑；
        }
    }
}

/**
 * 给collection接口添加一个拓展函数，因为collection是所有集合的总接口，
 * 那么所有集合的之类都可以使用这个函数了；
 * <p>
 * has()函数的实现就是contains()函数，功能一样，只是多了有一个infix关键字；
 */
infix fun <T> Collection<T>.has(element: T) = contains(element)
