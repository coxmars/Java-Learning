import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {

        // The method System.getenv() returns a map object with all environment variables, a map is like a
        // associative array, values that are stored with a name, it is known as key and value
        //   KEY     VALUE
        Map< String, String> varEnvironment = System.getenv();
        // They are typically capitalized
        System.out.println("Variables de ambiente del sistema = " + varEnvironment);

        System.out.println("------------ Listando Variables de Entorno del Sistema -------------");

        // We can show all variables of the Map with for like this:
        for (String key: varEnvironment.keySet()) {
            System.out.println(key + "=>" + varEnvironment.get(key));
        }

        // We can search specific environment variables in this way:
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        // We can create our environment variables in the Operative System like in the configuration of properties
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("TEMP = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        // Moreover, we can create our own environment variables, in windows we search environment variables
        // and we can create new variables, to see the changes we have to restart the IDE IntelliJ and then we see}
        // the results for example: APPLICATION_ENV = Desarrollo

        // Here we take the values from the Map object
        String appEnv = varEnvironment.get("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv); // If appears null it means we have to restart the IDE

        // Also, we can create the environment variables from the terminal of the operative system
        // in the case of Windows,we use setx PRUEBA_ENV "Haciendo test variables de entorno" in terminal, if we use
        // 1 word we can skip the quotation marks, the we see the changes if enter into the environment variables in Windows

        // Here we take the values from the Map object
        String test = varEnvironment.get("PRUEBA_ENV");
        System.out.println("test = " + test);

    }
}
