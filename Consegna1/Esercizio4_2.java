/*
Esercizio 4.2: Scrivere un programma che stampi la tabellina di un numero scelto dall'utente.
*/

import java.util.Scanner;

public class Esercizio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Inserisci un numero per la tabellina: ");
        numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
