public class OperadoresAsignacion {
    public static void main(String[] args) {
        // Operador asignación: Es el (=) y se usa para asignar valores a distintos tipos de datos.
        // Por ejemplo, al inicializar variables

        int i = 5;
        int j = i + 10;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Operadores Compuestos de asignación
        i += 2; // Decimos que i = i + 2 de forma simplificada
        System.out.println("i = " + i);

        i += 5; // i = i + 5;
        System.out.println("i = " + i);

        j -= 4; // j = j - 4;
        System.out.println("j = " + j);

        j *= 2; // j = j * 2;
        System.out.println("j = " + j);

        i /= 2; // i = i / 2;
        System.out.println("i = " + i);

        // Ejemplo como para hacer una consulta en una base de datos sql

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Marco'";
        sqlString += " c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }
}
