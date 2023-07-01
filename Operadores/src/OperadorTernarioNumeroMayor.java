import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int max = 0, min = 0, num1 = 0, num2 = 0, num3 = 0;
        System.out.print("Ingrese un número: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese un segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Ingrese un tercer número: ");
        num3 = entrada.nextInt();

        max = (num1 > num2) ? num1:num2;
        max = (max > num3) ? max:num3;
        min = (num1 > num2) ? num2:num1;
        min = (min > num3) ? num3:min;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("El número máximo es = " + max);
        System.out.println("El número minimo es = " + min);

    }
}
