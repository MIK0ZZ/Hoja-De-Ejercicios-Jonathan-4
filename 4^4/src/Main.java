import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        //Mostrar matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        boolean estaTerminado = false;
        int suma = 0;

        for(int j = 0; j < 3; j++) {
            estaTerminado = false;
            while(estaTerminado == false) {
                System.out.println("Dime la posición (fila - columna) para sumar: ");
                System.out.print("Fila: ");
                int input_fila = sc.nextInt()-1;
                System.out.print("Columna: ");
                int input_columna = sc.nextInt()-1;

                if(input_fila >= 0 && input_fila < matriz . length && input_columna >= 0 && input_columna < matriz [0]. length) {
                    System.out.println("Seleccionado: " + matriz[input_fila][input_columna]);
                    System.out.println("-DATOS CORRECTOS-PROCEDIENDO-");
                    suma += matriz[input_fila][input_columna];
                    estaTerminado = true;



                } else {System.out.println("-DATOS INCORRECTOS-REPITIENDO-");}



            }
        }

        System.out.println("La suma es: " + suma);







    }
}