/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Utilidad;

/**
 *
 * @author Nicolas
 */
public class Control_vacio {
    
    public boolean retorno (String a){
        
        boolean ret = false; 
        if(a.equals("") || a.trim().isEmpty()){
            ret = true;
        }
        
        return ret;
    }
    
}
