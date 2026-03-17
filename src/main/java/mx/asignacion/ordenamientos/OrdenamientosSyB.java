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
        int n = arr.length; 
        
        for (int i = 1; i < n; i++) { 
            int key = arr[i]; 
            int j = i - 1;    
            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1;           
            }
            arr[j + 1] = key; 
        }
    
    }
}

