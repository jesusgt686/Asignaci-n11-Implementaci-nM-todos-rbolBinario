/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asignacion11_arbolbinario;

/**
 *
 * @author david
 */
public class Asignacion11_ArbolBinario {

    public static void main(String[] args) {
        ArbolBinario<Familiar> abueloPat = new ArbolBinario<>(
            new Familiar("Manuel Garcia", 86, "Agricultor", true, "Morelos")
        );
        ArbolBinario<Familiar> abuelaPat = new ArbolBinario<>(
            new Familiar("Rosa Elena", 84, "Ama de casa", false, "Morelos")
        );

        ArbolBinario<Familiar> abueloMat = new ArbolBinario<>(
            new Familiar("Hipolito Torres", 85, "Comerciante", true, "Morelos")
        );
        ArbolBinario<Familiar> abuelaMat = new ArbolBinario<>(
            new Familiar("Nieves", 84, "Ama de casa", false, "Morelos")
        );

        ArbolBinario<Familiar> papa = new ArbolBinario<>(
            new Familiar("Juan Manuel", 61, "Ingeniero", false, "Navojoa"),
            abueloPat,
            abuelaPat
        );
        ArbolBinario<Familiar> mama = new ArbolBinario<>(
            new Familiar("Nora Patricia", 61, "Contadora", false, "Navojoa"),
            abueloMat,
            abuelaMat
        );

        ArbolBinario<Familiar> arbol = new ArbolBinario<>(
            new Familiar("Jesus David", 26, "Estudiante", false, "Navojoa"),
            papa,
            mama
        );

        System.out.println("Datos del arbol:");
        System.out.println("Raiz: " + arbol.getRootData());
        System.out.println("Altura: " + arbol.getHeight());
        System.out.println("Nodos: " + arbol.getNumberNodes());
        System.out.println("Vacio: " + arbol.empty());

        System.out.println("\nPreorden:");
        arbol.recorridoPreorden();

        System.out.println("\nInorden:");
        arbol.recorridoInorden();

        System.out.println("\nPostorden:");
        arbol.recorridoPostorden();

        arbol.clear();
        System.out.println("\nVacio despues de clear: " + arbol.empty());
    }
}
