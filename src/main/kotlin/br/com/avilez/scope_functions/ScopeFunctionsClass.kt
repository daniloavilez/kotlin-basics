package br.com.avilez.scope_functions

import br.com.avilez.oop.Customer
import br.com.avilez.scope_functions.model.AstroResult
import com.google.gson.Gson
import java.net.URL
import java.util.logging.Logger
import kotlin.reflect.typeOf

class ScopeFunctionsClass {
    fun functionAlso() {
        val customer = Customer()
            .also { println(it) }
            .also { Logger.getAnonymousLogger().info(it.toString()) }
    }

    fun functionLet(): String {
        var myName: String? = ""

        myName = myName?.let {
            when {
                it.isEmpty() -> "Empty"
                it.isBlank() -> "Blank"
                else -> it.capitalize()
            }
        } ?: "Null"

        return myName
    }

    fun functionTemporaryVariable() {
        // Before
        val numbers = mutableListOf("one", "two", "three", "four", "five")
//        val resultList = numbers.map { it.length }.filter { it > 3 } // resultList is a temporaryVariable
//        println(resultList)

        // After
        numbers.map { it.length }.filter { it > 3 }
            .let { println(it) }

        // Or

        numbers.map { it.length }.filter { it > 3 }.let(::println)
    }

    fun getAstronauts() {
        Gson().fromJson(
            URL("http://api.open-notify.org/astros.json").readText(),
            AstroResult::class.java
        ).people.map { Pair(it.name, it.craft) }.let(::println)
    }
}