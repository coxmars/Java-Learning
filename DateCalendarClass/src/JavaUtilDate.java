import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {


        // We create object or instance of Date
        Date firstDate = new Date();
        System.out.println("\nFecha = " + firstDate);
        // We create object or instance of SimpleDateFormat
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss"); // Here we can pass a Date Format

        // We can put MM for months with numbers, MMM for a parcial name or MMMM for the complete name of the month
        // and we can use - / or , to separate day,month and year. HH means hours, mm means minutes and ss means seconds
        // If we want to include a string o something similar with simple '' we do that. EEEE is for the complete name of the day
        // On internet we can search SimpleDateFormat java 14 or something similar to see the meaning of each letter.

        String fechaStr = df.format(firstDate); // This format receive the object Date and returns a string as a date
        System.out.println("\nLa fecha formateada es: " + fechaStr);



        // GetTime is another interesting method that returns a long data type, but in milliseconds since january of 1970,
        // this format is known in Unix, in fact it is part of Unix, this is similar like the method used in the test
        // executed in StringBuilder,concat and +

        long j = 0;
        for (int i = 0; i < 1000000; i++) {
            j += i;
        }

        System.out.println("j = " + j);
        Date secondDate = new Date ();
        long finalTime = secondDate.getTime() - firstDate.getTime();
        System.out.println("Tiempo transcurrido en el for = " + finalTime);


    }
}
