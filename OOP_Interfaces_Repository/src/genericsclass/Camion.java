package genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {
    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    // Metodo agregar, se valida si no se pasa el max elementos y si es el caso se arroja excepcion
    public void add (Object object) {
        if (this.objetos.size() <= max) {
            this.objetos.add(object);
        }
        else {
            throw new RuntimeException("No hay más espacio");
        }
    }

    // List implementa iterator entonces lo podemos usar así más facil
    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
