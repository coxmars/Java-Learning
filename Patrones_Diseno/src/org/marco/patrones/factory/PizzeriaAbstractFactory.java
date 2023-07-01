package org.marco.patrones.factory;

abstract public class PizzeriaAbstractFactory {
    public PizzaProducto ordenarPizza (String tipo) {
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("------ Fabricando la pizza " + pizza.getNombre() + "------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}
