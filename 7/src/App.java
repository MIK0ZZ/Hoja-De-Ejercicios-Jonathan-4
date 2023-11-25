import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = {1, 4, 4, 5, 7, 7, 9};
        Arrays.sort(array);


        System.out.println("Array sin modificar: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + "]  ");
        }

        int num = array.length;
        int j = 0;

        for (int i = 0; i < num - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j] = array[i];
                j++;
            } 
        }

        array[j] = array[num - 1];

        System.out.println("\nArray modificado: ");
        for (int k = 0; k <= j ; k++) {
            System.out.print(array[k] + "]  ");

        }
    }
}
