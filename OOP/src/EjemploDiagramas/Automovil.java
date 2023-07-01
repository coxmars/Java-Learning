package EjemploDiagramas;

import EjemploAutomovil.Color;
import EjemploAutomovil.TipoAutomovil;

public class Automovil {

    private String manufacturer, model;
    private Color color = Color.AMARILLO;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    private int id;
    private static int ultimoId;
    private TipoAutomovil tipo;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;
    public static final String COLOR_ROJO = "Red";
    public static final String COLOR_AMARILLO = "Yellow";
    public static final String COLOR_AZUL = "Blue";

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String manufacturer, String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Automovil(String manufacturer, String model, Motor motor) {
        this(manufacturer,model);
        this.motor = motor;
    }

    public Automovil(String manufacturer, String model, Motor motor, Estanque estanque) {
        this(manufacturer,model,motor);
        this.estanque = estanque;
    }

    public Automovil(String manufacturer, String model, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(manufacturer,model,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String details () {
        StringBuilder sb = new StringBuilder(); // We concat all these data and return it as a String
        sb.append("\nauto.id = " + this.id);
        sb.append("\nauto.manufacturer = " + this.getManufacturer());
        sb.append("\nauto.model = " + this.getModel());
        sb.append("\nauto.tipo = " + this.getTipo());
        sb.append("\nauto.engine = " + this.motor.getCilindrada());
        return sb.toString();  // The return word is crucial if we are going to return a value
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id ='" + id + '\'' +
                "manufacturer ='" + manufacturer + '\'' +
                ", model ='" + model + '\'' +
                ", engine =" + motor +
                ", pond =" + estanque +
                '}';
    }
}
