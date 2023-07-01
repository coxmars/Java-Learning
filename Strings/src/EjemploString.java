public class EjemploString {
    public static void main(String[] args) {
        // Creando objeto string en la literal vs operador new

        String curso = "Programacion Java"; // Se crea objeto tipo String, de referencia, por debajo con el operador new Java crea este objeto, es diferente
        // a los datos primitivos
        String curso2 = new String ("Programacion Java"); // Aqui se pasa el string como argumento en el constructor
        // Todos los objetos son completamente diferentes y unicos en nuestra aplicación,a pesar de que compartan el mismo valor
        boolean esIgual = curso==curso2;
        System.out.println("curso==curso2 = " + esIgual); // Es false porque son instancias diferentes, la 1 de forma implicita y la 2 de forma explicita
        esIgual = curso.equals(curso2); // Ahora lo sobreescribimos con equals para comparar por valor
        System.out.println("curso.equals(curso2) = " + esIgual);
        esIgual = curso.equalsIgnoreCase(curso2); // Con este metodo ignoramos las mayusculas y minusculas al comparar por valor
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);
        // Ahora se compara entre formas literales del objeto
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3= " + esIgual);
        // Aqui devuelve true porque al tener el mismo valor con la misma literal no se crea una instancia nueva, se optimiza y usa la que se había hecho
        // al inicio, si se cambia el valor entonces si retorna false.
    }
}
