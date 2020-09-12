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
open class Person(var name: String, var age: Int) {
    init {
        println("Person init $name $age")
        name = ""
        age = 2
        println("Person init $name , $age")
    }

    fun eat() {
        name = ""
        println("$name is eating. He is $age years old.")
    }
}

class Student(val son: String, val grade: Int, name: String, age: Int) : Person(name, age) {

    init {
        println("主构造函数,init")
    }

    constructor(name: String, age: Int) : this("", 0, name, age) {
        println("第一个次构造函数，调用了主构造函数")
    }

    constructor() : this("", 0) {
        println("第二个次构造函数，调用了第一个次构造函数")
    }
}

class Student2 : Person {
    constructor(name: String, age: Int) : super(name, age) {

    }
}

fun main(args: Array<String>) {
//    val p = Person("213", 2)//实例化Person类，创建Person对象；
//    p.name = "Jack"
//    p.age = 19
//    p.eat()//调用结果 Jack is eating. He is 19 years old.
    val student = Student()
    //val student2 = Student("", 0)
}