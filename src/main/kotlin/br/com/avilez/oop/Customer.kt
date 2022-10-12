package br.com.avilez.oop

class Customer(val name: String? = "") {
//    private var _messages: List<String>? = null
    val messages: List<String> by lazy { loadMessages() }

//    val messages: List<String>
//        get() {
//            if (_messages == null) {
//                _messages = loadMessages()
//            }
//            return _messages!!
//        }

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Use Kotlin",
            "Sweet"
        ).also { println("loaded messages") }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    fun doNothing(): Nothing = throw Exception("Nothing at all")
}