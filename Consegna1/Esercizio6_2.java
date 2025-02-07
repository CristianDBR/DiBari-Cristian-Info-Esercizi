/*
Esercizio 6.2: Scrivere un programma che calcoli la somma e la media di un elenco di numeri inseriti dall'utente.
*/

import java.util.Scanner;

public class Esercizio6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0, count = 0;
        double numero;
        
        System.out.println("Inserisci numeri (0 per terminare): ");
        while (true) {
            numero = scanner.nextDouble();
            if (numero == 0) break;
            somma += numero;
            count++;
        }
        
        if (count > 0) {
            double media = somma / count;
            System.out.println("Somma: " + somma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nessun numero inserito.");
        }
        scanner.close();
    }
}
