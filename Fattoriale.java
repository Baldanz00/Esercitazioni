/*CHIEDERE ALL'UTENTE UN NUMERO E CALCOLA IL FATTORIALE */

import java.util.Scanner;
public class Fattoriale {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);

        //chiedo un numero all'utente
        System.out.print("Inserisci un numero intero : ");
        int n = scan.nextInt();

        //verifico che il numero sia positivo per poterne calcolare il fattoriale
        if (n<0) {
            System.out.println("il numero deve essere positivo.");
        } else {
            long fattoriale =1; //uso long perchè il fattoriale cresce in fretta e potrebbe servirmi più spazio.
            for ( int i=1; i<=n; i++) {
                fattoriale *=i;
            }
            System.out.println("Il fattoriale di " + n + " è:" + fattoriale);
        }
    }
}