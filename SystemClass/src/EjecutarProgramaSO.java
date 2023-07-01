public class EjecutarProgramaSO {
    public static void main(String[] args) {

        // RunTime allow us to execute applications with the method exec of execute
        // The RunTime class and the static method getRunTime allow us to know the instance of execution time
        Runtime rt = Runtime.getRuntime();
        Process proceso; // We put the process without an instance because the exec method returns the instance
        // If to validate the Operative System, we use os.name to know what is our OS and use starts with to see the name, in Windows always the
        // Operative System starts with Windows.
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) { // We pass the command Windows as a string and also we have to manage the exceptions
                proceso = rt.exec("C:/Users/marco/OneDrive/Documentos/Ingeniería en Sistemas/calculadora.exe"); // This is the app we want to open in Windows
                // Many apps need the entire route and other just the name
            }
            // Here we use contains because Linux has nux in the last part so it's better to use contains
            else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                // This is the command for Linux
                proceso = rt.exec("gedit"); // This is the app we want to open in Linux with GENOME distribution
            }
            else {
                proceso = rt.exec("textedit"); // This is the app we want to open in Mac
            }
            proceso.waitFor(); // This help us to wait the app be closed for the user

        } catch (Exception ex) {
            System.err.println("Error, el comando es desconocido: " + ex.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado correctamente la aplicacion");
        System.exit(0);

    }
}
