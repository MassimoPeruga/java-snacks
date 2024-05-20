package org.learning.snacks;

import java.util.Scanner;

public class SnackQuattro {
    /*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero di posizioni
    nelle quali i caratteri corrispondenti sono diversi.
    Crea un programma che, date due stringhe, ritorni la distanza di Hamming.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

        if (stringa1.length() != stringa2.length()) {
            System.out.println("Le stringhe devono avere la stessa lunghezza");
        } else {
            int distanza = 0;
            for (int i = 0; i < stringa1.length(); i++) {
                if (stringa1.charAt(i) != stringa2.charAt(i)) {
                    distanza++;
                }
            }
            System.out.println("La distanza di Hamming è: " + distanza);
        }
    }
}