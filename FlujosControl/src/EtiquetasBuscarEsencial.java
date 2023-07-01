import java.util.Scanner;

public class EtiquetasBuscarEsencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // This is the algorithm to search a word in a phrase or string

        String phrase = "tres tristes tigres tragan trigo en un trigal";
        String word;
        System.out.print("\nDigite la palabra que quiere buscar: ");
        word = input.nextLine();
        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;
        int quantity = 0;
        char letter;

        search:
        for (int i = 0; i <= maxPhrase;) {
            int k = i;
            for (int j = 0; j < maxWord; j++) {
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue search;
                }
            }
            quantity++;
            i = i + maxWord; // This is to improve the code in an efficient way, does not repeat all words, just start again
            // the word that is correct for doing that in a faster way.
        }

        if (quantity > 1) {
            System.out.println("Encontrada " + quantity + " veces la palabra "+ word +" en la frase");
        }
        else {
            System.out.println("Encontrada " + quantity + " vez la palabra "+ word +" en la frase");
        }



        /*
        // This is the algorithm to search a character in a phrase or string

        String phrase = "tres tristes tigres tragan trigo en un trigal";
        int maxPhrase = phrase.length();
        int quantity = 0;
        char letter;

        System.out.print("\nIngrese la letra/caracter que desea encontrar: ");
        letter = input.next().charAt(0); // This the method to read only a character per console

        for (int i = 0; i < maxPhrase; i++) {
            if (phrase.charAt(i) != letter) {
                continue;
            }
            quantity++;
        }
        System.out.println("Encontrado "+quantity +" veces el caracter "+letter +" en la frase");
        */


    }
}
