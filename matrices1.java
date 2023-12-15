/**
 * Ejercicio con el objetivo de crear un programa que cree una matriz de tamaño
 * 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 * 
 * @author Enrique García Herrera
 */
public class matrices1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contador = 1;
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                matriz[filas][columnas] = contador++;
            }
        }
        for (int filas = 0; filas < 5; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.print(matriz[filas][columnas] + "\t");
            }
            System.out.println();
        }
    }
}
