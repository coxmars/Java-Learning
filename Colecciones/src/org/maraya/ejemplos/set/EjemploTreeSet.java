package org.maraya.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        // Here we define the TreeSet, it is sorted by alphabetically because they are Strings
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a)); // This is like sort descending by alphabetically
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("seis");
        ts.add("siete");
        System.out.println("ts: " + ts);

        // This is ordered from highest to lowest, because they are numbers, with words it is alphabetical
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder()); // With Comparator.reverseOrder we sort descending
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        System.out.println("numbers = " + numbers);

    }
}
