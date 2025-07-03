/*CHIEDERE ALL'UTENTE DI QUALE NUMERO STAMPARE LA TABELLINA E FINO A QUALE NUMERO ARRIVARE. */

import java.util.Scanner;
public class Tabellina {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //chedo all'utente di inserire un numero
        System.out.print("Di quale numero vuoi stampare la tabellina?");
        int numeroTabellina = scan.nextInt();

        //chiedo all'utente fino a quale numero arrivare
        System.out.print("Finoma quale numero vuoi arrivare?");
        int numeroFineTabellina = scan.nextInt();

        //tabellina
        System.out.println("Tabellina del " + numeroTabellina + "fino a " + numeroFineTabellina + ":");
        for (int i = 1; i <= numeroFineTabellina; i++) {
            System.out.println(numeroTabellina + "x" + i + "=" + (numeroFineTabellina*i));
        }
        }
}