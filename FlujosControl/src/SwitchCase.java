import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 4; // Se inicializa en 4 para que pueda ejecutarse el while
        int counter = 0;
        // El Switch recibe una variable y este valor debe coincidir con uno de los casos del switch.
        // El switch Case soporta byte,short,int y char y desde la versión del JDK 7 soporta String y enumeradores
        // También, se puede usar son las clases Wrapper, como Byte, Short, Integer, Character.

        while (num > 3 || num < 0) {
            System.out.print("Ingrese un número: ");
            num = entrada.nextInt();

            // Si num es 1 se ejecuta el caso 1 y luego sigue ejecutando el resto por defecto, por eso usamos break
            // Por eso siempre, en cada caso se recomienda usar un break para evitar ese error.
            // El default es como un else, si no se ejecutan los case se debe ejecutar el default.
            switch (num) {
                case 0:
                    System.out.println("El num es cero");
                    break;
                case 1:
                    System.out.println("El num es uno");
                    break;
                case 2:
                    System.out.println("El num es dos");
                    break;
                case 3:
                    System.out.println("El num es tres");
                    break;
                default:
                    System.out.println("Error, digite un número entre 0 - 3");
                    break;
            }
        }
    }
}
