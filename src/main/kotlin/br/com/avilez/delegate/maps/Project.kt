package br.com.avilez.delegate.maps

data class Project(val map: MutableMap<String, Any?>) {
    val name: String by map
    val priority: Int by map
    val completed: Boolean by map
}