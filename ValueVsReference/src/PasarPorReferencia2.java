public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // We create the object or instance of Person.
        Persona persona = new Persona ();
        persona.modificarNombre("Marco");
        System.out.println("Iniciamos el método main");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos modificados!!");
    }

    public static void test (Persona persona) {  // We pass i as a parameter
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Luis Felipe");
        System.out.println("Finaliza el método test");
    }

    // In this example the results have changed because classes are objects and these have a reference which
    // Aim to the same pointer in memory, so we change the array value.

}










