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
class InterfaceTest(name: String, age: Int) : Person(name, age), Study {
    override fun readBook() {
        println("$name is reading")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }
}

fun main(args: Array<String>) {
    val study = InterfaceTest("Jack", 10)
    doStudy(study)
}

fun doStudy(study: Study) {
    study.readBook()
    study.doHomework()
}