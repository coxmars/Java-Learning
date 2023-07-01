public class SentenciaForEach {
    public static void main(String[] args) {

        // ForEach or best version of for is used in arrays o other data types.
        int [] numbersArray = {1,2,3,4,5,6,7,8,9,10};

        // Structure ForEach -> for (data type name(does not matter what): arrayName)
        for (int numbers: numbersArray) {
            System.out.println("numbers = " + numbers);
        }
        // Values of array will be printed with numbers, it is like i,x or other variable, the index

        String [] names = {"Marco","Luis","Diego","Jesus","Esteban","Jose"};

        for (String namePeople: names) {
            System.out.println("namePeople = " + namePeople);
        }


    }
}
