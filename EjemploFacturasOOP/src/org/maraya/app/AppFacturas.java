package org.maraya.app;

import org.maraya.app.model.*;

import javax.swing.*;
import java.util.Scanner;

public class AppFacturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Here we define variables
        String descripcion;
        String nombre;
        String colorAux;
        double precio;
        int cantidad;
        int auxCantidad;
        // Here we create the customer
        Cliente cliente = new Cliente();
        cliente.setNombre("Marco Araya");
        cliente.setNif("5555-5");
        // Here we ask for the data/information
        descripcion = JOptionPane.showInputDialog(null,"Ingrese la descripción de la factura: ","Descripción factura",JOptionPane.INFORMATION_MESSAGE);
        Factura factura = new Factura(descripcion, cliente);
        Producto producto;
        auxCantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea comprar: ","Cantidad productos",JOptionPane.INFORMATION_MESSAGE));


        for (int i=0; i < auxCantidad; i++) {
            producto = new Producto();
            nombre = JOptionPane.showInputDialog(null,"Ingrese el producto n° " + producto.getCodigo() + ": ","Nombre producto",JOptionPane.INFORMATION_MESSAGE);
            // We use next just for one work like computer, if there are spaces we use nextLine
            producto.setNombre(nombre);
            precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el precio del producto: ","Precio producto",JOptionPane.INFORMATION_MESSAGE));
            producto.setPrecio(precio);
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad que desea: ","Cantidad productos",JOptionPane.INFORMATION_MESSAGE));
            DetalleFactura item = new DetalleFactura(cantidad, producto);
            factura.addItemFactura(item);
        }
        JOptionPane.showMessageDialog(null,factura,"Detalle Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}
