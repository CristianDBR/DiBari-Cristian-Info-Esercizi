/*
Esercizio 4.3: Scrivere un programma che calcoli il massimo tra tre numeri inseriti dall'utente.
*/

import java.util.Scanner;

public class Esercizio4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Inserisci il primo numero: ");
        num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        num2 = scanner.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        num3 = scanner.nextInt();
        
        int massimo = num1;
        if (num2 > massimo) massimo = num2;
        if (num3 > massimo) massimo = num3;
        
        System.out.println("Il numero massimo è: " + massimo);
        scanner.close();
    }
}
