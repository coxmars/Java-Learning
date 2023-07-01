package Ejemplo01;

public class MainToString {
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
        System.out.println("============================================");
        System.out.println(persona); // Imprimimos el metodo to string, solo al llamar la clase respectiva por defecto lo retorna
    }
}
