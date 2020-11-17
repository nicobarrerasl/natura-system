/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Utilidad;

import java.util.ArrayList;


public class ControlCodProducto {
    
    public static int controlCantidad(int i, ArrayList prod){ //Retorna la cantidad de productos que se encuentra en la Lista
        
        int cant = 1;
        int codigo;
        
        for (int x=0 ; x<prod.size() ; x++){
            
            codigo = (int) prod.get(x);
            if (i == codigo) cant++;
            
        }
        
        return cant;
    }
    
    public static int seEncontro(int i, ArrayList prod){
    
        int codigo;
        int y = 0;
        for (int x=0 ; x<prod.size() ; x++){
            
            codigo = (int) prod.get(x);
            if (i == codigo) y = 1;
            
        }
    
        return y;
    }
}
