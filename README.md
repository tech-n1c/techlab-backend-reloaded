# Dokumentation für das HTTP-Anfragen-Rätsel

## Übersicht über die HTTP-Anfragen

Die folgenden HTTP-Anfragen können an das Projekt gestellt werden:

| Methode | Pfad | Beschreibung                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
|---|---|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET | /solution | Liefert die Antwort "42".                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| GET | /hello | Begrüßt den Benutzer mit seinem Namen. Der Name kann als Parameter "name" angegeben werden.                                                                                                                                                                                                                                                                                                                                                                                                                          |
| GET | /puzzles | Liefert eine Übersicht über die verfügbaren Rätsel.                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| GET | /puzzles/encrypting | Liefert eine Übersicht über die verfügbaren Verschlüsselungsrätsel.                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| GET | /puzzles/encrypting/1 | Liefert ein Verschlüsselungsrätsel mit einer Caesarverschiebung von 3.                                                                                                                                                                                                                                                                                                                                                                                                                                               |
| GET | /puzzles/encrypting/2 | Liefert ein Verschlüsselungsrätsel mit einer Caesarverschiebung von -4.                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| GET | /puzzles/encrypting/3 | Liefert ein Verschlüsselungsrätsel mit einer Caesarverschiebung von 16.                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| GET | /changeRoomNumber | Hier könnt ihr als Orga-Team die Raumnummer ändern, die als Lösung herauskommen soll. Hierfür kann z.B. ein Besprechungsraum gebucht und dort Süßigkeiten deponiert werden. Die Raumnummer muss bei jedem Start der Anwendung gesetzt werden und kann im laufenden Betrieb jederzeit abgeändert werden. Dafür muss die Raumnummer als Parameter "raumnummer" angegeben werden. Das Passwort muss als Parameter "passkey" mit `oq2gGEU2iesf6Wt5ACzzCu2ATN9fBmMbrGvQtn2oMy8dZLg8ag7xgzmw7LERrwvwShKRD` gesetzt werden. |

## Beispielanwendung

Um das Rätsel zu lösen, müssen die Studis/Azubis alle drei Verschlüsselungsrätsel lösen. Die Lösungen sind:

* Rätsel 1: "Aufgabe Eins"
* Rätsel 2: "Ihr habt das zweite Rätsel gelöst!"
* Rätsel 3: "Dies ist das dritte Rätsel."

Wenn der Benutzer alle drei Rätsel gelöst hat, erhält er die Antwort "Korrekt gelöst, begebt euch nun auf die Suche nach Raum " + Raumnummer".

Die Raumnummer kann dann mit der `changeRoomNumber`-Methode (s. Tabelle) geändert werden.

**Weitere Informationen**

Weitere Informationen zum Projekt finden ihr auf der [Projektseite](https://github.com/tech-n1c/techlab-backend-reloaded).