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
        System.out.println("3. Ordenamiento por Inserción"); // <--- NUEVA OPCIÓN
        System.out.print("Elige una opción (1, 2 o 3): ");
        
        int opcion = scanner.nextInt();

        System.out.println("\nArreglo original: " + Arrays.toString(arreglo));

        switch (opcion) {
            case 1:
                System.out.println("Ejecutando Selección...");
                misOrdenamientos.seleccion(arreglo);
                break;
            case 2:
                System.out.println("Ejecutando Burbuja...");
                misOrdenamientos.burbuja(arreglo);
                break;
            case 3: // <--- NUEVO CASO
                System.out.println("Preparando Inserción...");
                misOrdenamientos.insercion(arreglo);
                break;
            case 4:
                System.out.println("Ejecutando Quicksort");
                misOrdenamientos.quicksort(arreglo);
            default:
                System.out.println("Opción no válida.");
                return; 
        }

        System.out.println("¡Arreglo ordenado con éxito!");
        System.out.println("Arreglo final: " + Arrays.toString(arreglo));
        
        scanner.close();
    }
}