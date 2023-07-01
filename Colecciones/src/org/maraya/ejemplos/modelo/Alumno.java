package org.maraya.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int nota;

    public Alumno() {}

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    // With this method we order all objects/students by name, also we can apply that for the grade
    // Compare to only allows us to order by a single attribute, it does not work for int primitive data type
    @Override
    public int compareTo(Alumno a) {


        if (this.nombre == null) { // Here we validate the process to avoid a NullPointerException
            return 0;
        }
        return this.nombre.compareTo(a.nombre);


        // If we want to compare by grade we use this alternative when the attribute is int
        /*
        if (this.nota == a.nota) {
            return 0;
        }
        else if (this.nota < a.nota) { // We use < to sort descending, we use > to sort ascending
            return 1;
        }
        else {
            return -1;
        }
        */

        // If we want to compare by grade we use this alternative when the attribute is int and we want to reduce code lines
        // return Integer.compare(this.nota, a.nota);

        // If we want to compare by grade we use this alternative when the attribute is Integer
        /*
        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);
         */
    }

    // In both methods we use just the name to avoid the data duplication by this aspect (Name)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
