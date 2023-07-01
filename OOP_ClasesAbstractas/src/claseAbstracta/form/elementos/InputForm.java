package claseAbstracta.form.elementos;

public class InputForm extends ElementoForm{
    // Atributos
    private String tipo = "text";

    // Constructores
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    // Metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type = \" " + this.tipo
                + " \" name = \" " +  this.nombre
                + "  \" value = \" " + this.valor + " \">";
    }
}
