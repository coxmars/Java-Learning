package org.marco.interfaces.imprenta;

import org.marco.interfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        // Instanciamos curriculo
        Curriculo cv = new Curriculo("Resumen laboral",new Persona("Marco", "Araya Jiménez"),"Ingeniería en Sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("SpringBoot")
                .addExperiencia("MySQL")
                .addExperiencia("SQL Server")
                .addExperiencia("Oracle DB")
                .addExperiencia("FullStack Developer");

        // Se puede usar enum de esta forma o se importa genero y solo se hace referencia al atrbito del enum ejem:PROGRAMACION
        Libro libro = new Libro(new Persona ("Erich","Gamma"),"Patrones de Diseño: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina ("Patrón Singleton"))
                .addPagina(new Pagina ("Patrón Observador"))
                .addPagina(new Pagina ("Patrón Factory"))
                .addPagina(new Pagina ("Patrón Composite"))
                .addPagina(new Pagina ("Patrón Facade"));

        Informe informe = new Informe(new Persona("Jaes","fowler"),new Persona("Martin", "Gosling"),"Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir (Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
