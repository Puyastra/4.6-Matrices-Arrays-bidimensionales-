/**Ejercicio con el objetivo de crear un programa que cree una matriz de 10x10
* e introduzca los valores de las tablas de
* multiplicar del 1 al 10
*
*@author Enrique García Herrera
*/
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
