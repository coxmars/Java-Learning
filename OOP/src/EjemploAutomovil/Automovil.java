package EjemploAutomovil;

public class Automovil { // The modifier is not mandatory, to establish classes just put: class NameClass
        // The NameClass should be named like the file, that's a good practice and we avoid mistakes
        // If the private modifier is used in a Class that's will not be useful in any parts of the program
        // Just could be public or default to be used, the only could be private are attributes and methods

    // The order of a program is: class,attributes,constructors,getters and setters, operation methods and then overwrite methods

    // We put the normal attributes
    private String manufacturer, model; // Here whatever auto created will have a yellow color
    private Color color = Color.AMARILLO;
    private double engine;
    private int pondCapacity = 40; // We put 40 liters of pond

    // This attribute is used as an increment similar of the database
    private int id;
    private static int ultimoId;
    private TipoAutomovil tipo;

    // An final attribute can be public (is the most common), private but 99% is static, because there is not sense if we use a constant of the object, should be for the class
    // In hibernate or Spring the use of constants, for configurations,parameters like a environment variable, the name is made by upper case letters,
    // if the constant were private the value can be get from other site, just from this class
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120; // This value can be changed from other side, it's a constant or final just can be read
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;
    public static final String COLOR_ROJO = "Red";
    public static final String COLOR_AMARILLO = "Yellow";
    public static final String COLOR_AZUL = "Blue";



    // Static attributes and static methods, it does not belong to the instance, it is not of the object, it is of the class so it is shared by any object of that class
    private static String defaultColor = "celeste"; // This is a static attribute, this is the value for all cars in this class because is static, is shared for all
    // The modifier is default, but if is private we have to use a setter method, but the getters and setters of static attributes have
    // to be static too, in static methods we can only work with static attributes, the normal ones create a problem, just static attributes

    // Here we put a constructor method, in the most of the cases is public, sometimes default but rarely private
    // The constructor has the class name and does not have a data type to return, in many cases has parameters, and if we use the constructor for this
    // we can replace the set methods because we initialize data with constructor, and if we use set methods is better not use a constructor method

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String manufacturer, String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // Here we can create or add more constructor methods, it is called method overload, and are different for the data type and quantity of parameters

    public Automovil(String manufacturer, String model, Color color) {
        this(manufacturer,model); // We refer to the constructor that has this data, thus we optimize the constructor and the code
        // To use this efficient way, we have to put all parameters of a constructor, does not work with specific parameters of a constructor
        this.color = color;
    }

    public Automovil(String manufacturer, String model, Color color, double engine) {
        this(manufacturer,model,color); // We refer to the constructor that has this data, thus we optimize the constructor and the code
        this.engine = engine;
    }

    // When we use private as a modifier we do not have access from other classes, but it's so fundamental for security so always use it
    // To have access we need to use methods or put getters

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    } // When we have a constructor method is not necessary to use set methods

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getPondCapacity() {
        return pondCapacity;
    }

    public void setPondCapacity(int pondCapacity) {
        this.pondCapacity = pondCapacity;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public static String getDefaultColor () {
        return defaultColor;
    }

    public static void setDefaultColor (String defaultColor) {
        Automovil.defaultColor = defaultColor;
    }

    // Here we put the methods, instead of putting void we could use int,string o the data type to return
    // The this word refers to itself inside the class, that is, inside the class
    // I make reference to its instance to the same object, we could skip the this word if we do not have other variables
    // with the same name, but it's better to use this to avoid possible mistakes
    // If we have a variable in a method and a class attribute with the same name and we want to call the attribute
    // in a method, this word helps to differentiate them and get the attribute instead the variable, if we want the
    // variable only skip the this word. This method shows all details about all saved cars
    // In classes print information is not a good practice in many cases so it's better to use alternatives like this
    // If we want to print in methods, this a great example of doing that in a more efficient way

    public String details () {
        StringBuilder sb = new StringBuilder(); // We concat all these data and return it as a String
        // The use of StringBuilder is better with more data or values, in this case is better use a normal string
        // as the used below
        sb.append("\nauto.id = " + this.id);
        sb.append("\nauto.manufacturer = " + this.getManufacturer());
        sb.append("\nauto.model = " + this.getModel());
        sb.append("\nauto.tipo = " + this.getTipo());
        sb.append("\nauto.color = " + this.color);
        // Aqui usamos getColor para usar el metodo get de Color, pero si usamos un toString en el Enum de color solo llamamos this.color
        sb.append("\nauto.engine = " + this.getEngine());
        sb.append("\nauto.defaultColor = " + Automovil.defaultColor); // We can not use 'this' because is the class not the object, we put class staticAttribute
        // Moreover, we can put just the defaultColor or staticAttribute
        return sb.toString();  // The return word is crucial if we are going to return a value
    }

    // Here we can do the same like the first details method but more easy with + and we replace variables for return

    /*
    public String details2 () {
        return "\nauto.manufacturer = " + this.manufacturer +
                "\nauto.model = " + this.model +
                "\nauto.color = " + this.color +
                "\nauto.engine = " + this.engine;
    }
    */


    // Here we use parameters, we pass a int variable from other site that will be used in the method
    public String accelerate (int rpm) {
        return "\nEl auto " + this.manufacturer + " acelerando a " + rpm + " rpm"; // Here we reduce code lines
    }

    public String brake () {
        return this.manufacturer + " " + model + " frenando!!";
    }

    // Here we combine the method in only one, two variables will have each method depending about brake or accelerate
    public String accelerateAndBrake (int rpm) {
        String accelerate = this.accelerate(rpm); // Here we have to bring the parameter
        String brake = this.brake();
        return accelerate + "\n" + brake;
    }

    // This method will receive two parameters to do all processes inside it
    public float calculateConsumption (int km, float BenzinePercentage) {
        return km/(pondCapacity*BenzinePercentage);
    }

    public float calculateConsumption (int km, int BenzinePercentage) {
        return km/(pondCapacity*(BenzinePercentage/100f));
    }

    // This is a flag that tells the compiler at runtime that we are overriding a method of the parent class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) { // If the object is different to the Automovil instance we return false, because all comparisons have to be
            // between the same object, if we use different objects we will have a mistake
            return false;
        }
        // we convert this object to the car type because we are always going to compare an object of the same type, they are compatible types
        Automovil auto = (Automovil)obj;
        return (this.manufacturer != null && this.model != null && this.manufacturer.equals(auto.getManufacturer()) && this.model.equals(auto.getModel()));
    } // Here we change the parent class to use .equals() to compare for value instead of reference for manufacturer and model
    // In this case we compare manufacturer and model, these are string types so this is important too if we want to compare we need compatible types
    // If manufacturer or model is null we will get a NullPointerException so we have to validate that case

    @Override
    public String toString() {
        return "Automovil{" +
                "id ='" + id + '\'' +
                "manufacturer ='" + manufacturer + '\'' +
                ", model ='" + model + '\'' +
                ", color ='" + color + '\'' +
                ", engine =" + engine +
                ", pondCapacity =" + pondCapacity +
                '}';
    }
}
