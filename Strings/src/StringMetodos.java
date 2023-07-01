public class StringMetodos {
    public static void main(String[] args) {
        //Estudiar metodos principales clase string
        // String inicia desde 0 la posición de los caracteres, es decir, M = Posición 0
        String nombre = "Marco"; //Posición: 01234 = 5 caracteres
        System.out.println("nombre.length() = " + nombre.length()); // Nos da la cantidad de caracteres del string
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); // Pone en mayuscula el string
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); // Pone en minuscula el string
        System.out.println("nombre.equals(\"Marco\") = " + nombre.equals("Marco")); // Compara por valor el string
        System.out.println("nombre.equals(\"marco\") = " + nombre.equals("marco")); // Compara por valor el string
        System.out.println("nombre.equalsIgnoreCase(\"marco\") = " + nombre.equalsIgnoreCase("marco"));
        // Compara por valor el string sin importar las mayusculas y minusculas.
        System.out.println("nombre.compareTo(\"Marco\") = " + nombre.compareTo("Marco"));
        // Compara según un orden lexico-grafico, que se basa en la tabla unicode, realiza comparación con los códigos
        // referentes a los caracteres de Unicode. Retorna 0 si son identicos, si son distintos retorna otro número
        // de hecho el equals sería lo mismo que usar un compareTo solo que uno da true y otro 0.
        System.out.println("nombre.charAt() = " + nombre.charAt(0)); // El metodo siempre recibe un entero como parametro
        // porque devuelve el caracter en dicha posición. Sirve de forma conjunta con un for para validar strings
        System.out.println("nombre.substring(0) = " + nombre.substring(0)); // Este obtiene ciertos caracteres del string
        // al usar este se lee como: imprima del caracter en la posición 0 hasta el ultimo, pero se puede dar un rango
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));
        // Se lee como: Imprimer los caracteres empezando de la posición 0 hasta 3, pero el 3 no se incluye, el 0 si


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\"i\") = " + trabalenguas.replace("a","i"));
        // Replace: reemplaza caracteres, el 1 argumento es el caracter a cambiar y el 2 es el que lo sustituye
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        // Este permite identificar un caracter dentro del String, puede identificar un string o char, este entrega}
        // el número de posición en la que por 1 vez encuentra el caracter o frase.
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        // Este es lo mismo que indexOf pero busca la ultima ocurrencia y retorna esa posición
        // En el indexOf si el retorno es => 0 es que lo encontró y si es negativo es que no lo encontró
        System.out.println("trabalenguas = " + trabalenguas.contains("t"));
        // Este metodo contains hace lo mismo que indexOf pero se le pasa el caracter como string, en cambio indexOf
        // lo puede recibir por un char o string además que el contains retorna un boolean true o false
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        // Este metodo busca si un string inicia con determinados caracteres y retorna true o false
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        // Este busca el final o como termina el string a ver si es lo mismo y retorna boolean
        System.out.println("  Trabalenguas ");
        System.out.println("  Trabalenguas ".trim()); //Este metodo nos ayuda a quitar espacios por ambos lados
        // Este metodo es bastante util al trabajar en web, con formularios porquenlos datos pueden venir con espacios
        // entonces este metodo trim() los quita.
    }
}
