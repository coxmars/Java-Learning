public class SpeedWhileVSFor {
    public static void main(String[] args) {

        int i = 0;
        long inicioWhile = System.currentTimeMillis();

        while (i < 100) {
            System.out.println("i = " + i);
            i++;
        }

        long finWhile = System.currentTimeMillis();

        long inicioFor = System.currentTimeMillis();

        for (int x = 0; x < 100; x++) {
            System.out.println("x = " + x);
        }
        long finFor = System.currentTimeMillis();

        System.out.println("Los resultados son los siguientes: ");
        System.out.println("El tiempo del while es: "+(finWhile-inicioWhile));
        System.out.println("El tiempo del for es: "+(finFor-inicioFor));

        // CONCLUSION: It's better to use a for instead of while because is more faster.

    }
}
