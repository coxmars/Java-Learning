import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        // We define the array
        String [] productos = new String [4];

        // We establish the values
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Sansumg Galaxy";
        productos[2] = "Disco Duro SSD externo";
        productos[3] = "Asus Notebook";

        Arrays.sort(productos); // With this method it is sorted alphabetically

        // We show the data, if the variables/data do not have a value from array the default value is null
        System.out.println("Producto[0] = ".concat(productos[0]));
        System.out.println("Producto[1] = ".concat(productos[1]));
        System.out.println("Producto[2] = ".concat(productos[2]));
        System.out.println("Producto[3] = ".concat(productos[3]));



        /*
        // We define the array
        int [] numeros = new int [4];

        // We establish the values
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        // We use the variables
        int num1 = numeros[0];
        int num2 = numeros[1];
        int num3 = numeros[2];
        int num4 = numeros[3];

        // We show the data, if the variables do not have a value from array the default value is 0
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("Num3: "+num3);
        System.out.println("Num4: "+num4);
        */
    }
}
