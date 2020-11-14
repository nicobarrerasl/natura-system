/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Nicolas
 */

public class Producto {
    
    private String codProducto;
    private String categoria;
    private String linea;
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto(String codProducto, String categoria, String linea, String nombre, int precio, int cantidad) {
        this.codProducto = codProducto;
        this.categoria = categoria;
        this.linea = linea;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getLinea() {
        return linea;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
