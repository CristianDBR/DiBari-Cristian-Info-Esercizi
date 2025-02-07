/* 
    Progetto 3 - Creare un programma che simuli una calcolatrice con le operazioni base:
    somma, sottrazione, moltiplicazione e divisione. L'utente dovrà scegliere l'operazione
    tramite un menu, inserire i numeri e ottenere il risultato.
*/

import java.util.Scanner;

public class ProgettoCapitolo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Operazioni:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Esci");
            System.out.print("Scegli un'operazione: ");
            int scelta = scanner.nextInt();

            if (scelta == 5) {
                break;
            }

            System.out.print("Inserisci il primo numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            double num2 = scanner.nextDouble();

            double risultato = 0;
            switch (scelta) {
                case 1:
                    risultato = num1 + num2;
                    break;
                case 2:
                    risultato = num1 - num2;
                    break;
                case 3:
                    risultato = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        risultato = num1 / num2;
                    } else {
                        System.out.println("Errore: Divisione per zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    continue;
            }
            System.out.println("Il risultato è: " + risultato);
        }

        scanner.close();
    }
}
