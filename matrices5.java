/**
 * Ejercicio con el objetivo de crear un programa para registrar sueldos de
 * hombres y mujeres de una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá
 * por teclado la
 * información de N personas distintas. Para cada
 * persona, pedirá su género y su sueldo. Esta información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio
 * de cada
 * género.
 * 
 * @author Enrique García Herrera
 */

public class matrices5 {
    public static void main(String[] args) {
        System.out.print("Ingresa la cantidad de personas: ");
        int N = Integer.parseInt(System.console().readLine());
        double matriz[][] = new double[N][2];
        for (int filas = 0; filas < N; filas++) {
            System.out.println("");
            System.out.println("Ingresa el valor de la persona nª" + (filas + 1) + "(0 para varón, 1 para mujer)");
            int genero = Integer.parseInt(System.console().readLine());
            System.out.println("");
            System.out.println("Ingresa el sueldo de la persona nº" + (filas + 1));
            double sueldo = Double.parseDouble(System.console().readLine());
            matriz[filas][0] = genero;
            matriz[filas][1] = sueldo;
        }
        double mediaHombres = 0;
        double mediaMujeres = 0;
        int numeroHombres = 0;
        int numeroMujeres = 0;
        for (double[] fila : matriz) {
            if ((int) fila[0] == 0) {
                mediaHombres += fila[1];
                numeroHombres++;
            } else {
                mediaMujeres += fila[1];
                numeroMujeres++;
            }
        }
        if (numeroHombres > 0) {
            mediaHombres /= numeroHombres;
        }
        if (numeroMujeres > 0) {
            mediaMujeres /= numeroMujeres;
        }
        System.out.println("Sueldo medio de los varones: " + mediaHombres + "€");
        System.out.println("Sueldo medio de las mujeres: " + mediaMujeres + "€");
        if (mediaMujeres != mediaHombres) {
            System.out.println("Existe brecha salarial.");
        } else {
            System.out.println("No existe brecha salarial.");
        }
    }
}