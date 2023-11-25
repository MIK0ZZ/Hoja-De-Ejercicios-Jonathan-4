import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Dime un número del 1 al 100 y te digo si esta entre los siguientes números aleatorios: ");
        
        
        int posicion = -1;

        int array[];
        array = new int[8];

        System.out.print("Números en el array: ");

        

        for (int i = 0; i < array.length ; i++) {
            array[i] = rn.nextInt(100);
            System.out.print("|" + array[i] + "| ");

            

            
        }

        System.out.print("\nNúmero: ");
        int buscado = sc.nextInt();
        sc.close();

        boolean encontrado = false;
        int j = 0;

        while ((encontrado == false) && (j < array.length)) {
            if (array[j] == buscado) {
                encontrado = true;
                posicion = j;
            }
            j++;
        }

        if (posicion != (-1)) {
            System.out.println("El número : " + buscado + " se encuentra en la posición " + (posicion + 1));
        } else {System.out.println("El número : " + buscado + " no se ha encontrado");}

        
        


    }
}
