/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.asignacion.ordenamientos;

/**
 * @author isaac
 */
public class OrdenamientosSyB {

    public void seleccion(int[] arr) {
        // 1 asignación, 1 acceso a propiedad = 2 operaciones
        int n = arr.length; 
        
        // 1 asignación inicial; n comparaciones; (n-1) incrementos
        for (int i = 0; i < n - 1; i++) { 
            
            // (n-1) asignaciones
            int min_idx = i; 
            
            // (n-1) asignaciones; n(n-1)/2 comparaciones; n(n-1)/2 incrementos
            for (int j = i + 1; j < n; j++) { 
                
                // n(n-1)/2 comparaciones de arreglo (incluye accesos)
                if (arr[j] < arr[min_idx]) { 
                    
                    // Peor caso: n(n-1)/2 asignaciones
                    min_idx = j; 
                }
            }
            
            // Intercambio (Swap)
            // (n-1) asignaciones (con acceso)
            int temp = arr[min_idx]; 
            // (n-1) asignaciones
            arr[min_idx] = arr[i];   
            // (n-1) asignaciones
            arr[i] = temp;           
        }
        /* * EXPRESIÓN ALGEBRAICA (Peor caso aproximado):
         * T(n) = a*n^2 + b*n + c
         * Notación Asintótica: O(n^2)
         */
    } // Aquí termina el método seleccion

    public void burbuja(int[] arr) {
        // 1 asignación, 1 acceso = 2 operaciones
        int n = arr.length; 
        
        // 1 asignación inicial; n comparaciones; (n-1) incrementos
        for (int i = 0; i < n - 1; i++) { 
            
            // (n-1) asignaciones; n(n-1)/2 comparaciones; n(n-1)/2 incrementos
            for (int j = 0; j < n - i - 1; j++) { 
                
                // n(n-1)/2 comparaciones (incluye accesos a posiciones)
                if (arr[j] > arr[j + 1]) { 
                    
                    // Peor caso (arreglo invertido): n(n-1)/2 asignaciones
                    int temp = arr[j];       
                    // n(n-1)/2 asignaciones
                    arr[j] = arr[j + 1];     
                    // n(n-1)/2 asignaciones
                    arr[j + 1] = temp;       
                }
            }
        }
        /* * EXPRESIÓN ALGEBRAICA (Peor caso aproximado):
         * T(n) = a*n^2 + b*n + c
         * Notación Asintótica: O(n^2)
         */
    }
// Método de Inserción (Estructura base)
    public void insercion(int[] arr) {
        // 1 asignación, 1 acceso = 2 operaciones
        int n = arr.length; 
        
        // 1 asignación inicial; n comparaciones; (n-1) incrementos
        for (int i = 1; i < n; i++) { 
            
            // (n-1) asignaciones, (n-1) accesos
            int key = arr[i]; 
            // (n-1) asignaciones, (n-1) restas
            int j = i - 1;    
            
            // Peor caso (arreglo invertido): el while se ejecuta 'i' veces por ciclo.
            // Total de comparaciones lógicas: n(n-1)/2
            while (j >= 0 && arr[j] > key) { 
                
                // n(n-1)/2 asignaciones y accesos
                arr[j + 1] = arr[j]; 
                // n(n-1)/2 asignaciones y restas
                j = j - 1;           
            }
            
            // Colocar la "llave" en su posición correcta
            // (n-1) asignaciones
            arr[j + 1] = key; 
        }
        /* * EXPRESIÓN ALGEBRAICA (Peor caso aproximado):
         * T(n) = a*n^2 + b*n + c
         * Notación Asintótica: O(n^2)
         */
    }
    public void quickSort (int[] arr) {
       // 1 llamada a método
        quickSortRecursivo(arr, 0, arr.length - 1);
    }

    // Método recursivo interno
    private void quickSortRecursivo(int[] arr, int inicio, int fin) {
        // 1 comparación
        if (inicio < fin) {
            // 1 asignación, 1 llamada a método
            int indiceParticion = particion(arr, inicio, fin);
            
            // 2 llamadas recursivas, 2 operaciones aritméticas
            quickSortRecursivo(arr, inicio, indiceParticion - 1);
            quickSortRecursivo(arr, indiceParticion + 1, fin);
        }
    }

    // Método para dividir el arreglo (Lógica de partición)
    private int particion(int[] arr, int inicio, int fin) {
        // 2 asignaciones, 1 acceso a arreglo, 1 resta = 4 operaciones base
        int pivote = arr[fin]; 
        int i = (inicio - 1);

        // El ciclo se ejecuta 'n' veces (tamaño del subarreglo)
        for (int j = inicio; j < fin; j++) {
            // n comparaciones, n accesos
            if (arr[j] < pivote) {
                // Peor caso: n incrementos
                i++;
                // Peor caso: 3n asignaciones, 4n accesos (Intercambio)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Colocar el pivote: 3 asignaciones, 4 accesos, 2 sumas
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1; // 1 retorno, 1 suma
        
        /* * EXPRESIÓN ALGEBRAICA Y COMPLEJIDAD:
         * Mejor caso / Caso Promedio: El pivote divide el arreglo a la mitad.
         * T(n) = 2T(n/2) + O(n) -> Notación Asintótica: O(n log n)
         * Peor caso: El pivote es el mayor o menor elemento siempre.
         * T(n) = T(n-1) + O(n) -> Notación Asintótica: O(n^2)
         */
    }
}

