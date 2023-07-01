import java.util.Arrays;

public class EjemploArreglosFor {
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



    }
}
