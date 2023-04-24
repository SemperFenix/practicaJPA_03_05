package com.pgrsoft.cajondesastre.ejercicios;

public interface Ejercicios {

	// 10 min
	boolean validarDNI(String dni);
	
	/**
	 * https://titlecaseconverter.com/
	 * 
	 * Nuestra vesión es simplificada. Simplemente no pondermos en mayúscula las
	 * siguientes palabras:
	 * 
	 * artículos: a, an, the
	 * conjunciones: and, or, but
	 * 
	 * Ejemplo
	 * 
	 * Entra: "one nation under a groove" -> "One Nation Under a Grooves"
	 * 
	 * 25 min
	 * 
	 */
	String convertToTitleCase(String title);
	
	/**
	 * Por ejemplo...
	 * 
	 * Entra: "Me gusta" -> "atsug eM"
	 * 
	 * 5 min
	 * 
	 */
	String invert(String frase);
	
	/**
	 *
	 * Redistribución automática de caracteres
	 * 
	 * Entra: "Me gusta" -> "eta ugMs"
	 * 
	 * 10 min
	 *
	 */
	String randomize(String frase);
	
	/**
	 * Devuelve true si el texto es plíndromo
	 * 
	 * Entra: "Ana" -> Devuelve true
	 * Entra: "Dábale arroz a la zorra el abad" -> Devuelve true
	 *
	 * 
	 * (CASE INSENSITIVE)
	 * (IGNORA ACENTOS)
	 * (IGNORA ESPACIOS EN BLANCO)
	 * 
	 * 20 min
	 * 
	 */
	boolean esPalindromo(String frase);
	
	
}
