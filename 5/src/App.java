import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        Integer array[];
        array = new Integer[8];

        

        for (int i = 0; i < array.length ; i++) {
            array[i] = rn.nextInt(100);
            System.out.print("["+(i+1) + "]-" + array[i] + "]  ");

        }

        System.out.print("\nDime un número del 1 al 8 y te elminino el que quieras: ");
        
        int num = sc.nextInt() -1;
        sc.close();

        for (int j = num; j < array.length-1; j++) {
            array[j] = array[j + 1];
        }

        for (int k = 0; k < array.length ; k++) {
            System.out.print("["+(k+1) + "]-" + array[k] + "]  ");

        }

        


    }
}