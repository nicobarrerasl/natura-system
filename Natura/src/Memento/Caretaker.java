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
import java.util.ArrayList;

public class Caretaker {
   
	// Where all mementos are saved
	
	ArrayList<Memento> savedClientes = new ArrayList<>();

	// Adds memento to the ArrayList
	
	public void addMemento(Memento m) { savedClientes.add(m); }
   
	// Gets the memento requested from the ArrayList
	
	public Memento getMemento(int index) { return savedClientes.get(index); }
} 