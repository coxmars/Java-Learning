package org.maraya.ejemplos.set;

import org.maraya.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        // It is a rule of the TreeSet they must be objects that implement the
        // Comparable interface and our Student class does not implement it, therefore it is not ordered.

        // We can send as parameters the order and data type we want to sort the structure like an override process
        // even if we have established an order in the student class, if we want to change the order we just need to change the letter a by b or b by a
        // So we can use Comparable with another class or use comparator sending the order as parameters like this case
        Set<Alumno> sa = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Marco",100));
        sa.add(new Alumno("Luis",80));
        sa.add(new Alumno("Daniel",90));
        sa.add(new Alumno("Joan",75));
        sa.add(new Alumno("Andres",65));
        System.out.println("Alumnos: "+sa);

    }
}
