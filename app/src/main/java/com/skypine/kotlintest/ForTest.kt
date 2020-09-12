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
class ForTest {

}

fun main(args: Array<String>) {
    val range = 0..10
    val range2 = 0 until 10
    val range3 = 10 downTo 1
    for (i in 0..10) {
        println(i)
    }
    /**
     * for - in 循环每次执行循环默认是会在区间范围内递增1，相当于java中 for i循环的
     * 中的i++;
     * 当使用step 关键字时，比如 step 2 ，则时每次执行循环会在区间范围内递增2；
     * 相当于for-i 循环中的 i=i+2的效果；
     */
    for (i in 0 until 10 step 2) {
        print(i) //运行结果 0 2 4 6 8;
    }

    /**
     * 降序同样也可以使用 step 关键字来跳过区间的一些元素；
     */
    for (i in 10 downTo 1) {
        print(i) //运行结果 10 9 8 7 6 .. 1;
    }
}