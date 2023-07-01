public class SentenciaIfElse {
    public static void main(String[] args) {

        // Dentro de los parentesis se evalua una condición booleana, si es true entra en el if, si es false en el else.
        // Se ejecuta solamente uno, o es uno o el otro, pero los dos if o else no se ejecutan simultaneamente.


        float promedio = 5.8f; // Recordar en los float siempre poner la f, porque por defecto es double

        // Al utilizar solo 1 linea de código en los condicionales como IF-ELSE se pueden omitir las llaves, solo si y solo
        // cuando haya una sola expresión o linea de código dentro de un if,else else if. Pero, esto no es una buena practica
        // es recomendado mejor usar las llaves para entender y ver más rapido el código

        if (promedio >= 6.5)
            System.out.println("Felicitaciones excelente promedio");
        else if (promedio >= 6.0)
            System.out.println("Muy buen promedio");
        else if (promedio >= 5.5)
            System.out.println("Buen promedio");
        else if (promedio >= 5.0)
            System.out.println("Regular, necesitas esforzarte un poco más");
        else if (promedio >= 4.0)
            System.out.println("Insuficiente, debe estudiar más");
        else
            System.out.println("Reprobado");

        System.out.println("El promedio es: "+promedio);

    }
}
