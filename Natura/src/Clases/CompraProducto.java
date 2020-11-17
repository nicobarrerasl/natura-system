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
public class CompraProducto {
    private short   codCompra;
    private int     codProducto;
    private short   cantidad;

    public CompraProducto(short codCompra, int codProducto, short cantidad) {
        this.codCompra = codCompra;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
    }

    public short getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(short codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
