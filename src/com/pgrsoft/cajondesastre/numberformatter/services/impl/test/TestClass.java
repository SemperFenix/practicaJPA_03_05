package com.pgrsoft.cajondesastre.numberformatter.services.impl.test;

import com.pgrsoft.cajondesastre.numberformatter.services.NumberFormatter;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImpl_1;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImpl_2;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImpl_3;
import com.pgrsoft.cajondesastre.numberformatter.services.impl.NumberFormatterFrenchImpl_5;

public class TestClass {

	public static void main(String[] args) {
		
		NumberFormatter numberFormatter1 = new NumberFormatterFrenchImpl_1();
		NumberFormatter numberFormatter2 = new NumberFormatterFrenchImpl_2();
		NumberFormatter numberFormatter3 = new NumberFormatterFrenchImpl_3();
		NumberFormatter numberFormatter5 = new NumberFormatterFrenchImpl_5();
	/*
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + ": " + numberFormatter1.convert(i));
		}
	*/	
		
		for(int i = 0; i < 1000; i++) {
			
			String str1 = numberFormatter3.convert(i);
			String str2 = numberFormatter2.convert(i);
			
			if(!str1.equals(str2)) {
				System.out.println(i + ": diferente!!!!");
			}
		
		}
		
	}

}
