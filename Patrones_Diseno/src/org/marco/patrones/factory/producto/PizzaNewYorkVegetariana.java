package org.marco.patrones.factory.producto;

import org.marco.patrones.factory.PizzaProducto;

import java.sql.SQLOutput;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Peregil");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
