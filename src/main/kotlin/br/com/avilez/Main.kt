package br.com.avilez

import br.com.avilez.basic.BasicOperations
import br.com.avilez.basic.Person
import br.com.avilez.coroutine.CoroutineClass
import br.com.avilez.delegate.composiition.Smartphone
import br.com.avilez.delegate.maps.MapsClass
import br.com.avilez.delegate.observable_vetoable.ObservableAndVetoableClass
import br.com.avilez.oop.Customer
import br.com.avilez.oop.DataProduct
import br.com.avilez.oop.LateInitDemo
import br.com.avilez.oop.MySingleton
import br.com.avilez.performance.Measure
import br.com.avilez.scope_functions.ScopeFunctionsClass
import br.com.avilez.sequence.SequenceClass


fun main(args: Array<String>) {
//    println("Hello World")
//
//    val basicOperations = BasicOperations()
//
//    basicOperations.nullableVariable("Danilo", null)
//    basicOperations.checkNullability(null)
//
//    val p = Person("Danilo", null, 29)
////    val p = null
//
//    basicOperations.safeCast(p)
//
//    val year: Int = 1990
//
//    basicOperations.convertBetweenTypes(year)
//    basicOperations.overloadingTypeConversion(year)
//
//    basicOperations.powerANumber(year)
//
////    Pair and Map
//
//    basicOperations.createPairs()
//    basicOperations.createMap()
//    basicOperations.`destructuring a Pair`()
//
////    OOP
//
//    val p1 = DataProduct("Jelly", 1.12)
//
//    println(p1.toString())
//
//    val p2 = p1.copy(onSale = true)
//
//    println(p2.toString())
//
//    val (name, price, onSale) = p2
//
//    println(onSale)
//
//    val customer = Customer("Danilo").apply { messages }
//
//    LateInitDemo().initializeName()
//
//    MySingleton.myFunction()
//    MySingleton.myProperty
//
////    customer.doNothing()
//
//    val fibs = SequenceClass().fibonacciSequence()
//        .take(10)
//        .toList()
//
//    println(fibs)
//
//    val functions = ScopeFunctionsClass()
//
//    functions.functionAlso()
//
//    functions.functionLet().also { println(it) }
//
//    functions.getAstronauts()
//
//    val smartphone = Smartphone()
//
//    smartphone.dial("1212")
//
//    val ultimateAnswer: Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
//        println("computing the answer")
//        32
//    }
//
//    // Synchronized -> Locks are used to ensure that only a single thread can init
//    // Publication -> Initializer function can be called several times
//    // None -> No locks are used
//
//    println(ultimateAnswer)
//
//    val observableAndVetoable = ObservableAndVetoableClass()
//
//    observableAndVetoable.watched = 3
//    observableAndVetoable.checked = -2
//
//    println(observableAndVetoable.checked)
//
//    observableAndVetoable.checked = 32
//
//    println(observableAndVetoable.checked)
//
//    val mapsDelegate = MapsClass()
//
//    println(mapsDelegate.getProject().toString())
//
//    // Repeat lambda
//    repeat(5) {
//        println("Counting: ${it + 1}")
//    }

    val measure = Measure()

    println(measure.measureTimeMsForSequential())

    println()

    println(measure.measureTimeMsForParallel())

//    val coroutine = CoroutineClass()
//
//    coroutine.runBlockingBuilder()
//
//    coroutine.launchBuilder()
//
//    coroutine.asyncAwaitBuilder()

}