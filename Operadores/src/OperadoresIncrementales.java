public class OperadoresIncrementales {
    public static void main(String[] args) {
        // El pre va a la izquierda y el post a la derecha
        // Pre incremento
        int i = 1;
        int j = ++i; // Operador pre-incremento, i = i + 1; Primero se incrementa y luego se asigna el valor a j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        i = 2;
        j = i++; // Primero se asigna a la variable y luego se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        j = --i; // Operador pre-decremento, i = i - 1; Primero se decrementa y luego se asigna el valor a j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--; // Primero se asigna a la variable y luego se decrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
        
    }
}
