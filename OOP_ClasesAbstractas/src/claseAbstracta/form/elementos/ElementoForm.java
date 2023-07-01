package claseAbstracta.form.elementos;

/*
- Clase Abstracta: Es cuando tenemos una jerarquía de clases en que algun comportamiento está presente en todas ellas
pero se materializa de formas distintas en cada una.
- El modificador abstract declara que la clase es una clase abstracta
- Una clase abstracta podría contener metodos abstractos, es decir, metodos sin implementación.
- Una clase abstracta está diseñada para ser una super clase y no puede ejemplarizarse (ser instanceada con el new).
- Cuando se hereda de una clase padre abstracta estamos obligados a poner los mismos metodos.
- Si un metodo es abstracto en una clase, esta clase obligatoriamente debe ser abstracta tambien, pero una clase abstracta
podría no tener metodos abstractos.
*/

abstract public class ElementoForm {
    // Atributos protected
    protected String valor;
    protected String nombre;

    // Constructores
    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Metodos
    abstract public String dibujarHtml();
    // Un metodo abstracto no tiene un cuerpo, no lleva corchetes/llaves, la implementación la tienen las clases hijas
}
