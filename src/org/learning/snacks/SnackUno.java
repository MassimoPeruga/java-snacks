package org.learning.snacks;

import java.util.Scanner;

public class SnackUno {
    /*
     * Crea un programma che, data la lunghezza di tre segmenti (di lunghezza non negativa),
     * restituisca vero se è possibile costruirci un triangolo, altrimenti falso. la proprietà
     * fondamentale dei lati di un triangolo dice che: “In un triangolo ogni lato è minore della somma
     * degli altri due”
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first, second, third;

        System.out.print("Inserisci la lunghezza del primo lato: ");
        first = Integer.parseInt(scanner.nextLine());

        System.out.print("Inserisci la lunghezza del secondo lato: ");
        second = Integer.parseInt(scanner.nextLine());

        System.out.print("Inserisci la lunghezza del terzo lato: ");
        third = Integer.parseInt(scanner.nextLine());

        boolean triangle = false;

        if( first + second > third && first + third > second && second + third > first){
            triangle = true;
        }

        System.out.println("Le lunghezze dei lati inseriti " + (triangle ? "" : "non ") + "formano un triangolo.");
    }
}
