/*
Esercizio 3.3: Scrivere un programma che sommi due numeri interi e stampi il risultato.
*/

import java.util.Scanner;

public class Esercizio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Inserisci il primo numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        numero2 = scanner.nextInt();
        int somma = numero1 + numero2;
        System.out.println("La somma dei due numeri è: " + somma);
        scanner.close();
    }
}
