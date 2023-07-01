package org.marco.java8.lambda;

import org.marco.java8.lambda.aritmetica.Aritmetica;
import org.marco.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        // Utilizamos expresiones Lamba personalizadas
        Aritmetica suma = (a,b) -> a+b;
        Aritmetica resta = (a,b) -> a-b;
        Aritmetica division = (a,b) -> a/b;
        Aritmetica multiplicacion = (a,b) -> a*b;

        Calculadora calculadora = new Calculadora();

        System.out.println("Lambda personalizada");
        System.out.println("La suma es: " + calculadora.calcular(10,2,suma));
        System.out.println("La resta es: " + calculadora.calcular(10,2,resta));
        System.out.println("La division es: " + calculadora.calcular(10,2,division));
        System.out.println("La multiplicacion es: " + calculadora.calcular(10,2,multiplicacion));

        System.out.println("\nLambda BiFunction");
        System.out.println("La suma es: " + calculadora.calcularConBiFunction(10,2,(a,b) -> a+b));
        System.out.println("La resta es: " + calculadora.calcular(10,2,(a,b) -> a-b));
        System.out.println("La division es: " + calculadora.calcular(10,2,(a,b) -> a/b));
        System.out.println("La multiplicacion es: " + calculadora.calcular(10,2,(a,b) -> a*b));

    }
}
