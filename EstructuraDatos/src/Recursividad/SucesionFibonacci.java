package Recursividad;

import javax.swing.*;

public class SucesionFibonacci {
    public static void main(String[] args) {
        SucesionFibonacci object = new SucesionFibonacci();
        int fibonacci;
        fibonacci = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to see fibonacci sequence: ", "Enter number", JOptionPane.INFORMATION_MESSAGE));
        System.out.println("The fibonacci sequence of " + fibonacci + " is: " + object.recursiveFibonacci(fibonacci));
    }

    // Creating the recursive method for the fibonacci sequence
    public int recursiveFibonacci (int n) {
        // This is the explicit answer or base case
        if (n == 1 || n == 2) {
            return 1;
        }
        // Domain (problem - 1)
        else {
            return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
        }
    }

}
