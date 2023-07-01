package org.maraya.app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    // Define the attributes
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente; // Here we define the relation with customer class, the association
    private DetalleFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new DetalleFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date(); // When factura object is created it will have the recent date
    }

    // Establish getters and setters
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleFactura[] getItems() {
        return items;
    }

    public void addItemFactura (DetalleFactura item) {
        // Here we avoid an exception of index
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (DetalleFactura item: this.items) {
            if (item == null) { // Here we validate that all products are not null or empty
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion);
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("\n")
        .append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\tPrecio\tCantidad\tTotal\n");



        for (DetalleFactura item: this.items) {
            if (item == null) {
                continue;
            }
            sb.append(item) // We only put item because we have all toString methods in every class
                    .append("\n");
        }

        // Here we add the big total for all paid products
        sb.append("\nGran Total: ")
                .append(calcularTotal())
                .append(" colones");

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
