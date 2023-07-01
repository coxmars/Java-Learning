package org.maraya.ejemplos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {

        // Por defecto va a ordenar las llaves no los valores, no pueden existir elementos nulos
        // Ahora para ordenar de forma inversa al orden por defecto (ascendente) a descendente
        // Si no queremos esta forma se puede usar: Comparator.reverseOrder()
        // Si queremos ordenar por el tamaño de la llave de más corto a largo se usa: Comparator.comparing(String::length)
        // y si se quisiera de más largo a corto se le agrega.reversed()

        Map<String,Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        persona.put("nombre","Marco");
        persona.put("apellido","Araya");
        persona.put("email","marcojime23@gmail.com");
        persona.put("edad","20");

        // Crear HashMap de direcciones
        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");
        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);

    }
}
