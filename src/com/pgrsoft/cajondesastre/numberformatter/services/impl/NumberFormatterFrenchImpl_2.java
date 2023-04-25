package com.pgrsoft.cajondesastre.numberformatter.services.impl;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;

public class NumberFormatterFrenchImpl_2 implements NumberFormatter{
    
	private final String [] units = {"","un","deux","trois","quatre","cinc","six","sept","huit","neuf"};
    private final String [] tens = {"dix","onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf"};
    private final String [] decades = {"","","vingt","trente","quarante","cinquante","soixante","soixante","quatre-vingt","quatre-vingt"};
    private final String [] hundreds = {"","cent","deux cent","trois cent","quatre cent","cinc cent","six cent","sept cent","huit cent","neuf cent"};
   
    @Override
    public String convert(int numero) {
    	
        final int UNIDAD = numero % 10;
        final int DECENA = (numero / 10) % 10;
        final int CENTENA = (numero / 100) % 10;
        
        if (numero==0) {
            return "zéro";
        }
        
        if (UNIDAD == 0 && DECENA == 0 && CENTENA != 1) {
            return hundreds[CENTENA] + "s";
        }
        
        if (DECENA == 0) {
            return hundreds[CENTENA] + " " + units[UNIDAD];
        }
        
        if (DECENA == 1) {
            return hundreds[CENTENA] + " " + tens[UNIDAD];
        }
        
        if (DECENA == 7 || DECENA == 9) {
            return hundreds[CENTENA] + " "  + decades[DECENA] + "-" + tens[UNIDAD];
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
