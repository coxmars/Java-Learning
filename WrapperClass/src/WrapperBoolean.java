public class WrapperBoolean {
    public static void main(String[] args) {


        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean result = num1 > num2; // This is false
        Boolean BooleanObject = Boolean.valueOf(result);
        Boolean BooleanObject2 = Boolean.valueOf("false");
        Boolean BooleanObject3 = false;

        System.out.println("result = " + result);
        System.out.println("BooleanObject = " + BooleanObject);
        System.out.println("BooleanObject2 = " + BooleanObject2);

        System.out.println("Comparando dos objetos boolean: "+ (BooleanObject == BooleanObject2));
        System.out.println("Comparando dos objetos boolean: "+ (BooleanObject2 == BooleanObject3));
        System.out.println("Comparando dos objetos boolean: "+ (BooleanObject == BooleanObject3));


        // Boolean expresions as a wrapper class compares per value with == instead of .equals() like in numbers
        // or Strings, but also can use .equals() for Boolean.


        // Convert
        boolean result2 = BooleanObject.booleanValue(); // This called unboxing

    }
}
