/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asignacion11_arbolbinario;

/**
 *
 * @author david
 */
public class ArbolBinario<T> {
    private NodoArbol<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public ArbolBinario(T datoRaiz) {
        this.raiz = new NodoArbol<>(datoRaiz);
    }

    public ArbolBinario(T datoRaiz, ArbolBinario<T> arbolIzq, ArbolBinario<T> arbolDer) {
        this.raiz = new NodoArbol<>(datoRaiz);
        if (arbolIzq != null && !arbolIzq.empty()) {
            this.raiz.izq = arbolIzq.raiz;
        }
        if (arbolDer != null && !arbolDer.empty()) {
            this.raiz.der = arbolDer.raiz;
        }
    }

    public T getRootData() {
        if (raiz == null) {
            return null;
        }
        return raiz.dato;
    }

    public boolean empty() {
        return raiz == null;
    }

    public void clear() {
        raiz = null;
    }

    public int getHeight() {
        return getHeight(raiz);
    }

    private int getHeight(NodoArbol<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(nodo.izq), getHeight(nodo.der));
    }

    public int getNumberNodes() {
        return getNumberNodes(raiz);
    }

    private int getNumberNodes(NodoArbol<T> nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + getNumberNodes(nodo.izq) + getNumberNodes(nodo.der);
    }

    public void recorridoPreorden() {
        recorridoPreorden(raiz);
    }

    private void recorridoPreorden(NodoArbol<T> nodo) {
        if (nodo != null) {
            System.out.println(nodo.dato);
            recorridoPreorden(nodo.izq);
            recorridoPreorden(nodo.der);
        }
    }

    public void recorridoInorden() {
        recorridoInorden(raiz);
    }

    private void recorridoInorden(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.izq);
            System.out.println(nodo.dato);
            recorridoInorden(nodo.der);
        }
    }

    public void recorridoPostorden() {
        recorridoPostorden(raiz);
    }

    private void recorridoPostorden(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorridoPostorden(nodo.izq);
            recorridoPostorden(nodo.der);
            System.out.println(nodo.dato);
        }
    }
}
