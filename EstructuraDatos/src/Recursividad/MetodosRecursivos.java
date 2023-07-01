package Recursividad;

import javax.swing.*;

public class MetodosRecursivos {
    public static void main(String[] args) {
        MetodosRecursivos object = new MetodosRecursivos();
        int escalon;
        escalon = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los escalones que desea bajar: ", "Ingresar escalón", JOptionPane.INFORMATION_MESSAGE));
        object.bajarEscalera(escalon);
    }

    // Creating a method to recursively lower a ladder
    public void bajarEscalera(int escalones) {
        if (escalones < 0) {
            System.out.println("Programa detenido, no puede bajar escalones menores a 0");
        }
        else if (escalones == 0) {
            // This is the base case, the explicit answer, when we finished the main process of the program
            System.out.println("Has terminado de bajar la escalera");
        }
        else {
            try {
                // This is the domain, the division of the original problem (problem - 1)
                Thread.sleep(500); // This will establish the time for each stair
                System.out.println("Bajando escalón " + escalones);
                // Using the recursion to solve the issue
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                System.out.println("Error durante la ejecución del programa "+ex.getMessage());
            }
        }
    }


}
