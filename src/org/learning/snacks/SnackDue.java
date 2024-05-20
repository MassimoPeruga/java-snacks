package org.learning.snacks;

import java.util.Scanner;

public class SnackDue {
    /*    Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
        Il numero N deve essere compreso tra 1 e 20: continuare a chiedere N all’utente finché
        non fornisce un numero valido.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber;

        do {
            System.out.print("Inserisci un numero compreso tra 1 e 20: ");
            inputNumber = scanner.nextInt();
        } while (inputNumber < 1 || inputNumber > 20);

        for (int i = 1; i <= inputNumber ; i++) {
            System.out.println(i + "^3 = " + (i*i*i));
        }
    }
}
