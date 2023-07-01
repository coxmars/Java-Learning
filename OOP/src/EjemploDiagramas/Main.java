package EjemploDiagramas;


public class Main {
    public static void main(String[] args) {
        Motor motorPorsche = new Motor(2.0,TipoMotor.BENCINA);
        Automovil porsche = new Automovil("Porsche","GTR3",motorPorsche);
        System.out.println("\nDatos inicializados del GTR3");
        System.out.println(porsche.details());

        Motor motorMazda = new Motor(5.0,TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda","BT-50",motorMazda);
        System.out.println("\nDatos inicializados del BT-50");
        System.out.println(mazda.details());

        Motor motorMercedez = new Motor(3.0,TipoMotor.DIESEL);
        Automovil mercedez = new Automovil("Mercedez","G-50",motorMercedez);
        System.out.println("\nDatos inicializados del Mercedez");
        System.out.println(mercedez.details());

    }
}
