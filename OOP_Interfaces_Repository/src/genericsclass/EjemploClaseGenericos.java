package genericsclass;

public class EjemploClaseGenericos {
    public static void main(String[] args) {

        // La idea es migrar esto a tipos genericos porque en el cast podria haber un
        // error por equivocacion al poner mal el tipo dato

        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal ("Peregrino","Caballo"));
        transporteCaballos.add(new Animal ("Grillo","Caballo"));
        transporteCaballos.add(new Animal ("Tunquen","Caballo"));
        transporteCaballos.add(new Animal ("Topocalma","Caballo"));
        transporteCaballos.add(new Animal ("Longotoma","Caballo"));

        System.out.println("----- Transporte Caballos -----");
        for (Object object: transporteCaballos) {
            Animal animal = (Animal) object;
            System.out.println(animal.getNombre() + "tipo = " + animal.getTipo());
        }

        Camion transporteMaquina = new Camion(3);
        transporteMaquina.add(new Maquinaria ("Bulldozer"));
        transporteMaquina.add(new Maquinaria ("Grúa Horquilla"));
        transporteMaquina.add(new Maquinaria ("Perforadora"));

        System.out.println("----- Transporte Maquinaria -----");
        for (Object object: transporteMaquina) {
            Maquinaria maquinaria = (Maquinaria) object;
            System.out.println(maquinaria.getTipo());
        }

        Camion transporteAutomovil = new Camion(3);
        transporteAutomovil.add(new Automovil ("Toyota"));
        transporteAutomovil.add(new Automovil ("Chevrolet"));
        transporteAutomovil.add(new Automovil ("Bugatti"));

        System.out.println("----- Transporte Automovil -----");
        for (Object object: transporteAutomovil) {
            Automovil automovil = (Automovil) object;
            System.out.println(automovil.getMarca());
        }

    }
}
