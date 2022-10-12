package br.com.avilez.delegate.composiition

import br.com.avilez.delegate.composiition.interfaces.Dialable
import br.com.avilez.delegate.composiition.interfaces.Snappable

class Smartphone(
    private val phone: Dialable = Phone(),
    private val camera: Snappable = Camera()
) : Dialable by phone, Snappable by camera