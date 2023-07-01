public class Persona {
    private String nombre;

    public void modificarNombre (String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre () {
        return this.nombre;
    }
}
