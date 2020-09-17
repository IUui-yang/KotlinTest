package com.skypine.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author ypeng
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
/**
 * 给SharedPreferences添加一个拓展函数，open；
 * 接收一个函数类型的参数；则open为高阶函数；
 * open内具有SharedPreferences的上下文，
 * 因此这里可以直接使用edit()方法来获取SharedPreferences.Editor对象；
 *<p>
 * open函数接收的是一个SharedPreferences.Editor的函数类型参数，因此这里需要editor.block()进行调用；
 * 我们就可以在函数型类型的具体实现中添加数据了；
 * 最后还要调用editor.apply()方法来提交数据，从而完成数据存储操作；
 *
 * 函数类型前加ClassName.,表示这个函数类型是定义在哪个类当中的；
 *
 */
fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    editor.block()
    editor.apply()
}

fun editorData(context: Context) {
    context.getSharedPreferences("data", Context.MODE_PRIVATE).open {
        putString("name", "Tom")
        putInt("age", 28)
        putBoolean("married", false)
    }
}