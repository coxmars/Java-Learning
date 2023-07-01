import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        // This is a different class because is abstract, it means that does not allow to use the new to instance
        // the class, therefore, we can not use new to create the object, that is a characteristic for design
        // So, to solve this we put Calendar.getInstance() and thats it, it creates everything for us
        // Below create an instance of Gregorian calendar at least for the west, but depends of our location and time
        // because in Japon is used the Japanese Imperial Calendar.

        Calendar calendario = Calendar.getInstance();

        // Constants start with a capital letter

        // This method set allow us to put a specific date, the month start since 0, so January is 0, February is 1 and
        // it advances in this way, we can customize more aspects like these:
        // Moreover, in month we can put Calendar. as a constant and we see the options to choose a month,year etc.

        // This is the first alternativa of Calendar to use
        // calendario.set(2021,Calendar.MONTH,23,15,23,10);

        // This is the second option to use Calendar, but is more large
        calendario.set(Calendar.YEAR,2021); // We use the constant and to the right we put the value of the year
        calendario.set(Calendar.MONTH, Calendar.MARCH); // We can use a constant in the value part
        calendario.set(Calendar.DAY_OF_MONTH,23);

        calendario.set(Calendar.HOUR,5); // This is the normal hour format 0 - 12 hours
        calendario.set(Calendar.AM_PM, Calendar.PM); // This is useful for hours, if is early or late, we put AM or PM
        calendario.set(Calendar.MINUTE,23);
        calendario.set(Calendar.SECOND,10);

        Date fecha = calendario.getTime();
        System.out.println("\nFecha sin formato= " + fecha);

        // We use a format for the date, for the second method of calendar
        // SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss a");
        // With the last a we represents de AM or PM, the format HH is for 24 hours and not for 12 hours
        // but we can change that with this method: Changing HH for hh, this means 12 hours format

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss a");

        String DateFormat = formato.format(fecha); //This is like a constant but we change the variables names
        System.out.println("\nFecha con formato = " + DateFormat);

        // Comparamos fechas con calendar

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        // This is the first method, with after and before
        Date fechaActual = new Date();
        if (fecha.after(fecha2)) { // If date is higher or after of current date
            System.out.println("La fecha del usuario es posterior a la fecha actual");
        }
        else if (fecha.before(fecha2)) { // If date is less or before of current date
            System.out.println("La fecha del usuario es anterior a la fecha actual");
        }
        else if (fecha.equals(fecha2)) { // If dates are the same
            System.out.println("Las fechas son iguales");
        }

        // Moreover, we can compare with compareTo, as a second Date method, this returns an int
        if (fecha.compareTo(fecha2) > 0) { // This is like to say: It's higher or after
            System.out.println("La fecha del usuario es posterior a la fecha actual");
        }
        else if (fecha.compareTo(fecha2) < 0) { // This is like to say: It's higher or after
            System.out.println("La fecha del usuario es anterior a la fecha actual");
        }
        else if (fecha.compareTo(fecha2) == 0) { // This is like to say: It's higher or after
            System.out.println("Las fechas son iguales");
        }

    }
}
