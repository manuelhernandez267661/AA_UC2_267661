/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.asignacion.ordenamientos;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author isaac
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // CORRECCIÓN AQUÍ: Usamos el nombre correcto de tu clase
        OrdenamientosSyB misOrdenamientos = new OrdenamientosSyB();
        
        // Arreglo de prueba
        int[] arreglo = {64, 25, 12, 22, 11, 90, 33};

        System.out.println("=== MENÚ DE ORDENAMIENTOS ===");
        System.out.println("1. Ordenamiento por Selección");
        System.out.println("2. Ordenamiento de Burbuja");
        System.out.print("Elige una opción (1 o 2): ");
        
        int opcion = scanner.nextInt();
        System.out.println("\nArreglo original: " + Arrays.toString(arreglo));
        
        switch (opcion) {
            case 1:
                System.out.println("\nEjecutando Selección...");
                misOrdenamientos.seleccion(arreglo);
                break;
            case 2:
                System.out.println("\nEjecutando Burbuja...");
                misOrdenamientos.burbuja(arreglo);
                break;
            default:
                System.out.println("Opción no válida.");
                return; // Termina el programa si elige mal
        }

        System.out.println("¡Arreglo ordenado con éxito!");
        System.out.println("Arreglo final: " + Arrays.toString(arreglo));
        
        scanner.close();
    }
}