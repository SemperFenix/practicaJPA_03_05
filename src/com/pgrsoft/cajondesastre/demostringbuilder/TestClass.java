package com.pgrsoft.cajondesastre.demostringbuilder;

public class TestClass {

	public static void main(String[] args) {
			
		m1();
		m2();

	}
	
	private static void m1() {
		
		String resultado = "";
		
		for(int i = 0; i < 1000 ; i++) {
			for(int j = 0; j < 100; j++) {
				resultado += i + "_" + j;
			}
		}
		
		System.out.println("Concatenación clásica: " + resultado);
	}
	
	private static void m2() {
		
		String resultado = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 1000 ; i++) {
			for(int j = 0; j < 100; j++) {
				sb.append(i)
				  .append("_")
				  .append(j);
			}	
		}
		
		resultado = sb.toString();
		
		System.out.println("Concatenación con StringBuilder: " + resultado);
	}

}
