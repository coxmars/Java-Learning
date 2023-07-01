public class PasarPorReferencia {
    public static void main(String[] args) {

        // IMPORTANT: All arrays are objects, they are reference

        int [] edad = {10,11,12};

        System.out.println("\nIniciamos el método main");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad ["+i+"] = " + edad[i]);
        }

        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad ["+i+"] = " + edad[i]);
        }

        System.out.println("Finaliza el método main con los datos del arreglo modificado!!");
    }

    // Static methods can be called just for name and not creating an object or can be called from other static method

    public static void test (int [] edadArray) {  // We pass i as a parameter
        System.out.println("Iniciamos el método test");

        for (int i = 0; i < edadArray.length; i++) {
            edadArray[i] = edadArray[i] + 20;
        }

        System.out.println("Finaliza el método test");
    }

    // In this example the results have changed because arrays are objects and these have a reference which
    // Aim to the same pointer in memory, so we change the array value.


}










