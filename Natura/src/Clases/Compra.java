/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Nicolas
 */
public class Compra {
    
    private short codCompra = 0;
    private String compra_fecha;
    private float compra_saldo;
    private Cliente cliente;
    private ArrayList <Producto> prod;

    public Compra(short codCompra, String compra_fecha, float compra_saldo, Cliente cliente, ArrayList<Producto> prod) {
        this.codCompra = codCompra;
        this.compra_fecha = compra_fecha;
        this.compra_saldo = compra_saldo;
        this.cliente = cliente;
        this.prod = prod;
    }

    public Compra(String compra_fecha, float compra_saldo, Cliente cliente, ArrayList<Producto> prod) {
        this.compra_fecha = compra_fecha;
        this.compra_saldo = compra_saldo;
        this.cliente = cliente;
        this.prod = prod;
    }
    
    public short getCodCompra() {
        return codCompra;
    }

    public String getCompra_fecha() {
        return compra_fecha;
    }

    public float getCompra_saldo() {
        return compra_saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProd() {
        return prod;
    }

    public void setCodCompra(short codCompra) {
        this.codCompra = codCompra;
    }

    public void setCompra_fecha(String compra_fecha) {
        this.compra_fecha = compra_fecha;
    }

    public void setCompra_saldo(float compra_saldo) {
        this.compra_saldo = compra_saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProd(ArrayList<Producto> prod) {
        this.prod = prod;
    }
    
}
