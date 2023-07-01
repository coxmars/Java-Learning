public class EjemploStringInmutable {
    public static void main(String[] args) {
        /*
        Una de las caracteristicas del String es que es inmutable, por lo tanto, su estado o valor no cambia, una vez que se
        crea el objeto este valor se mantiene inalterable, cuando se cambia el valor lo que hace es crearse un nuevo objeto
        y se guarda en esa variable porque cambia la referencia de ese objeto hacia otra instancia,
         */
        String course = "Java Programming";
        String student = "Marco Araya";
        String result = course.concat(student);
        System.out.println("Course = " + course);
        System.out.println("result = " + result);
        System.out.println(course==result); // Es false porque es una nueva instancia, un nuevo objeto
        
        /* Alternativa para concatenar, transformar o convertir un string de forma más funcional con expresiones lambda
        o funciones anonimas, esto recibe una función o expresión lambda que al final es un bloque de código
        por eso se pasa por argumento el string, se pone c porque no se puede usar curso porque ya existe esa variable
        */

        String result2 = course.transform(c ->{
            return c + " with the student "+ student;
        });
        System.out.println(result2);

        result.replace("a","A");
        System.out.println("result = " + result); // No se modifica nada, recordar que es inmutable a menos que se
        // use otra instancia en la literal o con el operador new por ejemplo:
        String result3 = result.replace("a","A");
        System.out.println("result3 = " + result3);
    }
}
