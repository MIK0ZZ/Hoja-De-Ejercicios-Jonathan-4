import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rn = new Random();

        int array[];
        array = new int[8];

        for (int i = 0; i < array.length ; i++) {
            array[i] = rn.nextInt(100);
            
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " es par");
            } else {System.out.println(array[i] + " es impar");}
        }


    }
}
