package EjemploAutomovil;

public class MainStaticEnum {
    public static void main(String[] args) {

        Automovil porsche = new Automovil ("Porsche","GTR3",Color.AMARILLO,5.0);
        porsche.setTipo(TipoAutomovil.CONVERTIBLE);

        // If we want to add another car is in this way:
        Automovil mazda = new Automovil ("Mazda","BT-50",Color.NARANJA); // Here we pass the parameters to constructor
        mazda.setTipo(TipoAutomovil.HATCHBACK);

        TipoAutomovil tipo = porsche.getTipo();
        System.out.println("Tipo Subaru: "+tipo.getNombre());
        System.out.println("Tipo desc. Subaru: "+tipo.getDescripcion());

        // Desde Java JDK 13-14 se mejoró el switch de la siguiente forma: Sin puntos y sin break, este ultimo es automatico
        switch (tipo) {
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case HATCHBACK ->
                System.out.println("Es un automovil medio compacto, aspecto deportivo");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                System.out.println("Es un automovil utilitario de transporte, de empresas");
            case PICKUP ->
                System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Es un automovil mediano");
            case STATION_WAGON ->
                System.out.println("Es un automovil más grande, con maletero espacioso");
        }

        // Iterando Enum con for each, values retorna un array del enum con las constantes
        TipoAutomovil [] tipos = TipoAutomovil.values();

        for (TipoAutomovil ta: tipos) {
            System.out.print(ta+"\n"); // Aqui se imprime segun la estructura del metodo toString de TipoAutomovil
        }


    }
}
