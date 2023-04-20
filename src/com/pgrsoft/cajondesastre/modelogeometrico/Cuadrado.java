package com.pgrsoft.cajondesastre.modelogeometrico;

import java.util.Arrays;

public class Cuadrado extends Poligono {

	public Cuadrado(Punto v1, Punto v2, Punto v3, Punto v4) {
			
		super(new Punto[] {v1, v2, v3, v4});
		
		// TODO Ojo! esto no garantiza que se trate de un cuadrado
/*		
		double longitudLado1 = v1.getDistancia(v2);
		double longitudLado2 = v2.getDistancia(v3);
		double longitudLado3 = v3.getDistancia(v4);
		double longitudLado4 = v4.getDistancia(v1);
		
		if(longitudLado1 != longitudLado2 || longitudLado1 != longitudLado3 || longitudLado1 != longitudLado4) {
			throw new IllegalArgumentException("Los vertices suministrados no forman un cuadrado");		
		}
*/	
	}
	
	@Override
	public double getArea() {
		
		double lado = vertices[0].getDistancia(vertices[1]);
		
		return Math.pow(lado, 2);
	}
	
	@Override
	public double getPerimetro() {
		
		double lado = vertices[0].getDistancia(vertices[1]);
		
		return lado * 4;
		
	}

	@Override
	public String toString() {
		return "Cuadrado [vertices=" + Arrays.toString(vertices) + "]";
	}

}
