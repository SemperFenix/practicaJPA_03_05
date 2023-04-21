package com.pgrsoft.cajondesastre.stack;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Foo {

	public void m1() {
		System.out.println("m1 antes de invocar a m2");
		
		try {
			m2();
		} catch (Exception e) {
			
		}
		
		System.out.println("m1 una vez hemos invocado a m2");
	}
	
	public void m2() throws Exception {
		System.out.println("m2 antes de invocar a m3");
		m3();
		System.out.println("m2 una vez hemos invocado a m3");
	}
	
	public void m3() throws Exception {
		System.out.println("m3");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strFecha = "23/12/2020";
		
		Date fecha = sdf.parse(strFecha);
		System.out.println(fecha);
			
	}
	
}
