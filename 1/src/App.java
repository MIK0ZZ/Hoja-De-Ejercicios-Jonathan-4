import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rn = new Random();

        int array[];
        array = new int[8];

        for (int i = 0; i < array.length ; i++) {
            array[i] = rn.nextInt(100);
        }

        int resultado = 0;

        for (int j = 0; j < array.length; j++) {
            resultado += array[j];
        }

        System.out.println(resultado);

    }
}
