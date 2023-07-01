import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {

        String text = "Hola que tal!";
        // With this method we discover the internal structure of the object or class.
        Class strClass = text.getClass(); // This returns a class instance

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        // We use foreach and first we have to put the elements data type of an array, in this case Method that is imported from java.lang.reflect
        for (Method method: strClass.getMethods()) {
            System.out.println("method = " + method.getName()); // Method is just an object so we have to put the method name with method.getName()
        }

        Integer num = 23;
        Class intClass = num.getClass();
        Class objectClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass = " + intClass.getSimpleName());
        System.out.println("intClass SuperClass = " + intClass.getSuperclass().getSimpleName());
        System.out.println("objectClass = " + objectClass);


        for (Method method: objectClass.getMethods()) {
            System.out.println("method = " + method.getName()); // Method is just an object so we have to put the method name with method.getName()
        }


    }
}
