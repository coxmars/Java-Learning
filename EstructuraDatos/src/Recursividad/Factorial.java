package Recursividad;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        Factorial object = new Factorial();
        int factorial;
        factorial = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number for factorial: ", "Enter a number", JOptionPane.INFORMATION_MESSAGE));
        if (factorial < 0) {
            object.recursiveFactorial(factorial);
        }
        else {
            System.out.println("The factorial of " + factorial + " is: " + object.recursiveFactorial(factorial));
        }
    }

    // Factorial of 4! = 4 * 3 * 2 * 1, Creating the factorial method recursively
    public int recursiveFactorial (int n) {
        if (n < 0) { // This is the validation
            System.out.println("Error, you can not enter negative numbers");
            return 0;
        }
        else {
            // This is the base case for this problem
            if (n == 0) {
                return 1;
            }
            // This is the domain (problem - 1)
            else {
                return n * recursiveFactorial(n-1);
            }
        }
    }

}
