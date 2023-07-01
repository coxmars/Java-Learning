public class OperadorInstanceOf {
    public static void main(String[] args) {

        // Para usar instanceof se deben usar objetos y no primitivos, de lo contrario no funciona.

        String texto = "Creando un objeto de la clase String....";
        // Pusimos el Integer como de referencia, que es la clase que equivale al entero primitivo: int
        // da más funcionalidades entre otras cosas.
        Integer num = 7; // Esto se le conoce como auto boxing, es decir, toma la literal el valor entero.

        Double decimal = 45.54;

        // Se usa el operador InstanceOf para validar si un objeto es del tipo de una clase.
        boolean b1 = texto instanceof String; // Esta es la estructura, 1- Variable 2- instanceof 3- Tipo clase
        System.out.println("Texto es del tipo String = " + b1);
        // Si se quisiera probar con Integer la variable texto no funcionaria, da un error de sintaxis porque son
        // completamente diferentes, no tienen un ancestro o algo en relación.

        // Object: Es la clase padre de todos los objetos, es decir, cualquier clase hereda de object de forma implicita
        b1= texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("Número es del tipo Integer = " + b2);

        b2 = num instanceof Object;
        System.out.println("Número es del tipo Object = " + b2);

        b2 = num instanceof Number; // Todos los numericos comparten el ancestro clase tipo Number, este hace referencia a la extensión
        System.out.println("Número es del tipo Number = " + b2);

        boolean b3 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Double = " + b3);

        b3 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Object = " + b3);

        b3 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b3);

    }
}
