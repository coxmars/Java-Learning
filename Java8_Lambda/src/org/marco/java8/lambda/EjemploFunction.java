package org.marco.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        // Una funcion en expresiones Lambda recibe un tipo generico, parametro o argumento y retorna
        // un valor/informacion, es como la combinacion de consumer y supplier
        // El primer generico o más es lo que recibe y el ultimo lo que retorna

        //      recibe / retorna
        Function<String,String> function1 = param -> {
            return "Hola que tal " + param;
        };

        // Esta es la forma de llamarlo/invocarlo
        String resultado = function1.apply("Marco");
        System.out.println(resultado); // Lo imprimimos

        Function<String,String> function2 = String::toUpperCase;
        System.out.println(function2.apply("Marco"));

        //         recibe/recibe/retorna
        BiFunction<String,String,String> function3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String resultado2 = function3.apply("Marco","Luis");
        System.out.println(resultado2);

        BiFunction<String,String,Integer> function4 = String::compareTo; //(a,b) -> a.compareTo(b);
        System.out.println(function4.apply("Marco","Marco"));


        BiFunction<String,String,String> function5 = String::concat;  //(a,b) -> a.concat(b);
        System.out.println(function4.apply("Marco","Marco"));

    }
}
