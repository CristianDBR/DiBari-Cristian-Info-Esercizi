/*
Esercizio 3.1: Scrivere un programma che legga un punteggio e dica se è valido (compreso tra 0 e 100).
*/

import java.util.Scanner;

public class Esercizio3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punteggio;
        System.out.print("Inserisci il punteggio: ");
        punteggio = scanner.nextInt();
        if (punteggio >= 0 && punteggio <= 100) {
            System.out.println("Punteggio valido.");
        } else {
            System.out.println("Punteggio non valido.");
        }
        scanner.close();
    }
}
