public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);
        // Tambien se puede hacer de esta forma: Mediante la constante de la clase boolean, retorna una instancia de la
        // clase boolean, es decir, un objeto de tipo boolean
        boolean datoBoolean = Boolean.TRUE; //Se puede usar esto pero es poco comun, más facil y rapido de forma normal
        System.out.println("datoBoolean = " + datoBoolean);
        // Los boolean sirven para flujos de control para if,while,for, para evaluar condiciones, esta retorna verdadero o falso
        // y luego se ejecuta cierto código

        double d = 98745.43e-3; // 98.74543
        float f = 1.2345e2f; // 123.45

        boolean booleano = d > f;
        System.out.println("booleano = " + booleano);

    }
}
