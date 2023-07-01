import java.util.Scanner;

public class EjemploAnioBisiestoSwitch {
    public static void main(String[] args) {

        // Ejemplo calcular número dias en un mes y el año bisiesto
        // Los meses que tienen 31 dias son: Enero,Marzo,Mayo,Julio,Agosto,Octubre y Diciembre
        // el resto que sería Abril,Junio,Septiembre y Noviembre son 30 días y Febrero puede ser 28 o 29.

        Scanner entrada = new Scanner(System.in);
        int mes = 0;
        int numeroDias = 0;
        int anio = 0;
        String anioBisiesto = "";

        // Pedimos los datos
        System.out.print("Ingrese el mes que desea 1 - 12: ");
        mes = entrada.nextInt();

        System.out.print("Digite el año que desea (YYYY): ");
        anio = entrada.nextInt();

        // Ejecutamos los procesos

        // En estos casos si es util omitir el break, es similar al OR en If-Else

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31; //Esto se va aplicar en cascada entonces no hace falta poner el valor de numeroDias
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    numeroDias = 29;
                    anioBisiesto = " es un año bisiesto";
                }
                else {
                    numeroDias = 28;
                }
                break;
            default:
                System.out.println("Error, el número no coincide con ningun número del mes");
                numeroDias = 0;
        }

        // Mostramos resultados
        System.out.println("El mes "+mes+" tiene "+numeroDias+" días"+anioBisiesto);

    }
}
