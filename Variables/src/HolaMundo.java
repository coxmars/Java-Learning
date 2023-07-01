public class HolaMundo {//Class indica que es una clase, el public indica que es publica y se inicia o instancia en cualquier lugar.
        // Las llaves o corchetes delimitan el alcance de los procesos que se ejecutan dentro.
        public static void main(String [] args) {
            System.out.println("\nHola Mundo desde Java!!"); //Para el print poner sout para reducir tiempo escribiendo.
            System.out.println("Esfuerzate Marco por ser mejor cada día");
            //Siempre recordar de poner el punto y coma ; al final del código.
            // Con main o psvm y luego enter se crea automaticamente la estructura public static void...
            // El void no da ningún retorno de valor solo corre los procesos dentro de los corchetes.
        }
    }


/*
Las clases comienzan con mayuscula como: HolaMundo, en cambio la variable sería holaMundo
Curso Java, sección variables. Java es un lenguaje fuertemente tipado.
Cualquier variable que se defina tiene que estar bien definida el tipo de dato como int, float, duble, long etc.
Variables: Parte de la memoria que almacena datos o valores, llevan primero su tipo de dato y luego su nombre.
En el nombre de las variables usar CamelCase, es como definir variables así: HolaMundo, y que tenga relación con los datos o procesos.
Existen 2 tipos de datos: Primitivos y Referenciados, los primitivos son int,float,boolean,string etc
Los referenciados son arrays, clases e interfaces.

Convenciones para definir nombres de variables: 1- Empezar nombre con letra minuscula. 2- Caracteres comprendido en Unicode.
3- No puede ser boolean name o names de palabras reservadas del lenguaje. 4- No tener mismo nombre que otras variables del mismo ambito.
5- Si el name posee más de 1 palabra la primera va minuscula seguida de la segunda junta en mayuscula la primera letra. EJM: numeroUno
*/

/*
public class HolaMundo {
    public static void main(String [] args) {
        String saludar = "Hola Mundo desde Java!!";
        System.out.println(saludar); //Para el print poner sout para reducir tiempo escribiendo.
        System.out.println(saludar.toUpperCase()); //Este es un método string para poner en mayúscula los datos, nombres etc.
        int numero = 10; // Como numero es un valor no tiene ni atributos ni métodos. Mientras que el str que es objeto tiene varios.
        // La abreviatura soutv pone el system.out con la variable dentro.
        System.out.println("El numero es: " + numero);
        var numero3 = 15; // Var se usa para identificar automáticamente el tipo de valor en la variable como str, int o float.
    }
}
*/


