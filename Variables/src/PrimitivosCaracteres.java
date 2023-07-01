public class PrimitivosCaracteres {
    // Una caracteristica de Java 10 para arriba es en vez de poner el tipo de dato usar var, esta es flexible y depende del valor
    // que se pone se adapta a un tipo de dato.
    // Clase sobre introducción a datos primitivos
    // Los datos primitivos son datos escalares que contienen un solo valor
    // Java es de tipado estatico lo que implica que todas sus variables deben definirse con el tipo de dato, int numero=5;
    // En Java hay categorias de tipos de datos, son los primitivos que contienen un valor y los de referencia que son objectos, que
    // son una instancia de una clase.
    // String es una cadena de caracteres, llevan doble comilla y dentro su dato.
    // char: Es un solo carácter, ocupa 16 bits y usa el unicode.
    // Va entre comillas simples y contiene un solo carácter. Ejemplo: char letra = 'a';
    // Datos tipo char: Se usan comillas simples y solo contienen un caracter, tambien se pueden usar las tablas de carateres en windows
    // para ver el codigo UNICODE, se pone como \u0040 entre comillas, para este caso es la arroba.

    public static void main(String[] args) {
        // Datos tipo char
        char caracter = '\u0040';
        char decimal = 64; //A pesar que se pone como entero,se toma como el codigo en decimal.
        System.out.println("caracter = " + caracter); //Importante, usar el codigo UNICODE puede ser de utilidad para resolver problemas
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal==caracter)); //Se puede concatenar con parentesis para ahorrar variables
        System.out.println("Char corresponde en bytes a: "+Character.BYTES);
        System.out.println("Char corresponde en bits a: "+Character.SIZE);
        System.out.println("Valor maximo de un Char: "+Character.MAX_VALUE);
        System.out.println("Valor maximo de un Char: "+Character.MIN_VALUE);

        // Caracteres especiales de Char en Java
        char espacio = ' '; //Se pone un espacio, puede ser util para concatenarlo en un string entre palabras etc.
        char espacioUnicode = '\u0020'; //Este es el codigo UNICODE del espacio, puede servir tambien.
        System.out.println("Hola mi nombre es:"+espacio+"Marco");
        System.out.println("Hola mi nombre es:"+espacioUnicode+"Marco");
        char retroceso = '\b'; // Esto hace un retroceso, puede borrar cualquier caracter si queda en rango de retroceso.
        System.out.println("Hola mi nombre es:"+retroceso+"Marco");
        char tabulador = '\t'; // Esto da un espacio mayor, es un tabulador
        System.out.println("Hola mi nombre es:"+tabulador+"Marco"); //Estos caracteres con escape \ pueden usarse en el string
        char nuevaLinea = '\n';
        System.out.println("Hola mi nombre es:"+nuevaLinea+"Marco");
        System.out.println("Hola mi nombre es:"+System.lineSeparator()+"Marco"); // Este es sinonimo de \n, hace lo mismo

    }
}
