public class InvertiArray {
    public static void main(String[] args) {
        int [] numeriArray = {10,34,3,5,7,23};
        System.out.println("L'array in ordine inverso:");
        for (int i=numeriArray.length -1; i>= 0; i--) {
            System.out.println(numeriArray[i] + " ");
        }
    }
}
