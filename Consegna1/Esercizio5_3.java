/*
Esercizio 5.3: Scrivere un programma che calcoli la somma di tutti i numeri divisibili per 3 o 5 fino a N.
*/

import java.util.Scanner;

public class Esercizio5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, somma = 0;
        System.out.print("Inserisci il valore di N: ");
        N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                somma += i;
            }
        }
        System.out.println("La somma dei numeri divisibili per 3 o 5 fino a " + N + " è: " + somma);
        scanner.close();
    }
}
