package com.pgrsoft.cajondesastre.trianguloderoles;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterSpanishImpl;

public class GeneradorMensajes {

	private NumberFormatter numberFormatter = new NumberFormatterSpanishImpl();
	
	public String generarMensaje(String nombreCompleto, String dni, int importe) {
		
		String mensaje = "El cliente " + nombreCompleto 
				      + " con DNI " + dni 
				      + " debe la cantidad de " + numberFormatter.convert(importe) + " euros.";
		
		
		return mensaje;
	}
	
}
