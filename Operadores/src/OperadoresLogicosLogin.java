import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        // Datos a validar
        // Mejorar programa agregando un Array

        // String [] userArray = new String [2]; // Estructura del array sin definir elementos: TipoDato []-Nombre-new-TipoDato-[Numero de datos a guardar]
        // String [] passwdArray = new String [2];

        String [] userArray = {"Marco","Luis"}; // Estructura array con elementos definidos: TipoDato []-Nombre- = {Elementos a almacenar predefinidos}
        String [] passwdArray = {"Mantoara2310","12345"};

        // Variables en las que se guarda el input
        String user = "", passwd = "";

        System.out.print("Ingrese el username: ");
        user = entrada.nextLine();
        System.out.print("Digite la contraseña: ");
        passwd = entrada.nextLine();

        boolean esAutenticado = false;
        user = user.trim(); // Para quitar los espacios en ambos lados, para validar

        //Solo se hace un for con el numero de usuario, no hace falta uno para password porque primero deben haber usuarios para que haya un password
        // por lo que solo se necesita el for para usuarios, ya que las variables antes tomaron los datos entonces siempre al haber 3 usuarios hay 3 passwords
        // y así sucesivamente.

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].equals(user) && passwdArray[i].equals(passwd)) {
                esAutenticado = true;
                break; // Usamos el break para detener el for
            }
        }

        if (esAutenticado) {
            System.out.println("Sus credenciales han sido validados de forma correcta");
            System.out.println("Bienvenido usuario ".concat(user).concat("!"));
        }
        else {
            System.out.println("Username o contraseña incorrecta!");
            System.out.println("Error, requiere autenticación");
        }
        System.exit(0);
    }
}
