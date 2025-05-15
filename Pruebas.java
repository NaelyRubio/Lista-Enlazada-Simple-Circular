/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc2_229324;

/**
 *
 * @author naely
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadaSimpleCircular lista = new ListaEnlazadaSimpleCircular();

        System.out.println("¿La lista está vacía?: " + lista.isEmpty());
        System.out.println("Tamaño de la lista: " + lista.size());

        System.out.println("\n-- Agregando al inicio: 5 --");
        lista.addFirst(5);
        System.out.println("Contenido: " + lista.toString());

        System.out.println("\n-- Agregando al inicio: 10 --");
        lista.addFirst(10);
        System.out.println("Contenido: " + lista.toString());

        System.out.println("¿Contiene 5?: " + lista.contains(5));
        System.out.println("¿Contiene 20?: " + lista.contains(20));

        System.out.println("Tamaño actual: " + lista.size());

        System.out.println("\n-- Eliminando el primero --");
        lista.removeFirst();
        System.out.println("Contenido: " + lista.toString());

        System.out.println("\n-- Eliminando el último --");
        lista.removeLast();
        System.out.println("Contenido: " + lista.toString());

        System.out.println("¿La lista está vacía?: " + lista.isEmpty());
        System.out.println("Tamaño final: " + lista.size());
    }
}
