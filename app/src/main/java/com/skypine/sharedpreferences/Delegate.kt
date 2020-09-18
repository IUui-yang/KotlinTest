package com.skypine.sharedpreferences

import kotlin.reflect.KProperty


/**
 * 这里使用by关键字连接了左边的P属性和右边的Delegate实例;
 * 这种写法就代表着将p属性的具体实现委托给了Delegate类趋势线。
 * 当调用p属性的时候会自动调用Delegate类的getValue()方法，当给
 * p属性赋值的时候会自动调用Delegate类的setValue()方法；
 *
 */
class MyClass {
    var p by Delegate()
}

/**
 * 创建Delegate类，在类中我们实现了getValue()和setValue()这两个方法
 * 并且都要使用operator关键字声明；
 * getValue()方法要接收两个参数:第一个参数用于声明该Delegate类的委托功能可以
 * 在什么类中使用。这里写出MyClass表示仅可在MyClass类中使用；
 * 第二个参数KProperty<*>是Kotlin中的一个属性操作类，可用于获取各种属性相关
 * 的值，<*>这种泛型的写法表示你不知道或者不关心泛型的具体类型；只是为了通过编译；
 * 至于返回值可以声明成任何类型，根据具体的实现逻辑去写了；
 *<p>
 * setValue()方法接收三个参数，前两个参数和getValue()一样，最后一个参数表示具体
 * 要赋值给委托类型的值，这个参数的类型必须和getValue()方法返回值的类型保持一致；
 * <p>
 * 还有一种情况我们不需要在Delegate类中试下setValue()方法，那就是MyClass中的p
 * 属性是使用val关键字声明的。如果p属性使用val关键字声明，那就意味着p属性无法在
 * 初始值之后被重新赋值，因此没必要实现setValue()方法，只需要实现getValue()方法；
 *
 */
class Delegate {

    var propValue: Any? = null

    operator fun getValue(myClass: MyClass, prop: KProperty<*>): Any? {
        return propValue
    }

    operator fun setValue(myClass: MyClass, prop: KProperty<*>, value: Any?) {
        propValue = value
    }
}

fun main(args: Array<String>) {
    val myClass = MyClass()
    println(myClass.p)//getValue()

    myClass.p = "adc"//setValue()
    println(myClass.p)
}