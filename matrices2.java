public class matrices2 {
    public static void main(String[] args) {
            int[][] matriz = new int[10][10];
            for(int filas = 0;filas <10; filas++){
                for(int columnas = 0;columnas<10;columnas++){
                    matriz[filas][columnas] = (filas +1) * (columnas +1);
                }
            }
            for(int filas =0; filas<10; filas++){
                for(int columnas = 0; columnas<10; columnas++){
                    System.out.print(matriz[filas][columnas] + "\t");
                }
                System.out.println();
            }
    }   
}
