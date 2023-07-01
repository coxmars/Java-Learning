package org.marco.annotations;

import org.marco.annotations.models.Product;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setNombre("Mesa redonda");
        product.setPrecio(1000L);
        product.setFecha(LocalDate.now());
    }
}
