package org.learning.snacks;

import java.util.Scanner;

public class Snack01 {
    /*Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari: " + numero);
        } else {
            System.out.println("Il numero è dispari, il numero pari successivo è: " + (numero + 1));
        }
    }
}
