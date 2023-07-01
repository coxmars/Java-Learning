package EjemploAutomovil;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //With the new we create the instance, initialize the object and it is stored in memory somewhere or pointer
        Automovil porsche = new Automovil ("Porsche","GTR3",Color.AMARILLO,5.0);  // Here we pass the parameters to constructor

        // Here we are working in a direct way with the Automovil attributes, it is not correct because someone
        // can have access and modify everything, so the important is the security with private modifier but for
        // starting in OOP we use this in this way.

        // By default, uninitialized String variables have null and double 0.0

        // If we want to establish the attributes values we do this:
        // Obviously is better to enter the data or use JOptionPane but for the beginning this is the way

        /*
        porsche.setManufacturer("Porsche");
        porsche.setModel("GTR3");
        porsche.setEngine(5.0);
        porsche.setColor("Yellow");
        */
        System.out.println("\nDatos inicializados del GTR3");

        // Then we print the new attribute values for porsche using the method but with print
        System.out.println(porsche.details());

        // If we want to add another car is in this way:
        Automovil mazda = new Automovil ("Mazda","BT-50",Color.ROJO); // Here we pass the parameters to constructor

        /*
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setEngine(3.0);
        mazda.setColor("Red");
         */

        System.out.println("\nDatos inicializados del BT-50");

        // Then we print the attribute values for BT-50 using the method but with print
        System.out.println(mazda.details());


        Automovil mercedez = new Automovil ("Mercedez","G-50"); // Here we pass the parameters to constructor
        /*
        mercedez.setManufacturer("mercedez");
         */
        System.out.println("\nDatos inicializados del Mercedez");

        // Then we print the attribute values for Mercedez using the method but with print
        System.out.println(mercedez);


        // Here we are going to see differences between objects even if these ones look similar
        Automovil mercedez2 = new Automovil ("Mercedez","G-50");
        // Each object is saved with a different reference or in a different pointer even if they have the same values
        System.out.println("\nLos objetos son iguales con == : " + (mercedez == mercedez2));
        System.out.println("Los objetos son iguales con .equals() : " + (mercedez.equals(mercedez2)));
        // With == we compare for reference like equals() in this case because these are objects, and each object has .equals() method from the Object Class
        // but if we want to compare for value we have to override the method equals and we compare for value with the .equals() method, we overwrite
        // the Object parent class and now the equals method return the value and not the reference

        // If we want to validate in case we compare different objects this is the way:
        Date date = new Date();
        System.out.println("¿Fecha es igual a mercedez? : " + (mercedez.equals(date))); // This is false obviously

        // This is executed in a implicit way that we can not see, this is equal to the hashcode with the identifier
        System.out.println(mercedez);
        System.out.println(mercedez.toString()); // This is the explicit way we are calling for, this shows a identifier of the object
        // like Automovil@1a6c5a9e, but we can print the attributes of he object if we overwrite the toString() parent method


        // Here we print the method accelerate and brake
        System.out.println(porsche.accelerate(3000)); // Here we pass the parameter
        System.out.println(porsche.brake());

        //Here we print the method for both aspects
        System.out.println(mazda.accelerateAndBrake(4000));

        int km;
        float percentage;

        System.out.print("\nIngrese el kilometraje del auto: ");
        km = input.nextInt();
        System.out.print("Ingrese el porcentaje de bencina según la escala (0.10 = 10 - 1.0 = 100): ");
        percentage = input.nextFloat();

        // Data about consumption with int-float as parameters
        System.out.println("Kilómetros recorridos por litro bencina: " + porsche.calculateConsumption(km, percentage));



    }
}
