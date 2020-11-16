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
    
    private int codProducto;
    private String categoria;
    private String linea;
    private String nombre;
    private float precio;
    private short cantidad;

    public Producto(int codProducto, String categoria, String linea, String nombre, float precio, short cantidad) {
        this.codProducto = codProducto;
        this.categoria = categoria;
        this.linea = linea;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public int getCodProducto() {
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

    public float getPrecio() {
        return precio;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCodProducto(int codProducto) {
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

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
    
}
