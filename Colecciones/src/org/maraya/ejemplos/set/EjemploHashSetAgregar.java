package org.maraya.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        // Here we establish the HashSet, a HashSet does not have an order and does not allow duplicate elements
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        hs.add("seis");
        hs.add("siete");
        System.out.println(hs);

        boolean validate = hs.add("uno");
        System.out.println("El HashSet/Set permite elementos duplicados? "+validate);
        System.out.println(hs);

    }
}
