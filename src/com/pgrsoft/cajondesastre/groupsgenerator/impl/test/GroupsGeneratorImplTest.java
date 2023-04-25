package com.pgrsoft.cajondesastre.groupsgenerator.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.groupsgenerator.GroupsGenerator;
import com.pgrsoft.cajondesastre.groupsgenerator.impl.GroupsGeneratorImpl;

class GroupsGeneratorImplTest {

	private GroupsGenerator groupsGenerator = new GroupsGeneratorImpl();
	
	@Test
	void forma_grupos_correctamente_cuando_NO_hay_miembros_sobrantes() {
		
		// Arrange
		
		List<String> miembrosEsperados = Arrays.asList("a", "b", "c", "d", "e", "f");
		
		// Act
		
		List<String[]> grupos = groupsGenerator.generate(3, "a", "b", "c", "d", "e", "f");
		
		// Assert
		
		assertNotNull(grupos);
		assertEquals(2, grupos.size());
		assertEquals(3, grupos.get(0).length);
		assertEquals(3, grupos.get(1).length);
		
		List<String> miembrosPresentes = new ArrayList<>();
		
		for(String[] grupo: grupos) {
			for(String miembro: grupo) {
				miembrosPresentes.add(miembro);
			}
		}
		
		assertTrue(miembrosPresentes.containsAll(miembrosEsperados));
		
	}
	
	@Test
	void forma_grupos_correctamente_cuando_SI_hay_miembros_sobrantes() {
		
		List<String> miembrosEsperados = Arrays.asList("a", "b", "c", "d", "e");
						
		List<String[]> grupos = groupsGenerator.generate(3, "a", "b", "c", "d", "e");
						
		assertNotNull(grupos);
		assertEquals(1, grupos.size());
		assertEquals(5, grupos.get(0).length);
				
		List<String> miembrosPresentes = new ArrayList<>();
				
		for(String[] grupo: grupos) {
			for(String miembro: grupo) {
				miembrosPresentes.add(miembro);
			}
		}
				
		assertTrue(miembrosPresentes.containsAll(miembrosEsperados));
		
	}
	
	@Test
	void cuando_el_numero_de_miembros_no_puede_completar_un_grupo_lanza_execpcion() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			groupsGenerator.generate(3, "a", "b");
		});
		
		String mensaje = exception.getMessage();
		
		assertEquals("El número de miembros [2] es inferior al tamaño de grupo [3]", mensaje);
		
	}
	
	

}
