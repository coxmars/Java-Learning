package org.marco.java8.lambda;

import org.marco.java8.lambda.model.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        // Predicate siempre retorna un boolean, recibe cualquier tipo dato tambien
        Predicate<Integer> test = num -> num > 23;
        boolean result = test.test(10);
        System.out.println("result = " + result);

        Predicate<String> test2 = role -> role.equals("ROLE_ADMIN");
        boolean result2 = test2.test("ROLE_USER");
        System.out.println("result2 = " + result2);

        // Recibe 2 argumentos y devuelve un boolean
        BiPredicate<String,String> test3 = String::equals;// (a,b) -> a.equals(b);
        boolean result3 = test3.test("Marco","Marco");
        System.out.println("result3 = " + result3);

        BiPredicate<Integer, Integer> test4 = (i,j) -> i>j;
        boolean result4 = test4.test(23,20);
        System.out.println("result4 = " + result4);

        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        user1.setNombre("Marco");
        user2.setNombre("Marco");

        BiPredicate<Usuario,Usuario> test5 = (u1,u2) -> u1.getNombre().equals(u2.getNombre()); // (u1,u2) -> u1.equals(u2);
        boolean result5 = test5.test(user1,user2);
        System.out.println("¿Los usuarios son iguales? = " + result5);

    }
}
