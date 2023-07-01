import java.util.Scanner;

public class EjemploAnioBisiesto {
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
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            numeroDias = 30;
        }
        // Cualquier año que sea divisible por 400 automaticamente es bisiesto o si es divisible por 4 y no por 100
        else if (mes == 2) { // Mes especial que puede tener entre 28 a 29 dias, depende si es bisiesto o no
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;
                anioBisiesto = " es un año bisiesto";
            }
            else {
                numeroDias = 28;
            }
        }

        // Mostramos resultados
        System.out.println("El mes "+mes+" tiene "+numeroDias+" días"+anioBisiesto);


    }
}
