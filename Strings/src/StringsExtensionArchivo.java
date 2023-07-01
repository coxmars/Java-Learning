import java.util.Scanner;

public class StringsExtensionArchivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String archivo = "";
        System.out.print("Ingrese el nombre del archivo con su extensión: ");
        archivo = entrada.nextLine();
        int extension = archivo.indexOf('.');
        // Al usar este metodo pueden salir errores por poner más de un punto, por eso mejor usar lastIndexOf
        // porque este toma el ultimo punto y todas las extensiones llevan ese ultimo punto al final
        int extension2 = archivo.lastIndexOf('.');
        System.out.println("La cantidad de caracteres que contiene es = " + archivo.length());
        System.out.println("La extensión del archivo es = " + archivo.substring(extension2));
    }
}
