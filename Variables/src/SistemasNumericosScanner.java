import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // System.in quiere decir entrada por consola o por el sistema
        String resultadoBinario = " ";
        String resultadoOctal = " ";
        String resultadoHexadecimal = " ";
        int numeroDecimal = 0;
        try {
            System.out.print("\nIngrese un número entero por favor: ");
            numeroDecimal = entrada.nextInt();
            // Pasar a binario usando la clase Integer
            resultadoBinario = "Número Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            // Pasar el número al sistema octal
            resultadoOctal = "Número Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            // Pasar al sistema hexadecimal
            resultadoHexadecimal = "Número Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        } catch (InputMismatchException ex){
            System.out.println("Error, debe digitar un valor entero");
            main (args); // Con esto llamamos al main otra vez, args means los mismos argumentos del main
            System.exit(0); // Con esto indicamos que queremos salir del programa.
        }
        // Hacemos una concatenación dinamica para mostrar los resultados
        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
