/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.asignacion.ordenamientos;

/**
 *
 * @author isaac
 */
class BST {
    class Nodo {
        int valor;
        Nodo izquierdo, derecho;
        
        public Nodo(int item){
            valor = item;
            izquierdo = derecho = null;
        }
    }
    Nodo raiz;
    // Constructor del árbol vacío
    public BST() {
        raiz = null;
    }
    
    // a. Inserción de elementos
    // Propósito: Método público para insertar un nuevo valor en el árbol.
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        // Si el árbol/subárbol está vacío, retorna un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        // De lo contrario, recorre el árbol
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }
    // Retorna el puntero al nodo (sin cambios)
        return raiz;
    }
}

