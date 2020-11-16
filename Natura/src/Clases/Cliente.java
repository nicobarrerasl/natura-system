package Clases;

import java.util.ArrayList;

public class Cliente {

    private short codCliente;
    private String apellido;
    private String nombre;
    private short edad;
    private String fechaNac = "-";
    private String telefono;
    private float saldo = (float) 0.00; 
    private String direccion;
    private String zonaVivienda;
    private ArrayList <ZonaTrabajo> zt;

    public Cliente(short codCliente, String apellido, String nombre, short edad, String fechaNac, String telefono, String direccion, String zonaVivienda, float saldo) {
        this.codCliente = codCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.zonaVivienda = zonaVivienda;
        this.saldo = saldo;
    }

    public Cliente(String apellido, String nombre, short edad, String fechaNac, String telefono, String direccion, String zonaVivienda) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.zonaVivienda = zonaVivienda;
    }

    public Cliente(String apellido, String nombre, String telefono, String direccion, String zonaVivienda) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.zonaVivienda = zonaVivienda;
    }

    public Cliente(short codCliente) {
        this.codCliente = codCliente;
    }
    
    public short getCodCliente() {
        return codCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getZonaVivienda() {
        return zonaVivienda;
    }

    public ArrayList<ZonaTrabajo> getZt() {
        return zt;
    }

    public void setCodCliente(short codCliente) {
        this.codCliente = codCliente;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setZonaVivienda(String zonaVivienda) {
        this.zonaVivienda = zonaVivienda;
    }

    public void setZt(ArrayList<ZonaTrabajo> zt) {
        this.zt = zt;
    }
    
}
