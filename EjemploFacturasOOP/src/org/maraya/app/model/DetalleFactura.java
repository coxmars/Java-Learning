package org.maraya.app.model;

public class DetalleFactura {
    // Define the attributes
    private int cantidad;
    private Producto producto;

    public DetalleFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    // Establish getters and setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularImporte() {
        return (this.cantidad * this.producto.getPrecio());
    }

    @Override
    public String toString() {
        return producto +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}
