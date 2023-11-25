import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rn = new Random();

        int mayor = 0;

        int array[];
        array = new int[8];

        System.out.print("Números en el array: ");

        

        for (int i = 0; i < array.length ; i++) {
            array[i] = rn.nextInt(100);
            System.out.print(" " + array[i] + " ");

            if (array[i] > mayor) {
                mayor = array[i];
            }
            
        }

        System.out.println("El número mayor es: " + mayor);


    }
}
