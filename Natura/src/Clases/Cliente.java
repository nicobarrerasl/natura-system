/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.math.BigDecimal;

/**
 *
 * @author Nicolas
 */
public class Cliente {

    private short   codCliente;
    private String  cliente_apellido;
    private String  cliente_nombre;
    private short   cliente_edad;
    private String  cliente_Fnac;
    private String  cliente_tel;
    private String  cliente_DV;
    private String  cliente_ZV;
    private String  cliente_DT;
    private String  cliente_ZT;
    private String  cliente_ocup;
    private BigDecimal cliente_saldo;
    
    public Cliente(short codCliente, String cliente_apellido, String cliente_nombre, short cliente_edad, String cliente_Fnac, String cliente_tel, String cliente_DV, String cliente_ZV, String cliente_DT, String cliente_ZT, String cliente_ocup, BigDecimal cliente_saldo) {
        this.codCliente = codCliente;
        this.cliente_apellido = cliente_apellido;
        this.cliente_nombre = cliente_nombre;
        this.cliente_edad = cliente_edad;
        this.cliente_Fnac = cliente_Fnac;
        this.cliente_tel = cliente_tel;
        this.cliente_DV = cliente_DV;
        this.cliente_ZV = cliente_ZV;
        this.cliente_DT = cliente_DT;
        this.cliente_ZT = cliente_ZT;
        this.cliente_ocup = cliente_ocup;
        this.cliente_saldo = cliente_saldo;
    }

    public BigDecimal getCliente_saldo() {
        return cliente_saldo;
    }

    public void setCliente_saldo(BigDecimal cliente_saldo) {
        this.cliente_saldo = cliente_saldo;
    }

    public short getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(short codCliente) {
        this.codCliente = codCliente;
    }

    public String getCliente_apellido() {
        return cliente_apellido;
    }

    public void setCliente_apellido(String cliente_apellido) {
        this.cliente_apellido = cliente_apellido;
    }

    public String getCliente_nombre() {
        return cliente_nombre;
    }

    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    public short getCliente_edad() {
        return cliente_edad;
    }

    public void setCliente_edad(short cliente_edad) {
        this.cliente_edad = cliente_edad;
    }

    public String getCliente_Fnac() {
        return cliente_Fnac;
    }

    public void setCliente_Fnac(String cliente_Fnac) {
        this.cliente_Fnac = cliente_Fnac;
    }

    public String getCliente_tel() {
        return cliente_tel;
    }

    public void setCliente_tel(String cliente_tel) {
        this.cliente_tel = cliente_tel;
    }

    public String getCliente_DV() {
        return cliente_DV;
    }

    public void setCliente_DV(String cliente_DV) {
        this.cliente_DV = cliente_DV;
    }

    public String getCliente_ZV() {
        return cliente_ZV;
    }

    public void setCliente_ZV(String cliente_ZV) {
        this.cliente_ZV = cliente_ZV;
    }

    public String getCliente_DT() {
        return cliente_DT;
    }

    public void setCliente_DT(String cliente_DT) {
        this.cliente_DT = cliente_DT;
    }

    public String getCliente_ZT() {
        return cliente_ZT;
    }

    public void setCliente_ZT(String cliente_ZT) {
        this.cliente_ZT = cliente_ZT;
    }

    public String getCliente_ocup() {
        return cliente_ocup;
    }

    public void setCliente_ocup(String cliente_ocup) {
        this.cliente_ocup = cliente_ocup;
    }
    

    
}
