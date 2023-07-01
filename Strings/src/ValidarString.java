public class ValidarString {
    public static void main(String[] args) {
        String course = null; // Sin referencia, sin una instancia
        // Si el objeto o instancia es null y se intenta invocar va aparecer la excepcion NullPointerException
        boolean esNulo = course == null;
        System.out.println("esNulo = " + esNulo);
        /*
        if (esNulo == false) {
            System.out.println(course.toUpperCase()); // Este print produce NullPointerException porque course es null
        }
        */
        // También si concatenamos course que es null con concat() y algo más eso nos retorna NullPointerException
        // System.out.println("Bienvenido al curso".concat(course));
        // System.out.println("Bienvenido al curso "+course);
        // Este con el + nos retorna el print normal con el valor de course que es null, aun así es un error
        if (esNulo) {
            // course = "Programación en Java";
            course = "";
        }
        System.out.println("Bienvenido al curso ".concat(course));
        boolean esVacio = course.length() == 0; // Esta es una forma pero se puede hacer con isEmpty

        boolean esVacio2 = course.isEmpty(); // Esto hace lo mismo que el anterior pero con isEmpty
        // debido a que este metodo evalua que sea igual a 0: return value.length == 0;
        System.out.println("esVacio2 = " + esVacio2);

        /* El metodo isEmpty valida que la longitud de caracteres == 0 y el metodo isBlank
        devuelve true si es isEmpty y si es un espacio en blanco, entonces
        puede ser muy util
        */

        boolean esBlanco = course.isBlank(); // Este es el metodo
        System.out.println("esBlanco = " + esBlanco); // En este caso return boolean

        if (esBlanco){
            System.out.println("Bienvenido al curso ".concat(course));
        }

    }
}
