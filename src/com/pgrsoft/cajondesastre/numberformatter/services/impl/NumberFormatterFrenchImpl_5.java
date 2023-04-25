package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterFrenchImpl_5 implements NumberFormatter {
 
    private final String [] units = {"", "Un", "Deux", "trois", "quatre", "Cinq","Six","Sept","Huit","Neuf"};
    private final String [] tens = {"Dix","Onze","Douze","Treize", "Quatorze","Quinze","Seize","Dix-Sept","Dix-Huit","Dix-Neuf"};
    private final String [] decades = {"", "", "Vingt","Trente", "Quarante","Cinquante","Soixante","Soixante-","Quatre-Vingt","Quatre-Vingt"};
    private final String [] hundreds = {"", "Cent", "Deux-Cent", "Trois-Cent","Quatre-Cent","Cinc-Cent","Six-Cent","Sept-Cent","Huit-Cent","Neuf-Cent"};
    
    @Override
    public String convert(int numero) {
    	
        final int UNIDAD = numero % 10;
        final int DECENA = (numero / 10) % 10;
        final int CENTENA = (numero / 100) % 10;
        
        if (numero == 0) {
            return "Zéro";
        }
        
        if (UNIDAD == 0 && DECENA == 0) {
            return hundreds[CENTENA] + "s";
        } 
        
        if (DECENA==0) {
            return hundreds[CENTENA] + " " + units[UNIDAD];
        }
            
        if (DECENA == 1) {
        	return hundreds[CENTENA] + " " + tens[UNIDAD];
        }
            
        if (DECENA == 7 || DECENA == 9) {
            return hundreds[CENTENA] + " " + decades[DECENA] + "-" + tens[UNIDAD];
        }
            
        if (UNIDAD == 1) {
        	return hundreds[CENTENA] + " " + decades[DECENA] + "-et-" + units[UNIDAD];
        }
            
            if (UNIDAD == 0) {
                return hundreds[CENTENA] + " " + decades[DECENA];
            }
            
            return hundreds[CENTENA] + " " + decades[DECENA] + "-" + units[UNIDAD];
    }
        
}
