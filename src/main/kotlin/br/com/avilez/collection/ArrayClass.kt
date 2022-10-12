package br.com.avilez.collection

class ArrayClass {
    fun createArray() {
        val strings = arrayOf("this", "is", "array", "of", "strings")

        val nullStringArray = arrayOfNulls<String>(5)

        val squares = Array(5) { i -> (i * i).toString() }
    }
}