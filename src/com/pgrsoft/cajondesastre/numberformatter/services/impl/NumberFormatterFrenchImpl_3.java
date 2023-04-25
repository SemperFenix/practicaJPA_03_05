package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterFrenchImpl_3 implements NumberFormatter {
	
    private static final String[] UNITE = {"zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
    private static final String[] DIZAINE  = {"dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
    private static final String[] DIZAINES2 = {"vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix", "quatre-vingt", "quatre-vingt-dix"};
   
  
    public String convert(int numero) {
        if (numero < 10) { // entre 0 y 9
            return UNITE[numero];
        } else if (numero < 20) {  // entre 10 y 19
            return DIZAINE[numero - 10];
        } else if (numero < 70) { // entre 20 y 69
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad == 0) {
                return DIZAINES2[decena - 2];
            } else if (decena == 6 || decena == 7) {
                return DIZAINES2[decena - 2] + "-" + convert(unidad);
            } else {
                return DIZAINES2[decena - 2] + "-" + UNITE[unidad];
            }
        } else if (numero < 80) { // entre 70 y 79
            return DIZAINES2[4] + "-" + convert(numero - 60);
        } else if (numero < 90) { // entre 80 y 89
            if (numero == 80) {
                return DIZAINES2[6];
            }
            return DIZAINES2[6] + "-" + convert(numero - 80);
        } else if (numero < 100) { // entre 90 y 99
            if (numero == 90) return "quatre-vingt-dix";
            return DIZAINES2[6] + "-" + convert(10 + (numero - 90));
        } else if (numero == 100) {
            return "cent";
        } else if (numero < 200) { // entre 101 y 199
            return "cent " + convert(numero - 100);
        } else if (numero < 1000) { // entre 200 y 999
            int resto = numero % 100;
            int centena = numero / 100;
            if (resto == 0) {
                return UNITE[centena] + " cents";
            }else if (resto < 10) {
                return UNITE[centena] + " cent " + UNITE[resto];
            } else if (resto < 20) {
                return UNITE[centena] + " cent " + DIZAINE[resto - 10];
            } else {
                return UNITE[centena] + " cent " + convert(resto);
            }
        } else {
            return "Numéro hors limite";
        }
    }
    
}
