public class App {
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int matriz[][] = {{5,10,15},{20,25,30},{35,40,45}};
        int promedio = 0;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++){
                promedio += (matriz[i][j]);

            }
            promedio = promedio/3;
            System.out.println("Fila " + (i+1) + ": " + promedio);
            promedio = 0;
        }

        System.out.println("");

        for(int k = 0; k < matriz.length; k++) {
            for(int j = 0; j < matriz[0].length; j++){
                promedio += (matriz[j][k]);

            }
            promedio = promedio/3;
            System.out.println("Columna " + (k+1) + ": " + promedio);
            promedio = 0;
        }


    }
}
