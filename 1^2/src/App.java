public class App {
    public static void main(String[] args) throws Exception {
        
        int matriz1[] = {
            1,2,3,
            4,5,6,
            7,8,9
        };
        int matriz2[] = {
            9,8,7,
            6,5,4,
            3,2,1
        };

        int matrizR[];
        matrizR = new int[9];

        System.out.println("-----");

        //Mostrar primera matriz
        for (int i = 0; i < matriz1.length;) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i] + " ");
                i++;
            }
            System.out.println("");
            
        }

        System.out.println("-----");

        //Mostrar segunda matriz
        for (int i = 0; i < matriz2.length;) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i] + " ");
                i++;
            }
            System.out.println("");
            
        }

        System.out.println("-----");

        //Suma
        for (int i = 0; i < matrizR.length; i++) {
            matrizR[i] = matriz1[i] + matriz2[i];
        }

        //Mostrar resultado
        for (int i = 0; i < matrizR.length;) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizR[i] + " ");
                i++;
            }
            System.out.println("");
            
        }

        System.out.println("-----");

        
    }
}
