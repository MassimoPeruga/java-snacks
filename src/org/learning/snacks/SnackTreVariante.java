package org.learning.snacks;

public class SnackTreVariante {
    /*
    Crea una classe con metodo main che stampi il seguente albero di Natale
    *
    ***
    *****
    *******
    *********
    ***********
    *************
    ***************
    *****************
    *******************
    */

    public static void main(String[] args) {
        int altezza = 10;

        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < altezza - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}