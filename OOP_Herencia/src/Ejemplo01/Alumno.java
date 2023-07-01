package Ejemplo01;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematicas;
    private double notaHistoria;
    private double notaCiencias;

    public Alumno () {
        System.out.println("Alumno: Inicializando Constructor....");
    }

    public Alumno(String nombre,String apellido) {
        super(nombre,apellido); // Aqui llamamos al constructor del padre de Alumno que es Persona y le pasamos los datos de Nombre y Apellido
    }

    public Alumno(String nombre,String apellido,int edad) {
        super(nombre,apellido,edad);
    }

    public Alumno(String nombre,String apellido,int edad,String institucion) {
        super(nombre,apellido,edad); // Se puede usar esta forma o this(nombre,apellido,edad);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    // Sobreescritura de metodos en herencia
    @Override
    public String saludar() {
        String saludar = super.saludar(); // Esta es la forma para reutilizar codigo de la clase padre
        return saludar + " soy un alumno y mi nombre es " + this.getNombre();
    }

    public double calcularPromedio() {
        return (notaCiencias + notaMatematicas + notaHistoria)/3;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return  datos + "\ninstitucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaHistoria=" + notaHistoria +
                ", notaCiencias=" + notaCiencias +
                ", promedio=" + this.calcularPromedio();
    }
}
