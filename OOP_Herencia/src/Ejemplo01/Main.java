package Ejemplo01;

public class Main {
    public static void main(String[] args) {
        /*
        - Al instanciar una clase hija primero se llama al constructor del padre antes que incluso llamar al constructor de
        la clase hija, esto causa el llamado de constructores en cadena.
        - El metodo super(); siempre se pone en los constructores de las clases hijas y de primero antes que cualquier cosa,
        la función es llamar al constructor del padre, pero si se omite igual llama al constructor del padre, pero vacio, sin
        parametros.
        - Cada que se implementa un constructor por parametros se pierde el constructor default sin parametros
        - El modificador final es para evitar la herencia, si se hace una clase con final es para que esta no tenga herederos o
        clases hijas y si se usa en un metodo es para evitar que se sobre escriban, se hace por diseño y seguridad.
        */

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Marco");
        alumno.setApellido("Araya");
        alumno.setInstitucion("Fidelitas");
        alumno.setNotaMatematicas(8.4);
        alumno.setNotaHistoria(9.2);
        alumno.setNotaCiencias(9.9);

        System.out.println("======== Creando la instancia de la clase Alumno Internacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Luis");
        alumnoInt.setApellido("Jimenez");
        alumnoInt.setPais("Costa Rica");
        alumnoInt.setEdad(19);
        alumnoInt.setInstitucion("TEC");
        alumnoInt.setNotaMatematicas(8.4);
        alumnoInt.setNotaHistoria(9.2);
        alumnoInt.setNotaCiencias(9.9);
        alumnoInt.setNotaIdiomas(8.8);

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Esteban");
        profesor.setApellido("Marin");
        profesor.setAsignatura("Matematicas");

        System.out.println("======== Datos Obtenidos ========");

        System.out.println("Estudiante: " + alumno.getNombre() + " " + alumno.getApellido() + ", Instituto: " + alumno.getInstitucion());

        System.out.println("Estudiante Internacional: " + alumnoInt.getNombre() + " " + alumnoInt.getApellido()
        + ", Instituto: " + alumnoInt.getInstitucion() + ", país: " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
        + ": " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }



        // Esta es la otra forma mediante el modificador protected, se puede accesar por clases hijas o bien por clases que esten
        // dentro del mismo paquete
        /*
        Alumno alumno = new Alumno();
        alumno.nombre = "Marco";
        alumno.apellido = "Araya";
        */
    }
}
