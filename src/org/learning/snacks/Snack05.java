package org.learning.snacks;

import java.util.Scanner;

public class Snack05 {
    /*Data una stringa in input mostrare a video quanti caratteri alfabetici contiene,
    quanti numeri e quanti simboli non alfanumerici.
    Continuare a chiedere una nuova stringa finchè non si inserisce 0.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa per continuare oppure 0 per terminare: ");
            input = scanner.nextLine();

            if (!input.equals("0")) {
                int alfabetici = 0, numeri = 0, simboli = 0;

                for (char c : input.toCharArray()) {
                    if (Character.isLetter(c)) {
                        alfabetici++;
                    } else if (Character.isDigit(c)) {
                        numeri++;
                    } else {
                        simboli++;
                    }
                }

                System.out.println("Caratteri alfabetici: " + alfabetici);
                System.out.println("Numeri: " + numeri);
                System.out.println("Simboli non alfanumerici: " + simboli);
            }
        } while (!input.equals("0"));
    }
}