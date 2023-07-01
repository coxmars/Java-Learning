public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        // Repasamos instanceof con clases abstractas o genericas
        // Para usar instanceof se deben usar objetos y no primitivos, de lo contrario no funciona.

        Object texto = "Creando un objeto de la clase String....";
        // Texto sigue siendo un String pero esta asociado al tipo generico de la clase padre, la clase Object
        // pero sigue siendo un string o instancia de String porque el valor de referencia que tiene es de tipo string

        // Se usa el operador InstanceOf para validar si un objeto es del tipo de una clase.
        boolean b1 = texto instanceof String; // Esta es la estructura, 1- Variable 2- instanceof 3- Tipo clase
        System.out.println("Texto es del tipo String = " + b1);

        // Object: Es la clase padre de todos los objetos, es decir, cualquier clase hereda de object de forma implicita
        b1= texto instanceof Object;
        System.out.println("Texto es del tipo Object = " + b1);

        // Anteriormente, al evaluar instanceof en clases de tipos de dato como String daba error de compilación para ver si pertenecía a otra clase
        // de tipo de dato como Integer porque se definia como String, pero al usar Object si se puede porque Object engloba cualquier objeto entonces
        // al menos retorna false en caso que no pertenezca a cierta clase. En este caso el valor de referencia del objeto determina el resultado
        // porque el Object texto a pesar que es Object contiene un valor String entonces de ese modo determina que no es Integer.

        b1= texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);



        Number num = 7; // Esto se le conoce como auto boxing, es decir, toma la literal el valor entero. Recordar que si un dato tipo numerico no tiene punto
        // es almacenado por defecto como int, por esto instanceof Long es false, porque aunque lo puede contener se guarda como int.
        // Con number probamos si contiene la clase Long y demás, esta vez lo permite de igual forma que texto porque todos los tipos numericos
        // vienen de Number, entonces al final el valor de referencia determina el resultado.

        boolean b2 = num instanceof Integer;
        System.out.println("Número es del tipo Integer = " + b2);

        b2 = num instanceof Object;
        System.out.println("Número es del tipo Object = " + b2);

        b2 = num instanceof Number; // Todos los numericos comparten el ancestro clase tipo Number, este hace referencia a la extensión
        System.out.println("Número es del tipo Number = " + b2);

        b2 = num instanceof Long;
        System.out.println("Número es del tipo Long = " + b2);

        b2 = num instanceof Double;
        System.out.println("Número es del tipo Double = " + b2);



        Number decimal = 45.54; // Como en el caso del int, al poner un número con punto se asocia por defecto a un tipo double, a menos que se ponga al final
        // la f de float 45.54f, caso contrario se guarda como dato tipo Double


        boolean b3 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Double = " + b3);

        b3 = decimal instanceof Float;
        System.out.println("Decimal es del tipo Float = " + b3);

        b3 = decimal instanceof Integer;
        System.out.println("Decimal es del tipo Integer = " + b3);

        b3 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Object = " + b3);

        b3 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b3);

        // Para los tipos primitivos, al instanciar los datos hay dos formas: la más facil y recomendada es por auto boxing y la otra es por
        // el operador new, este ultimo es innecesario y no se recomienda porque es deprecated pero sirve de igual forma
        // Por ejemplo:

        // Forma mediante operador new, es más larga e ineficiente además de que no se usa practicamente en la actualidad
        Integer edad = new Integer (23);
        // Forma mediante auto boxing o literal
        Integer edad2 = 23;

        // Asimismo, como no se puede usar el metodo por new podemos usar el metodo estatico de la clase Integer
        // Esta seria una forma correcta de crear una instancia,

        Integer edad3 = Integer.valueOf(23); // Se puede pasar el valor como primitivo o tipo string "23"
        // Incluso si se usa int edad3 = 23; como forma auto boxing por debajo o de forma implicita Java utiliza la anterior, Integer.valueOf(23);
        // Esto aplica para los demás datos numericos con sus respectivas clases.

    }
}
