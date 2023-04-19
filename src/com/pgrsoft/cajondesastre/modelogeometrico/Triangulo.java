package com.pgrsoft.cajondesastre.modelogeometrico;

public class Triangulo extends Poligono {
		
	public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
		super(verticeA, verticeB, verticeC);	
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
	
	public double getArea() {
		
		double semiperimetro= this.getPerimetro() / 2;

        return Math.sqrt(semiperimetro * (semiperimetro - vertices[0].getDistancia(vertices[1])) * 
                                         (semiperimetro - vertices[1].getDistancia(vertices[2])) * 
                                         (semiperimetro - vertices[2].getDistancia(vertices[0])));
	}
		
	@Override
	public String toString() {
		return "Triangulo [verticeA=" + vertices[0] + ", verticeB=" + vertices[1] + ", verticeC=" + vertices[2] + "]";
	}
	
}
