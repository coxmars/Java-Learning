public class ArgumentosLineaComandos {
    public static void main(String[] args) {

        // This still does not work because we have not passed parameters
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos número " + i + ":" + args[i]);
        }
        // We have to use CMD, terminal in IntelliJ or others terminals to prove this
        // We put dir to see directories and then we put cd and the directory we want like CursoIntelliJ
        // Then we have to put dir to see carpets, then we choose our own with cd all necessary times and to compile a class in terminal
        // We put: javac -> NameClass.java always this is the first step the compilation and then the execution
        // To execute is: java -> NameClass without .java or something similar and we pass the parameters
        // IMPORTANT: All these processes are correct but the problem is execute apps in terminal, because we have to
        // change version of SDK


    }
}
