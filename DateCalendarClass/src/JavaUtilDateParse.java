import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd': ");
        String fechaUser = input.nextLine();

        // Here we put the pattern we need in the string that users will give for us
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); // User should use this pattern
        try {
            Date fecha = formato.parse(fechaUser);
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + formato.format(fecha));
            // Compare dates, this could be useful to validate information, we can know if a card date has expired or
            // something similar, using try catch and do while me can repeat the process if the result is bad

            // This is the first method, with after and before
            Date fechaActual = new Date();
            if (fecha.after(fechaActual)) { // If date is higher or after of current date
                System.out.println("La fecha del usuario es posterior a la fecha actual");
            }
            else if (fecha.before(fechaActual)) { // If date is less or before of current date
                System.out.println("La fecha del usuario es anterior a la fecha actual");
            }
            else if (fecha.equals(fechaActual)) { // If dates are the same
                System.out.println("Las fechas son iguales");
            }
            // Moreover, we can compare with compareTo, as a second Date method, this returns an int
            if (fecha.compareTo(fechaActual) > 0) { // This is like to say: It's higher or after
                System.out.println("La fecha del usuario es posterior a la fecha actual");
            }
            else if (fecha.compareTo(fechaActual) < 0) { // This is like to say: It's higher or after
                System.out.println("La fecha del usuario es anterior a la fecha actual");
            }
            else if (fecha.compareTo(fechaActual) == 0) { // This is like to say: It's higher or after
                System.out.println("Las fechas son iguales");
            }
        } catch (ParseException ex) {
            System.err.println("Error, debe ingresar la fecha con el formato establecido " + ex.getMessage()); // We get the message
            System.err.println("El formato correcto debe ser 'yyyy-MM-dd'");
            // System.exit(1); // We can use this to stop the program or we repeat the main method in a recursive way if we have mistakes
            main(args);
        }


    }
}
