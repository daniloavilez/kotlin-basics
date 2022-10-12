package br.com.avilez.delegate.composiition

import br.com.avilez.delegate.composiition.interfaces.Dialable

class Phone : Dialable {
    val ultimateAnswer: Int by lazy {
        println("computing the answer")
        32
    }

    override fun dial(number: String) =
        "Dialing $number..."
}