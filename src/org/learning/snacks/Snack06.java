package org.learning.snacks;

import java.util.Scanner;

public class Snack06 {
    /*Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare
    funzioni già pronte.
    Possibile usare solo :
    cicli
    chartAt
    if / switch
    Es. “25" come stringa deve essere convertito in intero 25.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        String stringa = scanner.nextLine();

        int numero = 0;

        for (int i = 0; i < stringa.length(); i++) {
            char c = stringa.charAt(i);
            if (c >= '0' && c <= '9') {
                numero = numero * 10 + (c - '0');
            } else {
                System.out.println("La stringa contiene caratteri non numerici.");
                return;
            }
        }

        System.out.println("Numero convertito: " + numero);
    }
}