package com.workshop;

public class ScrumIteration {

    public static void main(String[] args) {
        // Sprint -> Sammlung von Stories. Anzahl der Stories wird am Anfang festgelegt
        // Sprint -> Entweder "finished" oder "!finished"
        // Sprint ist dann finished, wenn alle stories "closed"

        // Developer --> Kann eine Story im Status "Open" in Bearbeitung nehmen "in Progress"
        // Annahme: Wenn eine Story in Progress ist, kann sie direkt getestet werden.
        // Regel: Ein Entwickler darf immer nur EINE Story bearbeiten.

        // Tester --> Kann eine Story testen, die im Status "in Progress" ist.
        // Regel: Der Tester kann so viele Stories gleichzeitig testen, wie im Status "In Progress" sind.
        // Sobald ein Tester eine Story testet, gilt sie als "closed".

        // Sprintbeginn
        System.out.println("Der Sprint beginnt");



        /*

        // 1. Sprint starten
        Sprint sprintPacman = new Sprint(5);
        sprintPacman.printStatus();

        // 2. Entwickler erzeugen
        Developer christian = new Developer();
        Developer metje = new Developer();
        Developer corinna = new Developer();
        Developer frederik = new Developer();
        Developer joerk = new Developer();

        frederik.takeStoryInProgress(sprintPacman);
        metje.takeStoryInProgress(sprintPacman);
        joerk.takeStoryInProgress(sprintPacman);
        christian.takeStoryInProgress(sprintPacman);
        corinna.takeStoryInProgress(sprintPacman);

        // Tester testen die Stories
        Tester lubos = new Tester();
        lubos.testMultipleStories(sprintPacman, 5);

        sprintPacman.printStatus();

         */
    }
}
