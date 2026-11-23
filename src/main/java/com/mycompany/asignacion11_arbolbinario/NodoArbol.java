/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion11_arbolbinario;

/**
 *
 * @author david
 */
public class NodoArbol<T> {
    T dato;
    NodoArbol<T> izq;
    NodoArbol<T> der;

    public NodoArbol(T dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
}