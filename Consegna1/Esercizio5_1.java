/*
Esercizio 5.1: Scrivere un programma che calcoli il fattoriale di un numero.
*/

import java.util.Scanner;

public class Esercizio5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Inserisci un numero per calcolare il fattoriale: ");
        numero = scanner.nextInt();
        
        long fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }
        
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
        scanner.close();
    }
}
