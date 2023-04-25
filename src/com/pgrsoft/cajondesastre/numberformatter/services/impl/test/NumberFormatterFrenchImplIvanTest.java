package com.pgrsoft.cajondesastre.numberformatter.services.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImplAlan;

class NumberFormatterFrenchImplIvanTest {

	NumberFormatter frenchNumber = new NumberFormatterFrenchImplAlan();;

	@Test
	void convert_number_to_french_units() {

		assertEquals("cinc", frenchNumber.convert(5));
	}

	@Test
	void convert_number_to_french_tens() {
		assertEquals("dix-neuf", frenchNumber.convert(19));
		assertEquals("quatre-vingt", frenchNumber.convert(80));

	}

	@Test
	void convert_number_to_french_hundreds() {

		assertEquals("deux-cent-vingt-trois", frenchNumber.convert(223));
		assertEquals("deux-cent", frenchNumber.convert(200));
		assertEquals("deux-cent-six", frenchNumber.convert(206));
		assertEquals("deux-cent-quarante", frenchNumber.convert(240));
		assertEquals("cent-trois", frenchNumber.convert(103));
		assertEquals("cent-vingt", frenchNumber.convert(120));
	}

	@Test
	void convert_number_to_french_special_cases() {
		assertEquals("zéro", frenchNumber.convert(0));
		assertEquals("cent", frenchNumber.convert(100));
		assertEquals("quinze", frenchNumber.convert(15));
	}

    @Test
    void convert_number_to_french_exception(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{frenchNumber.convert(1020);});
        assertTrue(exception.getMessage().equals("Le nombre est trop grande"));
    }
}
