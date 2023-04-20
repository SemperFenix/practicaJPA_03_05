package com.pgrsoft.cajondesastre.numberformatter.services;

public interface NumberFormatter {

	/**
	 * Devuelve el nombre de un número
	 * 
	 * Solo admite números entre [0..999]
	 * 
	 * Si el argumento está fuera de rango lanza una excepción del tipo IllegalArgumentException
	 * 
	 */
	String convert(int numero);
	
}
