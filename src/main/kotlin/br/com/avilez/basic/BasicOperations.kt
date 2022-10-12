package br.com.avilez.basic

import kotlin.math.pow

class BasicOperations {
    fun nonNullableVariable(): Unit {
        var name: String

        name = "Dolly"
//        name = null
    }

    fun nullableVariable(name: String, surname: String?) {
        val name = name
        val surname = surname
    }

    fun checkNullability(name: String?) {
//        if (name != null) {
//            val length = name.length
//        }
//        Safe call operator
//        val length = name?.length

//        We can enhance the safe call with Elvis operator
        val length = name?.length ?: 0
    }

    fun safeCast(p: Person?) {
        val p1 = p as? Person
    }

    fun convertBetweenTypes(year: Int): Long {
//        val longVar: Long = year <-- this does not compile
        val longVar: Long = year.toLong()
        return longVar
    }

    fun overloadingTypeConversion(year: Int): Long {
        val longSum = 3L + year // The var year is automatically converted to Long
        return longSum
    }

    fun powerANumber(year: Int): Int {
//        Kotlin doesn't have a math library for pow
//        the number must be cast to Double or Float
        return year.toDouble().pow(2).toInt()
    }

    fun createPairs() {
        val pair1 = Pair("a", 1)
        val pair2 = "a" to 1

//      Both commands above are valid to create Pair
    }

    fun createMap() {
        val map = mapOf(Pair("a", 1), "b" to 2, Pair("c", 3))
    }

    fun `destructuring a Pair`() {
        val pair = "a" to 1
        val (x,y) = pair
    }
}