/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.uide.sumativa;

/**
 *
 * @author Usuario
 */
public class ejecutable {

 public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar("10");
        arbol.insertar("5");
        arbol.insertar("15");
        arbol.insertar("3");
        arbol.insertar("8");
        arbol.insertar("20");

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreOrden();
        System.out.println("\n\nRecorrido InOrden");
        arbol.recorridoInorden();
        System.out.println("\n\nRecorrido Post Orden");
        arbol.recorridoPosOrden();
    }
}
