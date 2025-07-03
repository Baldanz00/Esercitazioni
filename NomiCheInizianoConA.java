public class NomiCheInizianoConA {
    public static void main(String[] args) {
        //array
        String [] nomi = {"Anna", "Paolo", "Antonio", "Francesco"};
        System.out.println("I nomi che iniziano  con 'A' :");
        for(String nome : nomi) {
            if (nome.toLowerCase().startsWith ("a")) {
                System.out.println(nome);
            }
        }
    }
}
