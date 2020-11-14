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
    
    private String codCompra;
    private String compra_fecha;
    private String compra_saldo;
    private ArrayList <Producto> prod;

    public Compra(String codCompra, String compra_fecha, String compra_saldo, ArrayList<Producto> prod) {
        this.codCompra = codCompra;
        this.compra_fecha = compra_fecha;
        this.compra_saldo = compra_saldo;
        this.prod = prod;
    }

    public ArrayList<Producto> getProd() {
        return prod;
    }

    public String getCodCompra() {
        return codCompra;
    }

    public String getCompra_fecha() {
        return compra_fecha;
    }

    public String getCompra_saldo() {
        return compra_saldo;
    }
    
     public void setProd(ArrayList<Producto> prod) {
        this.prod = prod;
    }

    public void setCodCompra(String codCompra) {
        this.codCompra = codCompra;
    }

    public void setCompra_fecha(String compra_fecha) {
        this.compra_fecha = compra_fecha;
    }

    public void setCompra_saldo(String compra_saldo) {
        this.compra_saldo = compra_saldo;
    }
    
}
