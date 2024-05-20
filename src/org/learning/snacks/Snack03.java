package org.learning.snacks;

public class Snack03 {
    /*Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari*/
    public static void main(String[] args) {
        int[] numeri = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            // Controlla se la posizione è dispari
            if (i % 2 != 0) {
                somma += numeri[i];
            }
        }

        System.out.println("La somma degli elementi nelle posizioni dispari è: " + somma);
    }
}
