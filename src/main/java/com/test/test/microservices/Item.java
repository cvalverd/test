package com.test.test.microservices;

public class Item {
    private String nombre;
    private double precio;

    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}