public class BucleEtiquetas {
    public static void main(String[] args) {
        // This a label used in loops and other structures to do references
        // Labels affect only the loops that are down, for example, the label loop1 affects for with i variable
        // does not affect the for with j variable, just in the case this loop has a label too.

        loop1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue loop1;
                }
                System.out.print("[i = " + i + ", j = "+ j + "], ");
            }
        }

        // This is for dividing both loops
        System.out.println("\n------------------------------------------------------------------------------------");

        loop2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break loop2;
                }
                System.out.print("[i = " + i + ", j = "+ j + "], ");
            }
        }





    }
}
