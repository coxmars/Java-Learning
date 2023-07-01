public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean n = false;

        // Con el AND o && las operaciones se deben cumplir o deben ser ciertas para dar true
        boolean b1 = i == j && k > l;
        System.out.println("b1 = " + b1);

        boolean b2 = i != j && k < l;
        System.out.println("b2 = " + b2);
        // Con el OR o || las operaciones se deben cumplir o deben ser ciertas para dar true

        boolean b3 = i == j || k < l;
        System.out.println("b3 = " + b3);

        boolean b4 = i != j || k > l;
        System.out.println("b4 = " + b4);

        // Precedencia de los operadores, se lee de izquierda a derecha a menos que exista prioridad por usar AND o OR
        // Siempre va tener más prioridad el &&/AND que el ||/OR

        boolean b5 = i == j || k < l && n == true; // Esto es lo mismo que decir (k < l && n == true), con parentesis
        // esto indica que es primero y luego lo compara con el ||/OR, se cambia el flujo de ejecución o lectura.
        // Al menos en Java el &&/AND tiene mayor prioridad que el ||/OR
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false; // Es lo mismo que poner: true || (false && false) || false
        // Primero false con false que es false, luego true izquierdo con false que es true y luego true con false derecho es true
        System.out.println("b6 = " + b6);

    }
}
