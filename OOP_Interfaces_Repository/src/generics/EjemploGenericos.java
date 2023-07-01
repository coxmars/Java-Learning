package generics;

import org.marco.app.model.Customer;
import org.marco.app.model.PremiumCustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        /* A veces se usa cast para establecer el tipo dato a la fuerza pero si se equivoca y se pone
        un tipo dato erroneo pueden haber problemas por eso la solucion a estas cosas es usar genericos,
        ademas queda más limpio el codigo y es reutilizable por ejemplo aquí se tiene el problema:

        List customers = new ArrayList();
        customers.add(new Customer("Marco","Araya"));
        String marco = (String) customers.get(0);
        */

        // La siguiente es la forma ideal es mas robusta y vemos errores rapido sin ejecutar,
        // con genericos podemos crear clases, metodos y asi

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Marco","Araya"));
        Customer marco = customers.get(0);

        // Arreglos normales
        Customer[] customerArray = {new Customer("Luis","Bogantes"),
                new Customer("Marco","Araya")};
        Integer[] numbersArray = {1,5,23,25,60,2000};
        String[] wordsArray = {"Hola","Gracias","Mundo","Tech","Cyberpunk"};

        // Listas usando el metodo statico de generics
        List<Customer> customersList = fromArrayToList(customerArray);
        List<Integer> numbersList = fromArrayToList(numbersArray);
        System.out.println("----- Metodo Sobrecargado -----");
        // Utilizamos este con el metodo sobrecargado de generics entonces lista=wordsArray, print=customerArray
        List<String> wordsList = fromArrayToList(wordsArray,customerArray);

        // Imprimimos las listas
        System.out.println("----- List Customers -----");
        customersList.forEach(System.out::println);
        System.out.println("----- List Numbers -----");
        numbersList.forEach(System.out::println);
        System.out.println("----- List Words -----");
        wordsList.forEach(System.out::println);

        List<PremiumCustomer> premiumCustomers = fromArrayToList(new PremiumCustomer[] {
                new PremiumCustomer("Carlos","Barahona")
        });

        // Uso de comodin/wildcarts, si no tuviera ? extends no funcionaria
        printCustomers(premiumCustomers);

        // Comparable de 3 objetos con generics
        System.out.println("Maximo de 1, 23, y 25: " + maximo(1,23,25));
        System.out.println("Maximo de 1.23, 23.16, y 39.12: " + maximo(1.23,23.16,39.12));
        System.out.println("Maximo de hola, mundo y tech: " + maximo("hola","mundo","tech"));
    }

    /* Este metodo sirve pero es poco reutilizable, es muy especifico ya que solo admite dato tipo Customer
    lo ideal es que admita cualquier tipo dato entonces es reutilizable para eso usamos Genericos

    public static List<Customer> fromArrayToList (Customer[] customers) {
        // Usamos la clase helper Arrays para convertir un arreglo en una lista
        return Arrays.asList(customers);
    }
    */

    // Este seria el metodo anterior usando generics, <T> este es el parametro de entrada se usan en mayuscula
    // las ltras, y al usar mas parametros se pone simplemente coma: <T, G>
    public static <T> List<T> fromArrayToList (T[] customers) {
        // Usamos la clase helper Arrays para convertir un arreglo en una lista
        return Arrays.asList(customers);
    }

    // Hacemos sobrecarga de metodo, se utiliza uno u otro segun los parametros que se envian
    public static <T,G> List<T> fromArrayToList (T[] customers, G[] example) {
        for (G elemento: example) {
            System.out.println("elemento = " + elemento);
        }
        // Usamos la clase helper Arrays para convertir un arreglo en una lista
        return Arrays.asList(customers);
    }

    /* Bounded Generics: Los Bounded Generics en Java son una característica de la programación
     genérica que permite limitar los tipos de datos que se pueden utilizar en un parámetro de tipo genérico.
     Por ejemplo: En este metodo anterior le podemos decir que puede recibir cualquier tipo dato Number (int,byte,float,double,long)

     public static <T extends Number> List<T> fromArrayToList (T[] customers) {
        // Usamos la clase helper Arrays para convertir un arreglo en una lista
        return Arrays.asList(customers);
     }
    */

    public static <T extends Customer> List<T> fromArrayToList (T[] customers) {
        // Usamos la clase helper Arrays para convertir un arreglo en una lista
        return Arrays.asList(customers);
    }

    /* Wildcarts/Comodines: En este caso, el comodín ? indica que se acepta una lista de cualquier tipo que
    extienda o implemente la clase Customer, incluyendo a las subclases de Customer.
    La razón por la cual el uso de comodines es apropiado en este caso, es que permite que el método
    printCustomers pueda aceptar una lista de cualquier subclase de Customer sin importar cuál sea.
    Si se utilizara un tipo concreto en lugar del comodín, como List<Customer>, el método solo aceptaría
    listas de objetos de tipo Customer, excluyendo las subclases de Customer.
    */
    public static void printCustomers (List<? extends Customer> customers) {
        customers.forEach(System.out::println);
    }

    // Maximo de 3 objetos usando Comparable
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


}
