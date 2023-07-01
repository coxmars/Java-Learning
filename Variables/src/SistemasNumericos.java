import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        // Se toma como ejemplo el número 500
        // El sistema decimal es el normal de siempre, de 0-9, con estos se crean números infinitos
        // Recordar que por defecto los datos se toman como String por lo que se hacen conversiones si es necesario
        // Inicializar variables
        String resultadoBinario = " ";
        String resultadoOctal = " ";
        String resultadoHexadecimal = " ";
        try {
            int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero por favor: "));
            // Pasar a binario usando la clase Integer
            resultadoBinario = "Número Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(resultadoBinario);
            // Pasar el número al sistema octal
            resultadoOctal = "Número Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(resultadoOctal);
            // Pasar al sistema hexadecimal
            resultadoHexadecimal = "Número Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(resultadoHexadecimal);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Error, debe digitar un valor entero");
            main (args); // Con esto llamamos al main otra vez, args means los mismos argumentos del main
            System.exit(0); // Con esto indicamos que queremos salir del programa.
        }
        /*
        int numeroBinario = 0b111110100; // Para que el compilador asuma que es binario se pone de primero 0b
        // Lo interpreta como binario pero lo muestra como decimal, en este caso es 500
        System.out.println("numeroBinario = " + numeroBinario);
        int numeroOctal = 0764; // Para decir que un número este en el sistema octal se pone 0 antes del número
        System.out.println("numeroOctal = " + numeroOctal);
        int numeroHexadecimal = 0x1f4; // Para decir que es un número hexadecimal ponemos primero 0x, puede ser en mayuscula
        // o en minuscula, da igual.
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
        */
        // Hacemos una concatenación dinamica para mostrar los resultados
        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
