package Clases_Utilidad;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Fecha {

    /**
     * Arma una fecha "YYYY-MM-DD" a partir de los campos dia, mes y anio que escribe el usuario.
     * Devuelve null si los campos no forman una fecha real (ej: 31/02, mes 13, letras, vacio).
     */
    public static String armar(String dia, String mes, String anio) {
        try {
            LocalDate fecha = LocalDate.of(Integer.parseInt(anio.trim()),
                                           Integer.parseInt(mes.trim()),
                                           Integer.parseInt(dia.trim()));
            return fecha.toString(); // siempre con ceros: 1990-03-05
        } catch (NumberFormatException | DateTimeException | NullPointerException ex) {
            return null;
        }
    }
}
