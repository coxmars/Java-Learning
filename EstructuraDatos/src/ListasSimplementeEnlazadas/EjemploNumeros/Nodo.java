package ListasSimplementeEnlazadas.EjemploNumeros;

public class Nodo {
    public int dato;
    public Nodo siguiente; // This is our Link Pointer

    // Constructor to insert at the end
    public Nodo (int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // This constructor helps us to insert at the beginning of our list
    public Nodo (int dato, Nodo inicio) {
        this.dato = dato;
        this.siguiente = inicio;
    }
}
