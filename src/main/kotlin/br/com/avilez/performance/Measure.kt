package br.com.avilez.performance

import java.util.stream.IntStream
import kotlin.system.measureTimeMillis

class Measure {
    fun measureTimeMsForSequential(): String {
        var time = measureTimeMillis {
            IntStream.rangeClosed(1, 6)
                .map { doubleIt(it) }
                .sum()
        }

        return "Sequential stream took $time ms"
    }

    fun measureTimeMsForParallel(): String {
        var time = measureTimeMillis {
            IntStream.rangeClosed(1, 6)
                .parallel()
                .map { doubleIt(it) }
                .sum()
        }

        return "Parallel stream took $time ms"
    }

    fun doubleIt(x: Int): Int {
        Thread.sleep(100L)
        println("doubling $x with on thread ${Thread.currentThread().name}")
        return x * 2
    }
}