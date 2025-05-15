/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_229324;

/**
 *
 * @author naely
 */
public class NodoCircular {
    
    public int dato;
    public NodoCircular siguiente;

    public NodoCircular() {
    }

    public NodoCircular(int dato, NodoCircular siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
      public NodoCircular(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
