/*
Esercizio 6.3: Scrivere un programma che ordini una lista di numeri in ordine crescente.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int n = scanner.nextInt();
        
        int[] numeri = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeri);
        
        System.out.println("Numeri ordinati: " + Arrays.toString(numeri));
        scanner.close();
    }
}
