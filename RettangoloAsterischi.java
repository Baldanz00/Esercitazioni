import java.util.Scanner;

public class RettangoloAsterischi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //chiedi all'utente
        System.out.print("Inserisci il numero di colonne:");
        int colonne =scan.nextInt();
        System.out.print("Inserisci il numero di righe:");
        int righe =scan.nextInt();

        for ( int i=0;i<=righe;i++) {
            for (int j=0;j<=colonne;j++)
            System.out.print("*");
        }
        System.out.println();
        
    }
}
