package org.maraya.ejemplos.set;

import org.maraya.ejemplos.modelo.Alumno;

import java.sql.SQLOutput;
import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        //How to avoid the duplication of data in a HashSet, we create the hashCode and the equals method
        Set<Alumno> sa = new HashSet<>();
        // List<Alumno> sa = new ArrayList<>();

        sa.add(new Alumno("Marco",100));
        sa.add(new Alumno("Luis",80));
        sa.add(new Alumno("Daniel",90));
        sa.add(new Alumno("Joan",75));
        sa.add(new Alumno("Andres",65));
        sa.add(new Alumno("Marco",100));
        System.out.println("Alumnos: "+sa);

        // These loops work for whatever collection such as set or list
        // This loop works only for List because the Set does not have the method get
        /*
        System.out.println("Iterando usando un for clásico");
        for (int i = 0; i < sa.size(); i++) {
            System.out.println(sa.get(i));
        }
        */

        System.out.println("\nIterando usando un foreach");
        for (Alumno a: sa) {
            System.out.println(a);
        }

        System.out.println("\nIterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("\nIterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a));

        /* This is the same that before but with less code
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
        */

    }
}
