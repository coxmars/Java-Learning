package org.marco.patrones.factory.producto;

import org.marco.patrones.factory.PizzaProducto;

public class PizzeriaNewYorkItaliana extends PizzaProducto {

    public PizzeriaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa italiana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso parmesano");
        ingredientes.add("Tomate");
        ingredientes.add("Peregil");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 250 min a 150°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
