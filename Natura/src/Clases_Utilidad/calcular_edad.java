/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Utilidad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Nicolas
 */

public class calcular_edad {
    /**
     * Edad en anios a partir de una fecha "YYYY-MM-DD".
     * Devuelve null si la fecha falta o esta mal cargada, para que un solo
     * cliente con datos raros no rompa la tabla entera.
     */
    public Integer calculatePeriod(String nac)
    {
        if (nac == null) {
            return null;
        }
        try {
            LocalDate startDate = LocalDate.parse(nac.trim());
            LocalDate endDate = LocalDate.now();
            Period period = Period.between(startDate, endDate);
            return (period.getYears());
        } catch (DateTimeParseException ex) {
            return null;
        }
    }
}
