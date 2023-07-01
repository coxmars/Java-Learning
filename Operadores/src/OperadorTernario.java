import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Operador Ternario: Significa que esta formado por 3 partes: la primera evalua una expresión booleana, y a partir
        // de esto devuelve un valor u otro, es una versión simplificada del if-else
        // Estructura: variable = condición ? return si es verdadero : return si es falso;
        // Ejemplo

        String prueba = 23 == 23 ? "Si es verdadero": "No es verdadero";
        System.out.println("prueba = " + prueba);

        /*
        String estado = "";
        double promedio = 6.2;
        //  Si es true  ------->  Ejecuta esto y sino esto
        estado = promedio >= 5.49 ? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);
        */

        // El operador ternario sirve para cualquier tipo de dato, en estos ejemplos se usa String pero sirve para cualquiera

        // Ejemplo más elaborado con inputs

        String estado = "";
        double promedio = 0.0;
        double mate = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;
        double literatura = 0.0;

        System.out.print("Inserte su nota de matematicas entre 2.0 - 7.0: ");
        mate = entrada.nextDouble();
        System.out.print("Digite su nota de ciencias entre 2.0 - 7.0: ");
        ciencia = entrada.nextDouble();
        System.out.print("Ingrese su nota de historia entre 2.0 - 7.0: ");
        historia = entrada.nextDouble();
        System.out.print("Inserte su nota de literatura entre 2.0 - 7.0: ");
        literatura = entrada.nextDouble();

        // Obtenemos el promedio
        promedio = (mate + ciencia + historia + literatura) / 4;
        System.out.println("promedio = " + promedio);

        // Si ponemos las notas con punto y da error es porque se interpreta de forma diferente y el punto
        // en el terminal o SO no es el decimal, entonces se usa la coma en ese caso si ocurriera.

        //  Si es true  ------->  Ejecuta esto y sino esto
        estado = promedio >= 5.49 ? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);


    }
}
