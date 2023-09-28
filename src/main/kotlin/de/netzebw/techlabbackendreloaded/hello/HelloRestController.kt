package de.netzebw.techlabbackendreloaded.hello

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlinx.serialization.json.Json

@RestController
class HelloRestController {
    @GetMapping("/solution")
    fun answerToLifeTheUniverseAndEverything(): String {
        return "42"
    }

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello, ${name}!"
    }

    @GetMapping("/")
    fun overview(): String {
        val json = """{
    Eine Übersicht über die verfügbaren Methoden:
    "method": "GET", "path": "/", "description": "Diese Übersicht"
    "method": "GET", "path": "/hello", "description": "Hier kannst du dich mit deinem Namen begrüßen lassen. Gebe dafür deinen Namen als Parameter an."
    "method": "GET", "path": "/puzzles", "description": "Eine Übersicht über die verfügbaren Rätsel"
}"""


        // Gib das JSON Objekt zurück.
        return json

    }

}

@Serializable
class Endpoint(
    val method: String,
    val path: String,
    val description: String
)