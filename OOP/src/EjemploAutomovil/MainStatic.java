package EjemploAutomovil;

public class MainStatic {
    public static void main(String[] args) {

        //With the new we create the instance, initialize the object and it is stored in memory somewhere or pointer
        // Automovil porsche = new Automovil ("Porsche","GTR3",Automovil.COLOR_AMARILLO,5.0);  // Here we pass the parameters to constructor
        // This is the normal way to use colors with constant attributes from Automovil and the below way is with enums
        Automovil porsche = new Automovil ("Porsche","GTR3",Color.AMARILLO,5.0);
        porsche.setTipo(TipoAutomovil.CONVERTIBLE);

        // If we want to add another car is in this way:
        Automovil mazda = new Automovil ("Mazda","BT-50",Color.NARANJA); // Here we pass the parameters to constructor
        mazda.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mercedez = new Automovil ("Mercedez","G-50",Color.ROJO); // Here we pass the parameters to constructor
        mercedez.setTipo(TipoAutomovil.SEDAN);

        // Here we change the static attribute value
        // Automovil.setDefaultColor("Verde"); // If the modifier is private we have to use a setter method, but the getters and setters of static attributes have
        // to be static too

        // Here we show the data
        System.out.println("\nDatos inicializados del GTR3");
        // Then we print the new attribute values for porsche using the method but with print
        System.out.println(porsche.details());
        System.out.println("Velocidad Máxima Carretera: "+Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Máxima Ciudad: "+Automovil.VELOCIDAD_MAXIMA_CIUDAD);
        System.out.println("\nDatos inicializados del BT-50");
        // Then we print the attribute values for BT-50 using the method but with print
        System.out.println(mazda.details());
        System.out.println("Velocidad Máxima Carretera: "+Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Máxima Ciudad: "+Automovil.VELOCIDAD_MAXIMA_CIUDAD);
        System.out.println("\nDatos inicializados del Mercedez");
        // Then we print the attribute values for Mercedez using the method but with print
        System.out.println(mercedez.details());
        System.out.println("Velocidad Máxima Carretera: "+Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Máxima Ciudad: "+Automovil.VELOCIDAD_MAXIMA_CIUDAD);



    }
}
