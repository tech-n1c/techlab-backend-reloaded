package de.netzebw.techlabbackendreloaded.hello

import kotlinx.serialization.Serializable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


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
        val textString = """Eine Übersicht über die verfügbaren Methoden:<br><br>
    
            method: "GET", path: "/", description: "Diese Übersicht"<br>
            method: "GET", path: "/hello", description: "Hier kannst du dich mit deinem Namen begrüßen lassen. Gebe dafür deinen Namen als Parameter "name" an."<br>
            method: "GET", path: "/puzzles", description: "Eine Übersicht über die verfügbaren Rätsel"
        """

//        val lines: List<String> = textString.split("\n")
//        return lines

        return textString

    }

}

