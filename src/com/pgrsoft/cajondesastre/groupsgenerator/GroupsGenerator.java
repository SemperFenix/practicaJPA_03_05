package com.pgrsoft.cajondesastre.groupsgenerator;

import java.util.List;

public interface GroupsGenerator {

	/**
	 * 
	 * Genera grupos aleatoriamente.
	 * 
	 * Recibe
	 * ======
	 * 
	 * groupSize: Tamaño de los grupos
	 * members: Miembros
	 * 
	 * Devuelve
	 * ========
	 * 
	 * Lista de arrays de miembros
	 * 
	 * Ejemplo:
	 * 
	 * generate(3, "a", "b", "c", "d", "e", "f", "g") devuelve:
	 * 
	 * 0 -> ["c" , "a", "d", "f"]
	 * 1 -> ["b" , "e", "g"]
	 * 
	 * Observaciones
	 * =============
	 * 
	 * Los miembros "sobrantes" que no pueden constituir un grupo se reparten en 
	 * grupos ya existente.
	 * 
	 * Excepciones
	 * ===========
	 * 
	 * - Si groupSize es mayor que el número de miembros se lanza una excepción
	 *   del tipo IllegalArgumentException con el mensaje "El número de miembros [x] es inferior al tamaño del grupo [y]"
	 *   
	 *   Ejemplo:
	 *   
	 *   generate(3, "a", "b") -> Lanza IllegalArgumentException con el mensaje
	 *   
	 *   "El número de miembros [2] es inferior al tamaño de grupo [3]"
	 *   
	 * 
	 */
	List<String[]> generate(int groupSize, String... members);
	
}
