package org.maraya.ejemplos.list;

import org.maraya.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();

        // Los datos se guardan segun el orden con el que se agregan
        sa.add(new Alumno("Marco",100));
        sa.add(new Alumno("Luis",80));
        sa.add(new Alumno("Daniel",90));
        sa.add(new Alumno("Joan",75));
        sa.add(new Alumno("Andres",65));
        sa.add(new Alumno("Marco",100));
        System.out.println("Alumnos: "+sa);
        // Se ordena la lista por el compare to de Alumno
        // Collections.sort(sa);
        // Si queremos usar otro compare to se hace así
        // Collections.sort(sa, (a,b) -> b.getNota().compareTo(a.getNota()));
        // sa.sort((a,b) -> b.getNota().compareTo(a.getNota()));
        sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);


    }
}
