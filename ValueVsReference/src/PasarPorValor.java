public class PasarPorValor {
    public static void main(String[] args) {

        // All primitive variables always are passed per value and not per reference because is not an object
        int i = 23;

        System.out.println("\nIniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i (Se mantiene igual) = "+ i);
    }

    // Static methods can be called just for name and not creating an object or can be called from other static method

    public static void test (int i) {  // We pass i as a parameter
        System.out.println("Iniciamos el método test con i = "+ i);
        i = 35;
        System.out.println("Finaliza el método test con i = "+ i);
    }

    // Here we change the i value for 35, but in the main i has the same value like 10
    // A primitive pass the value and not the reference, so the value does not change, buy if we prove with Integer or
    // a wrapper class the result will be the same, CAUSE: The value of wrapper variables are immutable, does not change
    // because the result is the same, when we modify that is because we are creating a different instance of that, then
    // it returns a new instance. Strings and primitives (byte,short,int etc ) by Number class are immutable.




}










