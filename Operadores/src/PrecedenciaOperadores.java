public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;
        // Recordar precedencia operadores, la multiplicación, división y residuo tienen más importancia que suma y resta.
        // Por esto usamos parentesis en las sumas.
        double promedio = (i + j + k) / 3d; // Recordar poner d de double
        System.out.println("promedio = " + promedio);
        // Si los operadores poseen la misma precedencia o importancia se ejecutan conforme avanzan de izquierda a derecha.

        promedio = i + j + k / 3d * 10; // En este caso el orden de lectura inicia con la division y luego la multiplicación y el resto
        System.out.println("promedio = " + promedio);
        // Lo mejor es usar parentesis para asegurar los procesos y resultados dependiendo de lo que se necesite obtener
        // además de recordar la precedencia de los operadores y su importancia ya sea en aritmeticos, relacionales etc

        promedio = ++i + j-- + k / 3d * 10; // El valor de i se transforma en 15 y el j sigue igual en 8 porque primero asigna el valor y luego decrementa
        System.out.println("promedio = " + promedio);

    }
}
