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
public class Pago {
    
    private Long    codPago;
    private String  pago_fecha;
    private float   pago_saldo;
    private Cliente cliente;

    public Pago(long codPago, String pago_fecha, float pago_saldo, Cliente cliente) {
        this.codPago = codPago;
        this.pago_fecha = pago_fecha;
        this.pago_saldo = pago_saldo;
        this.cliente = cliente;
    }
    public Pago(String pago_fecha, float pago_saldo, Cliente cliente) {
        this.pago_fecha = pago_fecha;
        this.pago_saldo = pago_saldo;
        this.cliente = cliente;
    }

    public Long getCodPago() {
        return codPago;
    }

    public String getPago_fecha() {
        return pago_fecha;
    }

    public float getPago_saldo() {
        return pago_saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCodPago(Long codPago) {
        this.codPago = codPago;
    }

    public void setPago_fecha(String pago_fecha) {
        this.pago_fecha = pago_fecha;
    }

    public void setPago_saldo(float pago_saldo) {
        this.pago_saldo = pago_saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
