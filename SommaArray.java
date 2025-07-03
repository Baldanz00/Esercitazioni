public class SommaArray {
    public static void main(String[] args) {
        
        //creo array di interi
        int [] num = {3,7,8,10,23};
        int somma =0;

        //controllo elementi array
        for (int i=0; i<num.length; i++) {
            somma += num[i];
        }
        System.out.println("La somma degli elementi dell'array è:" + somma);
    }
}
