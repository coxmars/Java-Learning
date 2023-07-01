package org.maraya.app.jardin;

import org.maraya.app.hogar.*; // Aqui aplicamos wildcard para importar todas las clases del paquete hogar

import static org.maraya.app.hogar.Persona.GENERO_MASCULINO;
import static org.maraya.app.hogar.Persona.GENERO_FEMENINO;
import static org.maraya.app.hogar.Persona.saludar;

public class EjemploPaquetes {
    public static void main(String[] args) {
        // Las clases solamente se importan si estan en distintos paquetes, si estan en el mismo solo se instancian
        // Si queremos instanciar la clase Persona del subpaquete hogar se hace así, aunque es una alternativa al import tradicional
        // org.maraya.app.hogar.Persona persona = new org.maraya.app.hogar.Persona();
        // La otra forma y más utilizada por orden es la de importar el paquete
        Persona persona = new Persona();
        persona.setNombre("Marco Araya");
        persona.setColorPelo(ColorPelo.CAFE);
        System.out.println("El nombre de la persona es: ".concat(persona.getNombre()));

        Gato gato = new Gato(); // Para este importamos/usamos el nombre extenso del paquete o usamos wildcard

        Perro perro = new Perro();
        perro.nombre = "Luca";
        perro.raza = "Pitbull";
        System.out.println("El nombre del perro es: ".concat(perro.nombre).concat(" y su raza es: ").concat(perro.raza));

        String jugando = perro.jugar(persona);
        System.out.println("Jugando: ".concat(jugando));
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
