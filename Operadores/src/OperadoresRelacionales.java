public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean n = false;

        boolean b1 = i == j; // Este operador de igualdad se usa en primitivos, no en strings porque se usa equals()
        System.out.println("b1 = " + b1);

        boolean b2 = !b1; // El operador denegación que es similar al unario, para invertir el valor booleano que es distinto: es ! el signo exclamación
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; // En otros lenguajes el distinto es: <>
        System.out.println("b3 = " + b3);
        
        boolean b4 = n == true;
        System.out.println("b4 = " + b4);
        
        boolean b5 = i > j;
        System.out.println("b5 = " + b5);
        
        boolean b6 = j < i;
        System.out.println("b6 = " + b6);
        
        boolean b7 = l >= k; // El operador igual siempre va al lado derecho luego de > o < si no se hace un error de sintaxis
        System.out.println("b7 = " + b7);
        
        boolean b8 = l <= k;
        System.out.println("b8 = " + b8);

    }
}
