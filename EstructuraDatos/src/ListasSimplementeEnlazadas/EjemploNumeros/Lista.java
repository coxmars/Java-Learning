package ListasSimplementeEnlazadas.EjemploNumeros;

public class Lista {
    protected Nodo inicio, fin; // Pointers to know where the start and end are.

    // Constructor
    public Lista() {
        inicio = null;
        fin = null;
    }

    // Method to know if the List is empty
    public boolean esVacia() {
        if (inicio == null) { // If start points to null, it is true, it is empty
            return true;
        } else {
            return false;
        }
    }

    // Method to add a Node to the beginning of the list
    public void agregarInicio(int elemento) {
        // Creating the node
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    // Method to insert Node at the end of the list
    public void agregarFinal(int elemento) {
        if (!esVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    // Method to show the data
    public void mostrarLista() {
        Nodo aux = inicio;
        System.out.println();
        while (aux != null) {
            System.out.print("[" + aux.dato + "] -----> ");
            aux = aux.siguiente;
        }
    }

    // Method to delete item from the beginning
    public int borrarInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    // Method to delete element from the end
    public int borrarFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo aux = inicio;
            while (aux.siguiente != fin) {
                aux = aux.siguiente;
            }
            fin = aux;
            fin.siguiente = null;
        }
        return elemento;
    }

    // Method to delete a specific node
    public void eliminar (int elemento) {
        if (!esVacia()) {
            if (inicio == fin && elemento==inicio.dato) {
                inicio=fin=null;
            }
            else if (elemento == inicio.dato) {
                inicio = inicio.siguiente;
            }
            else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal!=null && temporal.dato!=elemento) {
                    // Con esto recorremos los demás nodos para buscar el dato
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                // Con esto sabemos que encontró el dato
                if (temporal!=null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }


    // Metodo para buscar un elemento
    public boolean existeEnLista(int elemento) {
        Nodo temporal = inicio;
        while (temporal != null && temporal.dato != elemento) {
            temporal = temporal.siguiente;
        }
        return temporal != null;
    }


}
