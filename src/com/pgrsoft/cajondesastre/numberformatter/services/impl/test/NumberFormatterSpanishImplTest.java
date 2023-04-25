package com.pgrsoft.cajondesastre.numberformatter.services.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterSpanishImpl;

class NumberFormatterSpanishImplTest {

	private NumberFormatter numberFormatter = new NumberFormatterSpanishImpl();
	
	@Test
	void convierte_numeros_correctamente() {
		  
		assertEquals("cuarenta y siete", numberFormatter.convert(47));	  
		assertEquals("doscientos catorce", numberFormatter.convert(214));
		assertEquals("trescientos cuarenta y dos", numberFormatter.convert(342)); 
		assertEquals("ochocientos cincuenta", numberFormatter.convert(850)); 
		assertEquals("ocho", numberFormatter.convert(8));   
		assertEquals("dieciséis", numberFormatter.convert(16));
		assertEquals("cero", numberFormatter.convert(0));
		assertEquals("cien", numberFormatter.convert(100));
		
	}
		
	@Test
	void lanza_excepcion_con_numeros_negativos() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			numberFormatter.convert(-8);
		});
		
		String mensaje = exception.getMessage();
		
		assertEquals("El número -8 está fuera de rango. Sólo se admiten números entre [0..999]", mensaje);
		
	}
	
	@Test
	void lanza_excepcion_con_numeros_superiores_a_999() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			numberFormatter.convert(1005);
		});
		
		String mensaje = exception.getMessage();
		
		assertEquals("El número 1005 está fuera de rango. Sólo se admiten números entre [0..999]", mensaje);
		
	}
		
}
