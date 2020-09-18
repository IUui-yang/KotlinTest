package com.skypine.sharedpreferences

import android.content.ContentValues
import android.content.Context
import androidx.core.content.contentValuesOf

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author ypeng
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
fun insertData(context: Context) {
    val values = ContentValues().apply {
        put("name", "Game of Thrones")
        put("author", "George Martin")
        put("pages", 720)
        put("price", 20.85)
    }
    //db.insert("Book", null, values)
}

/**
 * mapOf()函数允许使用"Apple" to 1 这样的语法结构快速创建一个键值对；
 * 在Kotlin中使用A to B这样的语法结构会创建一个Pair对象；
 *
 * 声明Pair类型，由于Pair是一种键值对的数据结构，ContentValues的键都是字符串类型的；
 * 这里可以将Pair键的类型指定为String,但ContentValues的值却可以有多中类型，(字符串型
 * 整型，浮点型，甚至是null)所以我们这里需要将Pair值得类型指定为Any?
 * 因为Any是Kotlin种所有类的共同基类，相当于Java中的object.
 * 而Any?表示允许传入空值；
 *
 *
 * 创建一个ContentValues对象，然后遍历pairs参数列表，
 * 在循环中取出key和value并填入ContentValues()中；最终将ContentValues对象返回即可；
 * 因为Pair参数的值是Any类型，这里使用when语句一一进行条件判断，并覆盖ContentValues
 * 所支持的所有数据类型；
 *
 */
fun cvOf(vararg pairs: Pair<String, Any?>): ContentValues = ContentValues().apply {
    for (pair in pairs) {
        val key = pair.first
        val value = pair.second
        when (value) {
            is Int -> put(key, value)
            is Long -> put(key, value)
            is Short -> put(key, value)
            is Float -> put(key, value)
            is Double -> put(key, value)
            is Boolean -> put(key, value)
            is String -> put(key, value)
            is Byte -> put(key, value)
            is ByteArray -> put(key, value)
            null -> putNull(key)
        }
    }
}

fun main(args: Array<String>) {
    val values = cvOf(
        "name" to "Game of Thrones",
        "author" to "George Martin",
        "pages" to 720,
        "price" to 20.85
    )
    //db.insert("Book", null, values)

    val contentValuesOf = contentValuesOf(
        "name" to "Game of Thrones",
        "author" to "George Martin",
        "pages" to 720,
        "price" to 20.85
    )
   // db.insert("Book", null, contentValuesOf)


}