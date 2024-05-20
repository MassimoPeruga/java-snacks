package org.learning.snacks;

import java.util.Arrays;
import java.util.Scanner;

public class SnackBonus {
    /*Simulare il push di un array javascript usando però array java*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array originale: " + Arrays.toString(array));

        System.out.print("Inserisci un numero da aggiungere all'array: ");
        int nuovoElemento = scanner.nextInt();

        // Crea un nuovo array con una dimensione maggiore di 1
        int[] nuovoArray = new int[array.length + 1];

        // Copia i vecchi elementi nel nuovo array
        for (int i = 0; i < array.length; i++) {
            nuovoArray[i] = array[i];
        }

        // Aggiungi il nuovo elemento alla fine del nuovo array
        nuovoArray[nuovoArray.length - 1] = nuovoElemento;

        System.out.println("Nuovo array: " + Arrays.toString(nuovoArray));
    }
}
