package org.marco.java8.lambda.aritmetica;

// Con esta anotacion se aporta semantica, descripcion y demas pero no hace nada en funcionalidad
// Solo se denota que es una expresion Lambda
@FunctionalInterface
public interface Aritmetica {
    double operacion (double a, double b);
}
