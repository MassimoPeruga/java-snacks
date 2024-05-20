package org.learning.snacks;

import java.util.Scanner;

public class SnackCinque {
    /*Data una base (intera) e un esponente (intero positivo) calcolare la potenza*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la base: ");
        int base = scanner.nextInt();

        System.out.print("Inserisci l'esponente: ");
        int esponente = scanner.nextInt();

        int risultato = 1;
        for (int i = 0; i < esponente; i++) {
            risultato *= base;
        }

        System.out.println("Il risultato di " + base + " elevato alla potenza " + esponente + " è: " + risultato);
    }
}
