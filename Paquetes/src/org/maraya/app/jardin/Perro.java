package org.maraya.app.jardin;

import org.maraya.app.hogar.Persona;

public class Perro {
    public String nombre;
    public String raza;

    String jugar (Persona persona) {
        return persona.lanzarPelota();
    }
}
