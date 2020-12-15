/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author Nicolas
 */
public class Memento {
     // Los campos guardados en el objeto Memento

    private final String[] Campos;

    // Guardar los campos en el objeto memento

    public Memento(String[] data) { Campos = data; }

    // Retornar el valor guardado en el memento

    public String[] getSavedArticle() { return Campos; }

}
