import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {

        // This method is to create a number of double type, between 0 and 1, but the 1 is excluded
        // We prove with colors
        String [] colores = {"Amarillo","Azul","Rojo","Celeste","Verde","Blanco"};

        double random = Math.random();
        System.out.println("random = " + random);

        random *= colores.length;
        System.out.println("random = " + random);

        /* If we go from 0 to 7 it is like this
        random *= 7;
        System.out.println("random = " + random);
        */

        random = Math.floor(random); // Aqui redondeamos hacia abajo para que no sobrepase el indice,
        // con el length llega hasta 6 pero al contar de 0 llega a 5 por eso redondeamos 1 abajo o si no le restamos 1
        // en el colores.length

        System.out.println("colores = " + colores[(int)random]); // We use a cast for this


        // Random class provides more functions and uses so it's better
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(23); // Here we do not pass an argument, but if we want we can and the result
        // will be between 0 and the number given as a parameter like 23
        System.out.println("randomInt = " + randomInt);


        // If we want to establish ranks we can do that like this:
        int randomInt2 = 15 + randomObj.nextInt(25 - 15); // From 15 to 25
        System.out.println("randomInt2 = " + randomInt2);


        randomInt2 = randomObj.nextInt(colores.length);
        System.out.println("randomInt2 = " + randomInt2);
        System.out.println("colores = " + colores[randomInt2]); //Here we do not need to use a cast

    }
}
