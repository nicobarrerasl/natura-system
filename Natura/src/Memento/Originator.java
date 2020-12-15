/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Arrays;

/**
 *
 * @author Nicolas
 */
public class Originator {
    private String[] campos;

	// Sets the value for the fields in Cliente
	
	public void set(String[] data) { 
		System.out.println("From Originator: Current Version of Cliente\n"+Arrays.toString(data)+ "\n");
	    this.campos = data; 
	}

	// Creates a new Memento with a new Cliente values
	
	public Memento storeInMemento() { 
	    System.out.println("From Originator: Saving to Memento");
	    return new Memento(campos); 
	}
	   
	// Gets the Cliente currently stored in memento
	
	public String[] restoreFromMemento(Memento memento) {
		   
		campos = memento.getSavedArticle(); 
	       
		System.out.println("From Originator: Previous Cliente Saved in Memento\n"+Arrays.toString(campos) + "\n");
		
		return campos;
	   
	}
	
}
