package com.workshop;

public class ScrumIteration {

    public static void main(String[] args) {
        // instantiate Sprint with X stories
        Sprint sprint = new Sprint(5);

        // instantiate Testers
        Tester lubos = new Tester();
        Tester thorsten = new Tester();
        Tester mariia = new Tester();

        // Instantiate Developers
        Developer christian = new Developer();
        Developer michael = new Developer();
        Developer joerk = new Developer();
        Developer metje = new Developer();
        Developer frederik = new Developer();
        Developer corinna = new Developer();

    }

    private static void printSeparator() {
        System.out.println(" ");
        System.out.println("####################");
        System.out.println(" ");
    }
}
