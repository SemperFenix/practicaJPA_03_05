package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterFrenchImpl_4 implements NumberFormatter {
    private static final String[] UNIDADES = { "", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix",
            "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf" };
    private static final String[] DECENAS = { "", "", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix",
            "quatre-vingt", "quatre-vingt-dix" };
    private static final String[] CENTENAS = { "", "cent", "deux cents", "trois cents", "quatre cents", "cinq cents", "six cents",
            "sept cents", "huit cents", "neuf cents" };
    
    @Override   
    public String convert(int numero) {
        if (numero == 0) {
            return "zéro";
        }
        if (numero <= 19) {
            return UNIDADES[numero];
        } 
        else if (numero <= 99) {
            int decena = numero / 10;
            int unidad = numero % 10;
            if (decena == 7 || decena == 9) {
                decena--;
                unidad += 10;
            }
            if(decena == 1) {
                unidad += 10;
            }
            if (unidad == 0) {
                return DECENAS[decena];
            } else                
            	return DECENAS[decena] + "-" + UNIDADES[unidad];
        } else if (numero <= 999) {
            int centena = numero / 100;
            
            int decena = (numero % 100) / 10;
            int unidad = numero % 10;
            
            if (decena == 7 || decena == 9) {
                decena--;
                unidad += 10;
            }
            
            if(decena == 1) {
                unidad += 10;
            }
            
            if (decena == 0 && unidad == 0) {
                return CENTENAS[centena];
            } else if (decena == 0) {
                return CENTENAS[centena] + " " + UNIDADES[unidad];
            } else {
                if (unidad == 0) {
                    return CENTENAS[centena] + " " + DECENAS[decena] + UNIDADES[unidad];
                }
               else {
            	   return CENTENAS[centena] + " " + DECENAS[decena] + "-" + UNIDADES[unidad];
               }
            }
        }
        
        return null; 
    }
}
