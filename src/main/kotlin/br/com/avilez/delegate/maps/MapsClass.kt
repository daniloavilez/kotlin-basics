package br.com.avilez.delegate.maps

import com.google.gson.Gson

class MapsClass {
    private fun getMapFromJSON() = Gson().fromJson<MutableMap<String, Any?>>(
        """{ "name":"Learn Kotlin", "priority": 5, "completed": true }""",
        MutableMap::class.java
    )

    fun getProject(): Project {
        return Project(getMapFromJSON())
    }
}