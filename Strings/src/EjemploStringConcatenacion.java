public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String course = "Java Programming";
        String student = "Marco Araya";

        String details = course+" with the student "+student;
        System.out.println(details);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(details + " " + numeroA + numeroB); // Se concatena un string con una suma entre dos números
        // El resultado de esto es 105, concatena también los numeros como un string y no los suma, esto por la precedencia de operadores
        // al leer de primero un string asume que todos los valores son un string y los concatena, esto se soluciona con parentesis
        // estos tienen mayor prioridad. Usar parentesis al concatenar numeros con strings y para operaciones aritmeticas
        System.out.println(details + " " + (numeroA + numeroB));

        // Otra alternativa para concatenar es con el metodo .concat();
        String details2 = course.concat(" with the student ").concat(student); // Este metodo se usa para strings
        System.out.println("details2 = " + details2);
        // Este metodo concat() es más eficiente que usar solo (+), porque el + crea instancias diferentes con el stringbuilder
    }
}
