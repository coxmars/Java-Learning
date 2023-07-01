package Ejemplo01;

public class MainConstructores {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Marco","Araya",19,"Fidelitas");
        alumno.setNotaMatematicas(8.4);
        alumno.setNotaHistoria(9.2);
        alumno.setNotaCiencias(9.9);
        alumno.setEmail("Marcojime23@mail.com");

        System.out.println("======== Creando la instancia de la clase Alumno Internacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Luis","Jimenez","Costa Rica");
        alumnoInt.setEdad(19);
        alumnoInt.setInstitucion("TEC");
        alumnoInt.setNotaMatematicas(8.4);
        alumnoInt.setNotaHistoria(9.2);
        alumnoInt.setNotaCiencias(9.9);
        alumnoInt.setNotaIdiomas(8.8);
        alumnoInt.setEmail("LuisBoga10@gmail.com");

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("Esteban","Marin","Programación");
        profesor.setEdad(45);
        profesor.setEmail("profesorEsteban@gmail.com");

        System.out.println("====================================");
        // Aqui imprimimos
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir (Persona persona) {
        System.out.println("Imprimiendo Datos en común de Persona");
        System.out.println("Nombre: " + persona.getNombre()
                + ",Apellido: " + persona.getApellido()
                + ",Edad: " + persona.getEdad()
                + ",Email: " + persona.getEmail());
        if (persona instanceof Alumno) { // Hacemos un cast porque son datos de otras clases hijas
            System.out.println("Imprimiendo Datos de Alumno");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Ciencias: " + ((Alumno) persona).getNotaCiencias());
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo Datos de AlumnoInternacional");
                System.out.println("Nota Idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============== Sobre Escritura Promedio ==============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
        }

        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo Datos de Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("============== Sobre Escritura Saludar ==============");
        System.out.println(persona.saludar());

    }
}
