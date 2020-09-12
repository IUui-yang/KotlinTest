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
class NullTest {

}

var study1:Study?=null

fun doStudy2(study: Study?) {
    study?.let { stu ->
        stu.readBook()
        stu.doHomework()
    }
}
fun doStudy3(){
    study1?.let { stu ->
        stu.readBook()
        stu.doHomework()
    }
}
fun main(args: Array<String>) {
    doStudy2(null)
}