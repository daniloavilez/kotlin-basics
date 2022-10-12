package br.com.avilez.coroutine

import kotlinx.coroutines.*
import java.util.concurrent.CompletableFuture

class CoroutineClass {
    fun runBlockingBuilder(): Unit {
        println("Before creating a coroutine")
        runBlocking {
            print("Hello, ")
            delay(200L)
            println("World")
        }
        println("After coroutine finished")
    }

    fun launchBuilder(): Unit {
        println()
        println("Before runBlocking")
        runBlocking {
            println("Before launch")
            launch {
                print("Hello, ")
                delay(200L)
                println("World")
            }
            println("After launch")
        }
        println("After runBlocking")
    }

    fun asyncAwaitBuilder() {
        println()
        runBlocking {
            val result1 = retrieve1("www.avilez.com.br")
            val result2 = retrieve2("www.avilez.com.br")
            println("printing result on ${Thread.currentThread().name} $result1")
            println("printing result on ${Thread.currentThread().name} $result2")
        }
    }

//    Built-in dispatchers provided by the library include the following:
//
//    Dispatchers.Default
//
//    Dispatchers.IO
//
//    Dispatchers.Unconfined
//
//    The last one should not normally be used in application code.
//
//    The Default dispatcher uses a common pool of shared background threads. It is appropriate for coroutines that consume extensive amounts of computation resources.
//
//    The IO dispatcher uses a shared pool of on-demand created threads and is designed for offloading I/O-intensive blocking operations, like file I/O or blocking networking I/O.
    private suspend fun retrieve2(url: String) = withContext(Dispatchers.IO) {
        println("Retrieving data on ${Thread.currentThread().name}")
        delay(100L)
        "withContextResults"
    }

    private suspend fun retrieve1(url: String) = coroutineScope {
        async(Dispatchers.IO) {
            println("Retrieving data on ${Thread.currentThread().name}")
            delay(100L)
            "asyncResults"
        }.await()
    }
}