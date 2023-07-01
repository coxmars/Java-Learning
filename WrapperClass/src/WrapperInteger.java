public class WrapperInteger {
    public static void main(String[] args) {

        Integer deprecated = new Integer (23); // This method is deprecated, better use another as good practice

        // Primitive conversion to an Integer reference object in an Integer Wrapper class
        int primitiveInt = 23;
        // This the way to make a conversion
        Integer intObject = Integer.valueOf(primitiveInt); // This the correct way, is called boxing
        Integer intObject2 = primitiveInt; // This called auto boxing, both ways are correct
        System.out.println("objetoInt = " + intObject);
        

        // Integer reference object conversion to a primitive or literal
        int num = intObject;
        int num2 = intObject2.intValue(); // intValue() returns the primitive number of the object
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);


        // String conversion to an Integer reference object in an Integer Wrapper class
        // Remember that valueOf can receive an int and string
        String stringValue = "55600";
        Integer value = Integer.valueOf(stringValue);
        System.out.println("value = " + value);

        // We put the value of intObject in shortObject even if the value is more big than the short
        // in the case intObject has more digits that the supported we will lost information in shortObject
        Short shortObject = intObject.shortValue();
        System.out.println("shortObject = " + shortObject);

        // We put the value of intObject in byteObject even if the value is more big than the byte
        // in the case intObject has more digits that the supported we will lost information in byteObject
        byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);
        
        //All of these conversions apply for all primitive data

    }
}
