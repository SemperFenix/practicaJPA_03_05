package com.pgrsoft.cajondesastre.modelogeometrico;

import java.util.Arrays;

public class Triangulo extends Poligono {
		
	public Triangulo(Punto v1, Punto v2, Punto v3) {
		super(new Punto[] {v1, v2, v3});
		
		if(v1.equals(v2) || v1.equals(v3) || v2.equals(v3)) {
			throw new IllegalArgumentException("Los tres vértices aportados no forman un triángulo.");
		}
		
	}

	@Override
	public double getArea() {
		
		double semiperimetro= this.getPerimetro() / 2;

        return Math.sqrt(semiperimetro * (semiperimetro - vertices[0].getDistancia(vertices[1])) * 
                                         (semiperimetro - vertices[1].getDistancia(vertices[2])) * 
                                         (semiperimetro - vertices[2].getDistancia(vertices[0])));
	}

	public Punto getVerticeA() {
		return vertices[0];
	}

	public Punto getVerticeB() {
		return vertices[1];
	}

	public Punto getVerticeC() {
		return vertices[2];
	}
	
	@Override
	public String toString() {
		return "Triangulo [vertices=" + Arrays.toString(vertices) + "]";
	}

}
