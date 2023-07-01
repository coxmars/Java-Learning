package org.maraya.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        // Here we define a String array for fish
        String [] peces = {"Corvina","Lenguado","Tilapia","Atun","Lenguado"};
        // We establish a set to save the array elements
        Set<String> unicos = new HashSet<>();
        for (String pez: peces) {
            if (!unicos.add(pez)) { // Here we save the data into the set
                System.out.println("Elementos Duplicados: ".concat(pez));
            }
        }
        System.out.println(unicos.size() + " Elementos No Duplicados: "+unicos);
    }
}
