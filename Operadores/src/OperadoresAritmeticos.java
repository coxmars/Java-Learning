public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int num1 = 20, num2 = 3;

        int suma = num1 + num2;
        System.out.println("suma = " + suma);
        System.out.println("num1 + num2 = "+ (num1 + num2));
        // Los parentesis tienen mayor precedencia o privilegios, por eso van de primeros
        
        int resta = num1 - num2;
        System.out.println("resta = " + resta);
        System.out.println("num1 - num2 = "+ (num1 - num2));


        int multi = num1 * num2;
        System.out.println("multiplicación = " + multi);
        System.out.println("num1 * num2 = "+ (num1 * num2));


        int div = num1 / num2;
        float div2 = (float)num1 / (float)num2; // Hacerle un cast porque a pesar de que div2 sea float, num1 y num2 son int
        System.out.println("división = " + div);
        System.out.println("división = " + div2);


        int residuo = num1 % num2;
        System.out.println("residuo = " + residuo);

    }
}







