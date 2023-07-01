public class PrimitivosEnteros {
    // Una caracteristica de Java 10 para arriba es en vez de poner el tipo de dato usar var, esta es flexible y depende del valor
    // que se pone se adapta a un tipo de dato.
    // Clase sobre introducción a datos primitivos
    // Los datos primitivos son datos escalares que contienen un solo valor
    // Java es de tipado estatico lo que implica que todas sus variables deben definirse con el tipo de dato, int numero=5;
    // En Java hay categorias de tipos de datos, son los primitivos que contienen un valor y los de referencia que son objectos, que
    // son una instancia de una clase.
    // Primitivos enteros: Son 4: byte, int, short y long, son números enteros positivos y negativos, difieren en su alcance.

    public static void main(String[] args) {
        byte numeroByte = 23; // Este es el byte, el entero más pequeño que hay en Java, soporta hasta 127 positivo
        System.out.println("num1 = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: "+Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a: "+Byte.SIZE);
        System.out.println("Valor maximo de un byte: "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: "+Byte.MIN_VALUE);

        short numeroShort = 23; // Este es el short, es el siguiente, posee 2 bytes y 16 bits
        System.out.println("num2 = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a: "+Short.BYTES);
        System.out.println("Tipo Short corresponde en bits a: "+Short.SIZE);
        System.out.println("Valor maximo de un Short: "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un Short: "+Short.MIN_VALUE);

        int numeroInt = 23; // Este es el int, es el siguiente, posee 4 bytes y 32 bits
        System.out.println("num3 = " + numeroInt);
        System.out.println("Tipo Short corresponde en byte a: "+Integer.BYTES); //Esta clase cambia, en vez de Int es Integer
        System.out.println("Tipo Short corresponde en bits a: "+Integer.SIZE);
        System.out.println("Valor maximo de un Short: "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un Short: "+Integer.MIN_VALUE);

        long numeroLong = 23404040404040L; // Este es el long, es el siguiente, posee 8 bytes y 64 bits
        System.out.println("num3 = " + numeroLong); //Al ser un número muy grande se debe poner al final L como una F de un float
        System.out.println("Tipo Short corresponde en byte a: "+Long.BYTES);
        System.out.println("Tipo Short corresponde en bits a: "+Long.SIZE);
        System.out.println("Valor maximo de un Short: "+Long.MAX_VALUE);
        System.out.println("Valor minimo de un Short: "+Long.MIN_VALUE);

    }
}
