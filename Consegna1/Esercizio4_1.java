/*
Esercizio 4.1: Scrivere un programma che calcoli la somma di tutti i numeri pari da 1 a N.
*/

import java.util.Scanner;

public class Esercizio4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, somma = 0;
        System.out.print("Inserisci il valore di N: ");
        N = scanner.nextInt();
        for (int i = 2; i <= N; i += 2) {
            somma += i;
        }
        System.out.println("La somma dei numeri pari fino a " + N + " è: " + somma);
        scanner.close();
    }
}
