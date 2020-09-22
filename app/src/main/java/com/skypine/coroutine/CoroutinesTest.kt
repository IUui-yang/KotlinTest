package com.skypine.coroutine

import android.app.Service
import android.content.ServiceConnection
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.RuntimeException
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author ypeng
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
fun main1(args: Array<String>) {
    GlobalScope.launch {
        println("codes run in coroutine scope")
        delay(1500)
        println("codes run in coroutine scope finished")
    }
    try {
        Thread.sleep(1000)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun main2(args: Array<String>) {
    runBlocking {
        launch {
            println("codes run in coroutine scope-->1")
            delay(1000)
            println("codes run in coroutine scope finished-->1")
        }
        launch {
            println("codes run in coroutine scope-->2")
            delay(1000)
            println("codes run in coroutine scope finished-->2")
        }
    }
}

fun main3(args: Array<String>) {
    val start = System.currentTimeMillis()
    runBlocking {
        repeat(100000) {
            launch {
                println(".")
            }
        }
    }
    val end = System.currentTimeMillis()
    println("time-->${end - start}")
}

suspend fun printDot() {
    coroutineScope {
        launch {
            println(".")
            delay(1000)
        }
    }
}

fun main4(args: Array<String>) {
    runBlocking {
        coroutineScope {
            launch {
                for (i in 1..10) {
                    println(i)
                    delay(1000)
                }
            }
        }
        println("coroutineScope finished")
    }
    println("runBlocking finished")
}

fun main5(args: Array<String>) {
    val job = Job()
    val coroutineScope = CoroutineScope(job)
    coroutineScope.launch {
        //逻辑
    }
    job.cancel()
}

fun main6(args: Array<String>) {
    runBlocking {
        val result = async {
            5 + 5
        }.await()
        println(result)
    }
}

fun main7(args: Array<String>) {
    runBlocking {
        val start = System.currentTimeMillis()
        val result = async {
            delay(1000)
            5 + 5
        }
        val result2 = async {
            delay(1000)
            4 + 6
        }
        println("result is ${result.await() + result2.await()}")
        val end = System.currentTimeMillis()
        println("cost ${end - start} ms.")
    }
}

fun main(args: Array<String>) {
    runBlocking {
        val result = withContext(Dispatchers.Default) {
            5 + 5
        }
        println("result is $result")
    }
}

