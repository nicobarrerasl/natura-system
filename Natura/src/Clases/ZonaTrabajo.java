/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Franco
 */
public class ZonaTrabajo {
    
    private String direccion = "-";
    private String zona = "-";
    private String ocupacion = "-";

    public ZonaTrabajo(String direccion, String zona, String ocupacion) {
        this.direccion = direccion;
        this.zona = zona;
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getZona() {
        return zona;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    
    
}
