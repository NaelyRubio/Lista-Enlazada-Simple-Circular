/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_229324;

/**
 *
 * @author naely
 */
public class ListaEnlazadaSimpleCircular {

    private NodoCircular ultimo;
    private int tam;

    public ListaEnlazadaSimpleCircular() {
        this.ultimo = null;
        this.tam = 0;

    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return ultimo == null;
    }

    /**
     *
     * @return
     */
    public int size() {
        return tam;
    }

    /**
     *
     * @param dato
     * @return
     */
    public boolean addFirst(int dato) {

        if (String.valueOf(dato).length() > 50) {
            return false;
        }

        NodoCircular nuevo = new NodoCircular(dato);
        if (isEmpty()) {
            nuevo.siguiente = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        tam++;
        return true;
    }

    /**
     *
     * @param dato
     * @return
     */
    public boolean addLast(int dato) {
        if (addFirst(dato)) {
            ultimo = ultimo.siguiente;
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }

        if (ultimo == ultimo.siguiente) {
            ultimo = null;
        } else {
            ultimo.siguiente = ultimo.siguiente.siguiente;
        }
        tam--;
        return true;
    }

    /**
     *
     * @return
     */
    public boolean removeLast() {
        if (isEmpty()) {
            return false;
        }

        if (ultimo == ultimo.siguiente) {
            ultimo = null;
        } else {
            NodoCircular actual = ultimo.siguiente;
            while (actual.siguiente != ultimo) {
                actual = actual.siguiente;
            }
            actual.siguiente = ultimo.siguiente;
            ultimo = actual;
        }
        tam--;
        return true;
    }

    /**
     *
     * @param dato
     * @return
     */
    public boolean contains(int dato) {
        if (isEmpty()) {
            return false;
        }

        NodoCircular actual = ultimo.siguiente;
        do {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return false;
    }

    /**
     *
     * @param index
     * @return
     */
    public int getElement(int index) {
        if (index < 0 || index >= tam) {
            return Integer.MIN_VALUE;
        }

        NodoCircular actual = ultimo.siguiente;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }
    
    /**
     * 
     */
    public void clear() {
        ultimo = null;
        tam = 0;
    }
    
    
    /**
     * 
     * @return 
     */
     public String toString() {
        if (isEmpty()) return "Lista vacía";

        StringBuilder sb = new StringBuilder();
        NodoCircular actual = ultimo.siguiente;
        do {
            sb.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return sb.append("(circular)").toString();
    }
}
