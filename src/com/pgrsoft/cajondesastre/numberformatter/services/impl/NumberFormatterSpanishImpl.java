package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import java.util.Map;
import java.util.HashMap;

public class NumberFormatterSpanishImpl implements NumberFormatter {

	private static final Map<Integer, String> UNIDADES = new HashMap<>();
	private static final Map<Integer, String> DECENAS = new HashMap<>();
	private static final Map<Integer, String> CENTENAS = new HashMap<>();
	private static final Map<Integer, String> EXCEPCIONES = new HashMap<>();
	
	static {
		
		UNIDADES.put(0, "");
		UNIDADES.put(1, "uno");
		UNIDADES.put(2, "dos");
		UNIDADES.put(3, "tres");
		UNIDADES.put(4, "cuatro");
		UNIDADES.put(5, "cinco");
		UNIDADES.put(6, "seis");
		UNIDADES.put(7, "siete");
		UNIDADES.put(8, "ocho");
		UNIDADES.put(9, "nueve");
		
		DECENAS.put(0, "");
		DECENAS.put(1, "diez");
		DECENAS.put(3, "treinta");
		DECENAS.put(4, "cuarenta");
		DECENAS.put(5, "cincuenta");
		DECENAS.put(6, "sesenta");
		DECENAS.put(7, "setenta");
		DECENAS.put(8, "ochenta");
		DECENAS.put(9, "noventa");
		
		CENTENAS.put(0, "");
		CENTENAS.put(1, "ciento");
		CENTENAS.put(2, "doscientos");
		CENTENAS.put(3, "trescientos");
		CENTENAS.put(4, "cuatrocientos");
		CENTENAS.put(5, "quinientos");
		CENTENAS.put(6, "seiscientos");
		CENTENAS.put(7, "setecientos");
		CENTENAS.put(8, "ochocientos");
		CENTENAS.put(9, "novecientos");
		
		EXCEPCIONES.put(11, "once");
		EXCEPCIONES.put(12, "doce");
		EXCEPCIONES.put(13, "trece");
		EXCEPCIONES.put(14, "catorce");
		EXCEPCIONES.put(15, "quince");
		EXCEPCIONES.put(16, "dieciséis");
		EXCEPCIONES.put(17, "diecisiete");
		EXCEPCIONES.put(18, "dieciocho");
		EXCEPCIONES.put(19, "diecinueve");
		EXCEPCIONES.put(20, "veinte");
		EXCEPCIONES.put(21, "veintiuno");
		EXCEPCIONES.put(22, "veintidós");
		EXCEPCIONES.put(23, "veintitrés");
		EXCEPCIONES.put(24, "veinticuatro");
		EXCEPCIONES.put(25, "veinticinco");
		EXCEPCIONES.put(26, "veintiséis");
		EXCEPCIONES.put(27, "veintisiete");
		EXCEPCIONES.put(28, "veintiocho");
		EXCEPCIONES.put(29, "veintinueve");
	}
	
	@Override
	public String convert(int numero) {
			
		if(numero < 0 || numero > 999) {
			throw new IllegalArgumentException("El número " + numero + " está fuera de rango. Sólo se admiten números entre [0..999]");
		}
		
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
		
		String resultado = CENTENAS.get(CENTENA) + " ";
		
		if(DU > 10 && DU < 30) {
			resultado += EXCEPCIONES.get(DU);
		} else {
			String conjuncion = DECENA == 0 || UNIDAD == 0 ? "" : " y ";
			resultado += DECENAS.get(DECENA) + conjuncion + UNIDADES.get(UNIDAD);
		}
		
		return resultado.trim();
		
	}

}
