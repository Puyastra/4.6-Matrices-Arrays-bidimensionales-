public class matrices3 {
    public static void main(String[] args) {
        System.out.println("Elige el tamaño de la matriz(filas):");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("ahora las columnas:");
        int M = Integer.parseInt(System.console().readLine());
        int[][] matriz = new int[N][M];
        System.out.println("Ingresa valores de la matriz:");
        for(int filas = 0;filas<N;N++){
            for(int columnas = 0; columnas<M;M++){
                System.out.println("Matriz[" + filas +"][" + columnas + "]");
                matriz[filas][columnas] = Integer.parseInt(System.console().readLine());
            }
        }
    }   int masQue0 = 0;
        int menosQue0 = 0;
        int igualQue0 = 0;
        for(int filas = 0; filas < N;filas++){
            for(int columnas = 0; columnas <M;columnas++){
                if (matriz[filas][columnas] > 0) {
                    masQue0++;
                } else if (matriz[filas][columnas] < 0) {
                    menosQue0++;
                } else if (matriz[filas][columnas] == 0) {
                    igualQue0++;
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Valores mayores que 0: " + masQue0);
        System.out.println("Valores menores que 0: " + menosQue0);
        System.out.println("Valores iguales a 0: " + igualQue0);
    }
}
