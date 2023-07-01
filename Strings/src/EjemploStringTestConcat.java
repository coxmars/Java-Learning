public class EjemploStringTestConcat {
    public static void main(String[] args) {

        // Test rendimiento concatenación con (+), metodo concat() y clase stringbuilder, 3 formas posibles.
        // En este test se crean muchos objetos tipo String por lo que se carga la memoria con muchas instancias de muchos objetos y Java de forma
        // automatica maneja un recolector de basura que se encarga de eliminar instancias que no se utilizan y al tener programas complejos que usan muchas
        // lo mejor es darle un tratamiento de forma explicita con esta clase SYSTEM, lo bueno es que liberamos espacio de la RAM, es como los punteros
        // y lo mejor es agregarla al final del código o del programa.


        String a = "a";
        String b = "b";
        String c = a;
        // Instanciamos StringBuilder
        StringBuilder sb = new StringBuilder(a);

        /*
        Nos permite crear un string, anexamos o concatenamos datos con append, y despues con el metodo toString()
        generamos el string completo de una forma más optimizada, además el stringbuilder es mutable a diferencia del string
        que es inmutable
         */

        long inicio = System.currentTimeMillis(); // Se calcula el time en milisegundos con esta clase system que
        // retorna un tipo long numerico, mediante el tiempo UTC, que es el estandar de la fecha universal cordenada
        for (int x=0; x<10000; x++) { //Se hacen 500 iteraciones para medir la velocidad al concatenar, ver cual metodo es más eficiente
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 3 ms, 1000 => 6 ms, 10000 => 120 ms
            // c += a + b + "\n";  // 500 => 20 ms, 1000 => 23 ms, 10000 => 85 ms
            // sb.append(a).append(b).append("\n");  // 500 => 0 ms, 1000 => 1 ms, 10000 => 2 ms
        }

        /* CONCLUSIÓN: Los resultados indican que stringBuilder es mucho más rapido y eficiente que + y concat()
        aunque aun asi el más deficiente es (+) para iteraciones o concatenaciones pequeñas, conforme se incrementen
        exponencialmente las iteraciones o concatenaciones el + se hace más rápido o eficiente que el metodo concat,
        pero el stringbuilder siempre va ser el más rápido y eficiente de los 3 desde donde se le mire.
        */


        // IMPLEMENTAMOS EL GARBAGE CON LA CLASE SYSTEM PARA LIBERAR ESPACIO DE LA RAM DE LOS OBJETOS O INSTANCIA SIN USAR
        System.gc(); // G de garbage y C de collector. Es decir, recolector de basura.
        // Esto lo hace de forma automatica la maquina virtual de Java, pero aquí lo aceleramos de forma forzada.
        // Los resultados no se pueden observar porque trabaja de forma paralela y en un muy bajo nivel, pero si lo cumple

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio); // Tiempo total que se demoró en milisegundos
        System.out.println("c = " + c);
        System.out.println("sb = "+ sb.toString()); // No olvidar poner el metodo toString
        // El metodo concat solo acepta strings, + puede concatenar cualquier valor


    }
}
