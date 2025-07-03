public class TrovaMassimo {
    public static void main(String[] args) {
        //array
        int [] num = {3,5,60,34,67};
        int massimo = num[0];

        //cerca il massimo
        for (int i = 1; i < num.length; i++){
            if (num[i]>massimo) {
                massimo=num[i];
            }
        }
        System.out.println("Il valore massimo presente è:" + massimo);
    }
}
