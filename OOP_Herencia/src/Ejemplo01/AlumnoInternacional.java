package Ejemplo01;

// Este es un ejemplo de herencia por especialización
public class AlumnoInternacional extends Alumno {
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional () {
        System.out.println("Alumno Internacional: Inicializando Constructor....");
    }

    public AlumnoInternacional (String nombre,String apellido) {
        super(nombre,apellido);
    }

    public AlumnoInternacional (String nombre,String apellido,String pais) {
        super(nombre,apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    // Sobreescritura de metodos en herencia
    @Override
    public String saludar() {
        String saludar = super.saludar(); // Aqui utilizamos el super pero de alumno
        return saludar + " soy extranjero del país " + this.getPais();
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3) + notaIdiomas)/4;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return  datos + "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
