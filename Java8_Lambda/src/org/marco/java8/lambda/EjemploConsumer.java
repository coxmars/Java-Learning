package org.marco.java8.lambda;

import org.marco.java8.lambda.model.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        // Expresiones Lamba que vienen predefinidas en Java Consumer/Consumidores

        // Esta es nuestra primera expression Lambda que utiliza genericos
        /*
        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };
        */

        // Por defecto el Consumer solo acepta un argumento en el metodo y no devuelve nada
        // podria ponerse parentesis en fecha y decirle el tipo dato que es pero el tipo
        // dato que se le da esta indicado en el generico por eso no es necesario
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        // Para invocar/usar la expresion lambda se pone:
        consumidor.accept(new Date());

        // Para usar más de un argumento en el metodo y hacer algo con estos argumentos/parametros se usa:
        // Es generico también acepta ambos argumentos de cualquier tipo dato, y se deben usar
        // parentesis es obligado cuando se usa más de un parametro
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + ",tiene " + edad + " años!");
        };

        consumidorBi.accept("Marco",20);

        // El anterior metodo puede usarse abreviado así:
        /*
        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + ",tiene " + edad + " años!");
        */

        // Esta forma usa metodo por referencia
        Consumer<String> consumidor2 =  System.out::println;
        consumidor2.accept("Hola Mundo");

        List<String> nombres = Arrays.asList("Marco","Josue","Luis","Esteban");
        // Aqui se utiliza el metodo consumidor2 para imprimir cada nombre
        nombres.forEach(consumidor2);

        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = (persona,nombre) -> {
            persona.setNombre(nombre);
        };
        // Llamamos el metodo
        asignarNombre.accept(usuario,"Marco");
        // Mostramos el resultado
        System.out.println("Nombre de usuario: " + usuario.getNombre());

        // Esta lambda si devuelve un dato/informacion en el generico se pone el tipo dato que retorna
        Supplier<String> proveedor = () -> {
            return "Hola mundo lambda supplier";
        };

        // Para imprimir este metodo se usa:
        System.out.println(proveedor.get());

    }
}
