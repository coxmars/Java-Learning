import java.util.Scanner;

public class SwitchNombreMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes = 0;
        String nombreMes = null;
        // El código sirve bien pero se ve ineficiente por tantas lineas de código
        do {
            // Pedir el dato
            System.out.print("\nIngrese el número del mes 1 - 12: ");
            mes = entrada.nextInt();

            switch (mes) {
                case 1:
                    nombreMes = "Enero";
                    break;
                case 2:
                    nombreMes = "Febrero";
                    break;
                case 3:
                    nombreMes = "Marzo";
                    break;
                case 4:
                    nombreMes = "Abril";
                    break;
                case 5:
                    nombreMes = "Mayo";
                    break;
                case 6:
                    nombreMes = "Junio";
                    break;
                case 7:
                    nombreMes = "Julio";
                    break;
                case 8:
                    nombreMes = "Agosto";
                    break;
                case 9:
                    nombreMes = "Septiembre";
                    break;
                case 10:
                    nombreMes = "Octubre";
                    break;
                case 11:
                    nombreMes = "Noviembre";
                    break;
                case 12:
                    nombreMes = "Diciembre";
                    break;
                default:
                    System.out.println("Error, el número no corresponde con ningún mes");
            }
        } while (mes < 1 || mes > 12);

        // Mostrar resultados
        System.out.println("El nombre del mes es ".concat(nombreMes));

    }
}
