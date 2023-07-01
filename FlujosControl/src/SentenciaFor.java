public class SentenciaFor {
    public static void main(String[] args) {

        // Como se sabe el for esta separado por tres partes con ;
        // Si la variable usada en el for se inicializa afuera esta tiene un alcance en el main, si se inicializa adentro
        // del for esta tendrá alcance solo dentro del for debido a las llaves. Lo más común es dejar la variable dentro
        // del for inicializada

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        // Ejemplo de for con más parametros
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }

        // Ejemplo de for para determinar números pares o impares.

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // En vez de salirse del bucle se sale de la iteración especifica
            }
            // Como resultado se muestran los números impares, si queremos los pares negamos el if
            System.out.println("i = " + i);
        }

    }
}
