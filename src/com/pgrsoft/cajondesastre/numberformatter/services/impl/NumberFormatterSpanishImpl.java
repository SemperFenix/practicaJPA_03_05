package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterSpanishImpl implements NumberFormatter {

	private final String[] UNIDADES = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
	private final String[] DECENAS = {"", "diez", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
	private final String[] CENTENAS = {"", "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
	private final String[] EXCEPCIONES = {"once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidos", "veintitrés", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve"};
	
	@Override
	public String convert(int numero) {
		
		if(numero == 100) {
			return "cien";
		}
		
		if(numero == 0) {
			return "cero";
		}
			
		final int CENTENA = numero / 100;
		final int DECENA = (numero / 10) % 10;
		final int UNIDAD = numero % 10;
		final int DU = (DECENA * 10) + UNIDAD;
		
		String resultado = CENTENAS[CENTENA] + " ";
		
		if(DU > 10 && DU < 30) {
			resultado += EXCEPCIONES[DU - 11];
		} else {
			String conjuncion = DECENA == 0 || UNIDAD == 0 ? "" : " y ";
			resultado += DECENAS[DECENA] + conjuncion + UNIDADES[UNIDAD];
		}
		
		return resultado.trim();
	}

}
