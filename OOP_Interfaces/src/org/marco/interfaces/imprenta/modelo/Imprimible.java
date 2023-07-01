package org.marco.interfaces.imprenta.modelo;

public interface Imprimible {
    // Otra caracteristica de las interfaces es que puede tener atributos final o static
    final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    // Lo mejor es utilizar metodos en interfaces sin implementacion hablando de abstraccion pura
    // Metodo default, es para que las clases hijas o que implementan la interfaz no esten obligadas a
    // implementar todos los metodos de esta por ejemplo el de abajo es obligatorio (no tiene contenido ni es
    // default) por lo que se debe sobreescribir en la clase hija, ademas es util usarlos si la emplementacion
    // es especifica para cada clase como Libro, CV, Informe etc porque utilizan variables propias.

    String imprimir();

    /* Este es un ejemplo de metodo o implementación que no es obligatoria
    default String imprimir() {
        return TEXTO_DEFECTO;
    }
    Ahora las clases hijas no estan obligadas a implementar este metodo
    */

    static void imprimir (Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }

}
