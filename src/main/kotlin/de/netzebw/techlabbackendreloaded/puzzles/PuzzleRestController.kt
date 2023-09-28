package de.netzebw.techlabbackendreloaded.puzzles

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PuzzleRestController {
    @GetMapping("/puzzles")
    fun overview(): String {
        val json = """{
    "method": "GET", "path": "/puzzles", "description": "Diese Übersicht"
    "method": "GET", "path": "/puzzles/encrypting", "description": "Rätsel, die ihr entschlüsseln müsst."
}"""

        return json
    }

    @GetMapping("/puzzles/encrypting")
    fun caesar(): String {
        return """{
    Entschlüsselt die folgenden Rätsel. Ihr könnt eure Lösung testen, indem ihr bei 192.168.1.201:8080/puzzles/encrypting/check die Nummer des Rätsels als Parameter "puzzle" eingebt und eure Lösung als Parameter "solution" eingebt.
     
    "method": "GET", "path": "/puzzles/encrypting/1", "description": "Einfaches Rätsel"
    "method": "GET", "path": "/puzzles/encrypting/2", "description": "Mittleres Rätsel"
    "method": "GET", "path": "/puzzles/encrypting/3", "description": "Schwieriges Rätsel"
}"""
    }

    @GetMapping("/puzzles/encrypting/1") // Aufgabe Eins
    fun caesarOne(): String { //Verschiebung 3
        return """{
    Dxijdeh Hlqv
}"""
    }

    @GetMapping("/puzzles/encrypting/2") //Verschiebung -4
    fun caesarTwo(): String { // Ihr habt das zweite Rätsel gelöst!
        return """{
    Edn dwxp zwo vsaepa Näpoah cahöop!
}"""
    }

    @GetMapping("/puzzles/encrypting/3") //Verschiebung 16
    fun caesarThree(): String { // Dies ist das dritte Rätsel.
        return """{
    Tyui yij tqi thyjju Häjiub.
}"""
    }


    @GetMapping("/puzzles/encrypting/check")
    fun checkCaesar(@RequestParam(value = "puzzle") puzzle: Int, @RequestParam(value = "solution") solution: String): String {
        if (puzzle == 1) {
            if (solution.equals("Aufgabe Eins")) {
                return "Korrekt gelöst!"
            } else {
                return "Leider Falsch."
            }
        } else if (puzzle == 2) {
            if (solution.equals("Ihr habt das zweite Rätsel gelöst!")) {
                return "Korrekt gelöst!"
            } else {
                return "Leider Falsch."
            }
        } else if (puzzle == 3) {
            if (solution.equals("Dies ist das dritte Rätsel.")) {
                return "Korrekt gelöst, begebt euch nun auf die Suche nach Raum 3R1-237"
            } else {
                return "Leider Falsch."
            }
        } else return "Bitte gebe eine gültige Rätsel-Nummer ein."

    }
}