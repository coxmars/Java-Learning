import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        // CRUCIAL: The system class is designed not to be instantiated, for that reason we use System and all its methods
        // and attributes, so we can not use the new operator

        // We create a file with properties extension, always put this extension
        // The data in config.properties do not need ; just the variable and the value for saying something
        // Stream comes from data stream, the bytes that is the content of the file are processed here

        try {
            FileInputStream file = new FileInputStream("CursoIntelliJ/ClaseSystem/config.properties");
            // As arguments we pass the file route
            // Here we import Properties and we add as argument all properties of the system and we load all own configs
            Properties properties = new Properties(System.getProperties());
            properties.load(file);

            // Also instead of using an external file, we can set the configuration with methods like:
            properties.setProperty("mi.red","Red de Area Local"); // Here we pass first the key and seconds the value

            // Before to print all configurations we have to update the getProperties with set in this way:
            System.setProperties(properties); // We pass the object we created with the name properties
            System.getProperties().list(System.out); // Here we print all configurations we have

        } catch (Exception ex) { // We use the general Exception to reduce specific exceptions, less code lines
            System.err.println("No existe el archivo "+ ex); // Err is an attribute for mistakes, print in red
            System.exit(1); // We use a 0 for stopping the program and all is correct, we use 1 when we have an exception
        }

        // These are several configurations we established before.
        System.out.println("\nLas configuraciones agregadas son: ");
        System.out.println(System.getProperty("config.autor.nombre"));
        System.out.println(System.getProperty("config.autor.email"));
        System.out.println(System.getProperty("config.autor.profesion"));

    }
}
