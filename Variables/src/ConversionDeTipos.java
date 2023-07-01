public class ConversionDeTipos {
    public static void main(String[] args) {
        // Estas conversiones se aplican de String para byte,short,long etc.
        String numeroStr = "23";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Convertir tipos de datos String a Double
        String realStr = "98765.43";
        String realNotacion = "98765.43e-3"; //Notación cientifica
        double numeroDouble = Double.parseDouble(realStr);
        double numeroNotacion = Double.parseDouble(realNotacion);
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("numeroNotacion = " + numeroNotacion);

        // Convertir tipos de datos String a Boolean
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Hacer lo mismo de forma inversa de datos primitivos a String

        int otroInt = 100;
        String otroStr = Integer.toString(otroInt);
        System.out.println("otroStr = " + otroStr);
        // Probar esto con otro metodo
        // otroStr = String.valueOf(otroInt); // Si hay String.valueOf(entero+algun número)= Se hace una suma
        // Si hay String.valueOf(string+algun número)= Se hace una concatenación

        // Pasar de double a string
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // Estos metodos mediante String o usando las clases Wrapper se hacen las conversiones de tipos de datos

        // Conversiones entre Tipos primitivos

        // Cast-Casting: Esto significa forzar una conversión de tipos de datos primitivos
        int i = 10000;
        short s = (short)i; // Poner parentesis y dentro el tipo de dato a convertir se llama cast o casting, pero puede haber
        // una perdida informacion
        long l = i;
        // Este long no marca error porque es mayor que int por lo que no puede haber perdida de información
        // IMPORTANTE: Se deben convertir valores que si soportan los tipos de datos con menor capacidad
        /* Estas conversiones aplican mientras se usen tipos numericos como byte,short,int,long, float y double, incluyendo
        a los números reales, incluso sirve con char pero este por leer caracteres unicode transforma esto a signo u otras cosas
        */
    }
}
