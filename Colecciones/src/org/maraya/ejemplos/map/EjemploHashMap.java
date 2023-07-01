package org.maraya.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        // No es ordenado
        // Los valores se pueden repetir, para guardar se usa put en vez de add, acepta null en la llave
        // Llave - Valor así funciona el HashMap
        Map<String,Object> persona = new HashMap<>();
        persona.put("nombre","Marco");
        persona.put("apellido","Araya");
        persona.put("email","marcojime23@gmail.com");
        persona.put("edad","20");
        System.out.println("persona = " + persona);

        // Crear HashMap de direcciones, aqui se denota que un HashMap puede guardar cualquier objeto
        // incluso otro HashMap como direccion
        Map<String,String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");
        persona.put("direccion",direccion);



        // Valores especificos 
        Object nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        Object apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        // Metodos HashMap
        /*
        Clear: Borra los valores del HashMap
        ContainsValue/ContainsKey: Busca por llave o valor
        Remove: Elimina un elemento por llave o llave/valor
        Replace: Reemplaza un elemento por llave o llave/valor
        */

        boolean b = persona.remove("nombre","Marco");
        System.out.println("b = " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("nombre");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("marcojime23@gmail.com");
        System.out.println("b2 = " + b2);

        System.out.println("-------- Values --------");

        Collection<Object> valores = persona.values();
        for (Object v: valores) {
            System.out.println("v = " + v);
        }

        System.out.println("-------- Entry Set --------");

        Set<String> llaves = persona.keySet();
        for (String k: llaves) {
            System.out.println("k = " + k);
        }

        System.out.println("-------- Entry Set --------");

        // Inner Class
        for (Map.Entry<String, Object> par: persona.entrySet()) {
            System.out.println(par.getKey() + "=>" + par.getValue());
        }

        System.out.println("-------- Key Set --------");

        for (String llave: persona.keySet()) {
            Object valor = persona.get(llave);
            System.out.println(llave + "=>" + valor);
        }

        System.out.println("-------- Java 8 forEach --------");

        persona.forEach((llave,valor) -> {
            System.out.println(llave + "=>" + valor);
        });

        System.out.println("Total elementos: " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.replace("apellido","Jimenez");
        System.out.println("persona = " + persona);


    }
}
