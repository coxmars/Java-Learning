package ListasSimplementeEnlazadas.EjemploNumeros;

/*
Una lista enlazada es una colección o secuencia de elementos dispuestos uno detrás de otro. En la que cada elemento
se conecta al siguiente elemento por un enlace o referencia.

Estructura de una Lista Enlazada: El elemento principal es un Nodo, el Nodo se compone de dos campos,
1. La información o Dato, 2. La referencia o siguiente.

Operaciones en Listas Enlazadas: 1. Creación o inicialización, 2. Insertar Elementos, 3. Eliminar Elementos,
4. Buscar Elementos, 5. Recorrer la lista, 6. Comprobar si la Lista está Vacía.

Clasificación de las Listas Enlazadas: 1. Listas Simplemente Enlazadas. 2. Listas Doblemente Enlazadas.
3. Lista Circular Simplemente Enlazada. 4. Lista Circular Doblemente Enlazada.
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int option = 0, elemento;
        Lista lista = new Lista();
        do {
            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingresar datos al inicio de la lista\n"
                                .concat("2. Insertar datos al final de la lista\n")
                                .concat("3. Mostrar la lista\n")
                                .concat("4. Eliminar elemento del inicio de la lista\n")
                                .concat("5. Eliminar elemento del final de la lista\n")
                                .concat("6. Eliminar elemento en especifico\n")
                                .concat("7. Buscar un elemento en la lista\n")
                                .concat("8. Salir\n")
                                + "¿Que deseas hacer?", "Menú de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (option) {
                    case 1:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento al inicio la lista","Insertando Elemento al Inicio", JOptionPane.INFORMATION_MESSAGE));
                            lista.agregarInicio(elemento);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el elemento al final de la lista","Insertando Elemento al Final", JOptionPane.INFORMATION_MESSAGE));
                            lista.agregarFinal(elemento);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
                        }
                        break;
                    case 3:
                        if (lista.esVacia()) {
                            JOptionPane.showMessageDialog(null, "No hay elementos que mostrar en la lista","Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            lista.mostrarLista();
                        }
                        break;
                    case 4:
                        elemento = lista.borrarInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+elemento, "Eliminando Elemento del Inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        elemento = lista.borrarFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: "+elemento, "Eliminando Elemento del Final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento en especifico que quiere eliminar: ","Eliminar Nodo Especifico", JOptionPane.INFORMATION_MESSAGE));
                            if (lista.existeEnLista(elemento)) {
                                lista.eliminar(elemento);
                                JOptionPane.showMessageDialog(null, "El elemento eliminado es "+elemento, "Eliminando Nodo Especifico", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "El elemento no existe en la lista", "No Existe Elemento", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
                        }
                        break;
                    case 7:
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el elemento a buscar: ","Buscando Elemento", JOptionPane.INFORMATION_MESSAGE));
                            if (lista.existeEnLista(elemento)) {
                                JOptionPane.showMessageDialog(null, "El elemento "+elemento+" si existe en la lista", "Nodo Encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "El elemento "+elemento+" no existe en la lista", "Nodo No Encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default: JOptionPane.showMessageDialog(null, "Error, debe escoger una de las opciones", "Intente de nuevo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        } while (option != 8);
    }
}
