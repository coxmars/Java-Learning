public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        // CRUCIAL: Java automatically compares up to 127 by value, after 127 Java reads the operator and depending on that
        // compares it by value or reference, this is essential because I tried with 23 and the result was true knowing that
        // the object reference was different so it had to be false, the reason was Java compares by value the 23 and not for reference,
        // only if we have a number greater than 127.


        // IMPORTANT: Auto boxing: is when we pack or convert a primitive into a Wrapper class
        // Auto unboxing: is unpacking, that is, passing from reference to a primitive value or converting from reference to primitive.


        Integer num1 = Integer.valueOf(1000); // This is the Explicit form, we could use the implicit way too
        Integer num2 = num1; // We pass the reference of number1
        // We print the numbers, but are not only numbers, are objects that contain a value
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        System.out.println("Son el mismo objecto? "+(num1 == num2)); // This will return a boolean expression: true
        // The cause is both instances are the same, so the object reference is the same too because aim to number1 reference.

        // We provide a literal value without using an object reference, so if we do the same procedure the result will be false
        // because the reference is different.

        num2 = 500;

        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1);

        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        // In Wrapper classes we have more methods and .equals() is one of them, for that reason is so useful to compare the same value of Wrapper variables
        System.out.println("Tinen el mismo valor? "+ (num1.equals(num2)));
        // This another way to know that, using .intValue()
        System.out.println("Tinen el mismo valor? "+ (num1.intValue() == num2.intValue()));
        
        // We can use relational operators with wrapper types like: > < and the arithmetic operators too.

        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);
        
        boolean condition2 = num1.intValue() < num2.intValue();
        System.out.println("condition2 = " + condition2);

        // Para comparar por valor se puede usar el == a menos que sea igual o menor de 127, si es mayor se usa .equals() o si se usa == se deben
        // convertir a primitivos con num1.intValue() y se compara con ==


    }
}
