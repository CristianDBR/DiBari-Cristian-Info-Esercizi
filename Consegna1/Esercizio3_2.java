/*
Esercizio 3.2: Scrivere un programma che legga un numero intero e determini se è pari o dispari.
*/

import java.util.Scanner;

public class Esercizio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Inserisci un numero intero: ");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }
        scanner.close();
    }
}
