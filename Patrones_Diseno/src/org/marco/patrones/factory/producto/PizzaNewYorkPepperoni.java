package org.marco.patrones.factory.producto;

import org.marco.patrones.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra Pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 1 hora a 126°");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
