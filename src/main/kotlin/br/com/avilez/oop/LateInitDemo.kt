package br.com.avilez.oop

class LateInitDemo {
    lateinit var name: String

    fun initializeName() {
        println("Before assignment: ${::name.isInitialized}")
        name="World"
        println("After assignment: ${::name.isInitialized}")
    }
}