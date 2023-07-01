public class Strings {
    public static void main(String[] args) {
        /*
        Los strings no son datos primitivos, son objetos, no se debe confundir por verlo en la literal.
        Los String son objetos de Java, del tipo de referencia:
        String nombre = new String("Marco");
        String tema = new String("Manejo de String");
        El tipo string tiene un rasgo especial, se permite crear objetos en la literal con comillas dobles, es más eficiente
        Por ejemplo: String nombre = "Marco"; sin necesidad del operador new.
        El string se puede considerar un arreglo caracteres y como cada arreglo en java es de tipo objeto, este es un objeto
        Para incluir comillas dobles dentro de un string es con escape: String tema = "Manejo de \"String\"";
         */

        /*
        Concatenar: Es la unión de 2 o más datos o valores, en Java se ejecuta mediante el signo (+)
        Por ejemplo: String nombre = "Marco"; String apellido = "Araya"; String nombreCompleto = nombre+" "+apellido;
         */

        /*
        Comparar Strings: Con el operador de igualdad == se compara por referencia.
        Con el metodo equals() se compara por valor.
        String str1 = "Marco";
        String str2 = new String ("Marco");
        // Analiza si son el mismo objeto
        System.out.print("¿Son el mismo objeto?"+ (str1==str2));
        Este nos da distintas instancias, diferentes referencias o espacios en memoria
        // Analiza si tienen el mismo valor
        System.out.print("¿Tienen el mismo valor?"+ str1.equals(str2));
        Este es verdadero porque se compara por valor y ambos objetos tienen referencia distinta pero poseen el mismo valor
        o la misma palabra en este caso Marco
        Tambien el metodo equalsIgnoreCase() hace lo mismo pero no toma en cuenta mayuscula o minuscula
         */
    }
}
