import java.util.Properties;

public class PropiedadesDeSistema {
    public static void main(String[] args) {
        // If we want to know more about this class search on google, java system getproperties

        String username = System.getProperty("user.name");
        System.out.println("username = " + username); // This to see the main user

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);  // The main directory of user

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);  // The directory of this project

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion); // To know the Java version

        String lineSeparator = System.getProperty("line.separator");
        String linerSeparator2 = System.lineSeparator(); // This the same but as a method of System.
        System.out.println("lineSeparator: " + lineSeparator + " Una línea nueva...");

        // To see all properties we use:
        Properties propiedades = System.getProperties();
        propiedades.list(System.out); // We print all properties of this.


    }
}
