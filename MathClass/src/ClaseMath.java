public class ClaseMath {
    public static void main(String[] args) {

        // La clase Math no puede ser instanciada con el operador nwe, solo se usan los metodos estaticos de esta,
        // es como la clase System

        // abs returns the absolute value of a number
        int absolut = Math.abs(-5);
        System.out.println("absolut = " + absolut);

        // max to analize the max value of two numbers, can be double, float, int etc.
        int max = Math.max(23,25);
        System.out.println("max = " + max);

        int min = Math.min(23, 25);
        System.out.println("min = " + min);

        // Aquí redondeamos para arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Aquí redondeamos para abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5); // This is 4
        System.out.println("entero = " + entero);

        long entero2 = Math.round(Math.PI);
        System.out.println("entero2 = " + entero2);

        // Exponential
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Logarithm
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Potencia
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        // Square root
        double raiz = Math.sqrt(4);
        System.out.println("raiz = " + raiz);

        // Methods for trigonometry

        double grados = Math.toDegrees(1.57); // This parameter receives radians
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90d);
        radianes = Math.round(radianes);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
        System.out.println("tan(90): " + Math.tan(radianes));

    }
}
