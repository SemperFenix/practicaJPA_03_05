package com.pgrsoft.cajondesastre.numberformatter.services.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImplAlan;

class NumberFormatterFrenchImplAlanTest {
	
	private NumberFormatter numberFormatter = new NumberFormatterFrenchImplAlan();

	@Test
	void conviertenumeros_correctamente() {
		
		assertEquals("zéro", numberFormatter.convert(0));
		assertEquals("deux cents", numberFormatter.convert(200));
		assertEquals("cent huit", numberFormatter.convert(108));
		assertEquals("cent quinze", numberFormatter.convert(115));
		assertEquals("trois cent soixante-dix-neuf", numberFormatter.convert(379));
		assertEquals("quatre cent quatre-vingt-dix-huit", numberFormatter.convert(498));
		assertEquals("cinc cent trente-et-un", numberFormatter.convert(531));
		assertEquals("six cent trente", numberFormatter.convert(630));
		assertEquals("sept cent quarante-deux", numberFormatter.convert(742));
		assertEquals("cent", numberFormatter.convert(100));
		assertEquals("huit", numberFormatter.convert(8));
		assertEquals("trente-deux", numberFormatter.convert(32));
	}
	
	@Test
	void lanza_excepcion_con_numeros_fuera_de_rango() {
		
		Exception exception1 = assertThrows(IllegalArgumentException.class, ()-> {numberFormatter.convert(-8);});
		String mensaje1 = exception1.getMessage();
		assertEquals("Le numéro -8 est hors limites.", mensaje1);
		
		Exception exception2 = assertThrows(IllegalArgumentException.class, ()-> {numberFormatter.convert(1000);});
		String mensaje2 = exception2.getMessage();
		assertEquals("Le numéro 1000 est hors limites.", mensaje2);
	}

}
