package Ejemplo01;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor() {
        System.out.println("Profesor: Inicializando Constructor...");
    }

    public Profesor(String nombre,String apellido) {
        super(nombre,apellido);
    }

    public Profesor(String nombre,String apellido,String asignatura) {
        super(nombre,apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    // Sobreescritura de metodos en herencia
    @Override
    public String saludar() {
        return "Buenos días soy el profesor de " + this.getAsignatura() + ",mi nombre es " + this.getNombre();
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return  datos + "\nasignatura='" + asignatura + '\'';
    }
}
