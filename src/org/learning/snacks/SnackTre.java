package org.learning.snacks;

import java.util.Scanner;

public class SnackTre {
    /*Crea una classe con il metodo main in cui chiedi all’utente di darti un numero intero e,
    preso in ingresso un numero, stampi un disegno di questo tipo:
    Input: 7
    Output:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6
    1 2 3 4 5 6 7*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}