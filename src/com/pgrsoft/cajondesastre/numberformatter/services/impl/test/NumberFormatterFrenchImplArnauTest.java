package com.pgrsoft.cajondesastre.numberformatter.services.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImplAlan;

class ConversorFrTest {

	private NumberFormatter conversor = new NumberFormatterFrenchImplAlan();
	
	@Test
	void testConvert_0() {
		assertEquals("zero", conversor.convert(0));
	}
	
	@Test
	void testConvert_999() {
		assertEquals("neuf-cents-quatre-vingt-dix-neuf", conversor.convert(999));	
	}
		
	@Test
	void testConvert_unidades() {
		assertEquals("un", conversor.convert(1));
		assertEquals("deux", conversor.convert(2));
		assertEquals("cinq", conversor.convert(5));
		assertEquals("six", conversor.convert(6));
		assertEquals("huit", conversor.convert(8));
		assertEquals("neuf", conversor.convert(9));
	}
	
	@Test
	void testConvert_decenas_normal() {
		assertEquals("vingt", conversor.convert(20));
		assertEquals("quarante", conversor.convert(40));
		assertEquals("cinquante", conversor.convert(50));
		assertEquals("soixante", conversor.convert(60));
		assertEquals("quatre-vingt", conversor.convert(80));
	}
	
	@Test
	void testConvert_decenas_excepcion() {
		assertEquals("dix", conversor.convert(10));
		assertEquals("soixante-dix", conversor.convert(70));
		assertEquals("quatre-vingt-dix", conversor.convert(90));
	}
	
	@Test
	void testConvert_centenas() {
		assertEquals("cent", conversor.convert(100));
		assertEquals("quatre-cents", conversor.convert(400));
		assertEquals("cinq-cents", conversor.convert(500));
		assertEquals("six-cents", conversor.convert(600));
		assertEquals("neuf-cents", conversor.convert(900));
	}
	
	@Test
	void testConvert_excepciones_11a19() {
		assertEquals("neuf", conversor.convert(9));
		assertEquals("dix", conversor.convert(10));
		assertEquals("onze", conversor.convert(11));
		assertEquals("douze", conversor.convert(12));
		assertEquals("treize", conversor.convert(13));
		assertEquals("catorze", conversor.convert(14));
		assertEquals("quinze", conversor.convert(15));
		assertEquals("seize", conversor.convert(16));
		assertEquals("dix-sept", conversor.convert(17));
		assertEquals("dix-huit", conversor.convert(18));
		assertEquals("dix-neuf", conversor.convert(19));
		assertEquals("vingt", conversor.convert(20));
	}
	
	@Test
	void testConvert_caso_general() {
		assertEquals("cent-trente-cinq", conversor.convert(135));
		assertEquals("deux-cents-quarante-six", conversor.convert(246));
		assertEquals("trois-cents-cinquante-sept", conversor.convert(357));
		assertEquals("quatre-cents-soixante-huit", conversor.convert(468));
		assertEquals("cinq-cents-quatre-vingt-neuf", conversor.convert(589));
	}
	
	@Test
	void testConvert_caso_general_excepciones() {
		assertEquals("cent-onze", conversor.convert(111));
		assertEquals("deux-cents-quinze", conversor.convert(215));
		assertEquals("trois-cents-quatre-vingt-treize", conversor.convert(393));
		assertEquals("six-cents-soixante-quatorze", conversor.convert(674));
		assertEquals("neuf-cents-quatre-vingt-dix-neuf", conversor.convert(999));
	}	
	
}
