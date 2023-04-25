package com.pgrsoft.cajondesastre.numberformatter;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImplIvan;

public class TestClass {

	public static void main(String[] args) {
		
	//	NumberFormatter numberFormatter = new NumberFormatterSpanishImpl();
		NumberFormatter numberFormatter = new NumberFormatterFrenchImplIvan();
	//	NumberFormatter numberFormatter = new NumberFormatterCatalanImpl();
	//	NumberFormatter numberFormatter = new NumberFormatterOccitanoImpl();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + ": " + numberFormatter.convert(i));
		}
		
	}
	
}
