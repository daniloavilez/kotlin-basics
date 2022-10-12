package br.com.avilez.sequence

class SequenceClass {
    fun findingFirstDoubleDivBy3_Ver1() {
        (100 until 200).map { it * 2 } // Here it will run 100 times
            .filter { it % 3 == 0 } // Here it will run 100 times again, sum up to 200
            .first() // And now find the first which is divisible by 3
    }

    fun findingFirstDoubleDivBy3_Ver2() {
        (100 until 200).map { it * 2 } // Here it will run 100 times
            .first { it % 3 == 0 } // Here it will run 3 times, sum up to 103
        // 200 % 3 = 2
        // 202 % 3 = 1
        // 204 % 3 = 0
    }

    fun findingFirstDoubleDivBy3_Ver3() {
        (100 until 2_000_000).asSequence()
            .map { it * 2 }
            .filter { it % 3 == 0 }
            .first()
//        doubling 100
//        filtering 200
//        doubling 101
//        filtering 202
//        doubling 102
//        filtering 204
//        As the example above, it will run 6 times until find the first divisible by 3
    }

    fun fibonacciSequence() = sequence {
        var terms = Pair(0, 1)

        while (true) {
            yield(terms.first)
            terms = terms.second to terms.first + terms.second
        }
    }
}