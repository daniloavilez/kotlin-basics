package br.com.avilez.delegate.composiition

import br.com.avilez.delegate.composiition.interfaces.Snappable

class Camera : Snappable {
    override fun takePicture() =
        "Taking picture..."
}