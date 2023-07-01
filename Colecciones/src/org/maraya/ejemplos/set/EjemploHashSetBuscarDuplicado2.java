package org.maraya.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        // Here we define a String array for fish
        String [] peces = {"Corvina","Lenguado","Tilapia","Atun","Lenguado"};
        // We establish a set to save the array elements
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces) {
            if (!unicos.add(pez)) { // Here we save the data into the set
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados); // We delete all duplicate items in unicos
        System.out.println(duplicados.size() + " Elementos Duplicados: " + duplicados);
        System.out.println(unicos.size() + " Elementos Unicos: " + unicos);
    }
}
