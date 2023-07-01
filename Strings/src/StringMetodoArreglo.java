public class StringMetodoArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        // Aqui se imprime el identificador, el hash del objeto arreglo, cada arreglo es una instancia y son de referencia, la unica forma de
        // mostrar el array es mediante una iteración usando ciclos

        char [] array = trabalenguas.toCharArray(); // Esto retorna un arreglo del tipo char

        for (int x=0; x<array.length; x++){ // Aqui se usa el length como atributo o propiedad del array
            // Imprimir el array mediante concat()
            System.out.println("Posición ".concat(String.valueOf(x+1).concat(": ").concat(String.valueOf(array[x]))));
            // Imprimir el array mediante +
            System.out.println("Posición "+(x+1)+": "+array[x]);
        }

        // Utilizamos expresiones regulares/regex para convertirlo en arreglo string segun un parametro
        System.out.println("trabalenguas = "+ trabalenguas.split("a"));
        // Se crea un array tipo string en que cada elemento de este arreglo va a ser las palabras o caracteres que estan separadas por la a
        // Al final lo que hace es dividir un string mediante un patron, el print muestra el identificador del arreglo porque al final se convierte en uno

        String [] array2 = trabalenguas.split("a"); // Se crea el array string para este mediante el patron de la expresión regular/regex
        int large = array2.length;
        for (int j = 0; j < large; j++){
            System.out.println("Posición "+(j+1)+": "+array2[j]);
        }

        String archivo = "imagen.jpg";
        String [] archivoArr = archivo.split("\\."); // Se pone luego de doble slashback o entre [.]
        // Si ponemos el (.) solo como parametro en el split no sirve, porque es un caracter propio de expresión regular
        // Expresiones regulares es un mundo completamente aparte y super amplio, el punto como tal es un caracter reservado de estas expresiones, pero
        // si se puede usar si la escapamos con doble slashback \\
        int large2 = archivoArr.length;
        for (int i = 0; i < large2; i++){
            System.out.println("Posición "+(i+1)+": "+archivoArr[i]);
        }
        System.out.println("Extensión: "+ archivoArr[large2-1]);
    }
}
