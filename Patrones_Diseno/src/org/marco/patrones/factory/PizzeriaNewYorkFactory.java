package org.marco.patrones.factory;

import org.marco.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.marco.patrones.factory.producto.PizzaNewYorkVegetariana;
import org.marco.patrones.factory.producto.PizzeriaNewYorkItaliana;

public class PizzeriaNewYorkFactory extends PizzeriaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;

        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzeriaNewYorkItaliana();
                break;
        }

        return producto;
    }
}
