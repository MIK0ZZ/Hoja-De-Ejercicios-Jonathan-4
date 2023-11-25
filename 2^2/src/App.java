public class App {
    public static void main(String[] args) throws Exception {
        
        int matriz1[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int matrizR[][];
        matrizR = new int[3][3];

        System.out.println("-----");

        //Mostrar primera matriz
        for (int i = 0; i < matriz1.length ; i ++) {
            for (int j = 0; j < matriz1[0].length ; j ++) {
                System.out.print( matriz1[i][j] + " ");
            }
            System.out.println() ;
        }
        System.out.println("-----");


        //Trasponer
        for (int i = 0; i < matriz1.length ; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizR[j][i] = matriz1[i][j];
            }
        }
        

        //Mostrar resultado
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR[0].length; j++) {
                System.out.print( matrizR[i][j] + " ");
            }
            System.out.println() ;
        }

        System.out.println("-----");

        
    }
}
