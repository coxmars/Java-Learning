package org.marco.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {

        // Se muestra que solo se crea una instancia, es la misma y se utiliza para toda la app
        // Este es un patron creacional y se denomina Singleton

        for (int i=0; i<10; i++) {
            ConexionBDSingleton conexion = ConexionBDSingleton.getInstance();
            System.out.println("conexion = " + conexion);
        }
    }
}
