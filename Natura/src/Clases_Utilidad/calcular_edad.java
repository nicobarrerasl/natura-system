/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Utilidad;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Nicolas
 */

public class calcular_edad {
    public int calculatePeriod(String nac) 
    { 
        // Start date 
        LocalDate startDate = LocalDate.parse(nac); 
  
        // End date 
        LocalDate endDate = LocalDate.now(); 
        Period period = Period.between(startDate, endDate); 
        return (period.getYears());
    } 
}
