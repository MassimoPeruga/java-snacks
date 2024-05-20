package org.learning.snacks;

import java.util.Scanner;

public class Snack04 {
    /*Data in input una stringa verificare se è palindroma*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        String stringaInvertita = new StringBuilder(stringa).reverse().toString();

        if (stringa.equals(stringaInvertita)) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
    }
}
