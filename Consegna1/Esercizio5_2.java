/*
Esercizio 5.2: Scrivere un programma che stampi la sequenza di Fibonacci fino a N.
*/

import java.util.Scanner;

public class Esercizio5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, a = 0, b = 1;
        System.out.print("Inserisci il numero N: ");
        N = scanner.nextInt();
        
        System.out.print("Sequenza di Fibonacci: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        scanner.close();
    }
}
