
import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //chiedi una stringa
        System.out.print("Inserisci una stringa");
        String parolaUtente = scan.nextLine();

        //inverti la stringa
        String contrarioStringa = " ";
        for(int i=parolaUtente.length()-1; i>=0;i--) {
            contrarioStringa += parolaUtente.charAt(i);
        }
        System.out.println("La stringa al contrario è:" + contrarioStringa);
    }
}
