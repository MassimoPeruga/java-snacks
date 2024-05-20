package org.learning.snacks;

import java.util.Scanner;

public class Snack07 {
    /*Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri
    a video la stringa generata (secondi → “hh:mm:ss”)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di secondi: ");
        int secondiTotali = scanner.nextInt();

        int ore = secondiTotali / 3600;
        int minuti = (secondiTotali % 3600) / 60;
        int secondi = secondiTotali % 60;

        System.out.printf("%02d:%02d:%02d\n", ore, minuti, secondi);
    }
}