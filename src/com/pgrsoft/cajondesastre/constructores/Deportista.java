package com.pgrsoft.cajondesastre.constructores;

public class Deportista extends Persona{

	public Deportista() {
		
		super();
		
		System.out.println("Deportista en fase de construcción...");
	}
	
	public void calentar() {
		System.out.println("Deportista calentando de forma genérica...");
	}
	
}
