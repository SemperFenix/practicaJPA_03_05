package com.pgrsoft.cajondesastre.trianguloderoles.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.trianguloderoles.GeneradorMensajes;

class GeneradorMensajesTest {

	private GeneradorMensajes generadorMensajes = new GeneradorMensajes();
	
	@Test
	void testGenerarMensaje() {
	
		String mensaje = generadorMensajes.generarMensaje("Pepín", "46498776W", 246);
		
		assertEquals("El cliente Pepín con DNI 46498776W debe la cantidad de doscientos cuarenta y seis euros.", mensaje);
		
	}

}
