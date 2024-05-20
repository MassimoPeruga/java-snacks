package org.learning.snacks;

import java.util.Random;

public class Snack02 {
    /*Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista
    di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.*/
    public static void main(String[] args) {
        String[] nomi = {"Mario", "Luigi", "Peach", "Daisy", "Bowser"};
        String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Neri", "Gialli"};

        Random random = new Random();

        System.out.println("Lista di invitati:");
        for (int i = 0; i < 10; i++) {
            String nomeCasuale = nomi[random.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[random.nextInt(cognomi.length)];
            System.out.println(nomeCasuale + " " + cognomeCasuale);
        }
    }
}
