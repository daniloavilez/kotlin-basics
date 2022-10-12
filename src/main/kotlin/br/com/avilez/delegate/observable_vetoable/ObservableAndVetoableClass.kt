package br.com.avilez.delegate.observable_vetoable

import kotlin.properties.Delegates

class ObservableAndVetoableClass {
    var watched: Int by Delegates.observable(1) { property, oldValue, newValue ->
        println("${property.name} changed from $oldValue to $newValue")
    }

    var checked: Int by Delegates.vetoable(1) { property, oldValue, newValue ->
        println("Trying to change ${property.name} from $oldValue to $newValue")
        newValue >= 0
    }
}