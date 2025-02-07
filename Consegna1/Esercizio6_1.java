/*
Esercizio 6.1: Scrivere un programma che stampi tutti i numeri primi fino a N.
*/

import java.util.Scanner;

public class Esercizio6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        System.out.print("Inserisci il valore di N: ");
        N = scanner.nextInt();
        
        System.out.print("Numeri primi fino a " + N + ": ");
        for (int num = 2; num <= N; num++) {
            boolean primo = true;
            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
