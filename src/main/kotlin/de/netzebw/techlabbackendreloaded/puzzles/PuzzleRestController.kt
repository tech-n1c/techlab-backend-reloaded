package de.netzebw.techlabbackendreloaded.puzzles

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PuzzleRestController {
    @GetMapping("/puzzles")
    fun overview(): String {
        val json = """{
    "method": "GET", "path": "/puzzles", "description": "Diese Übersicht"
    "method": "GET", "path": "/xy", "description": "Bla Fasel Blubber"
}"""

        // Gib das JSON Objekt zurück.
        return json

    }
}