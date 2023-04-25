package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterFrenchImplIvan implements NumberFormatter {

	private final String[] UNIDADES = { "", "un", "deux", "trois", "quatre", "cinc", "six", "sept", "huit", "neuf" };
	private final String[] DECENAS = { "", "dix", "vingt", "treinte", "quarante", "cinquante", "soixante",
			"soixante-dix", "quatre-vingt", "quatre-vingt-dix" };
	private final String[] EXCEPCIONES = { "onze", "douze", "treize", "qatorze", "quinze", "seize" };

	@Override
	public String convert(int numero) {

		if (numero > 999) {
			throw new IllegalArgumentException("Le nombre est trop grande");
		}

		if (numero == 0) {
			return "zero";
		}

		final int CENTENA = numero / 100;
		final int DECENA = (numero / 10) % 10;
		final int UNIDAD = numero % 10;
		final int DU = (DECENA * 10) + UNIDAD;

		StringBuilder resultado = new StringBuilder();
		String hundredsConj = "";

		if (CENTENA == 0) {
		} else if (CENTENA == 1) {
			resultado.append("cent");
			hundredsConj = DECENA == 0 && UNIDAD == 0 ? "" : "-";
		} else {
			resultado.append(UNIDADES[CENTENA] + "-cent");
			hundredsConj = DECENA == 0 && UNIDAD == 0 ? "" : "-";
		}

		if (DU > 10 && DU < 17) {
			resultado.append(hundredsConj + EXCEPCIONES[DU - 11]);
		} else {
			String conjuncion = DECENA == 0 || UNIDAD == 0 ? "" : "-";
			resultado.append(hundredsConj + DECENAS[DECENA] + conjuncion + UNIDADES[UNIDAD]);
		}

		return resultado.toString().trim();

	}

}
