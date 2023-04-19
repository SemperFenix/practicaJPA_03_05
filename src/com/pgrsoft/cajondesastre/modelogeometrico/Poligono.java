package com.pgrsoft.cajondesastre.modelogeometrico;

public abstract class Poligono implements Figura{

	protected Punto[] vertices;
	
	public Poligono(Punto v1, Punto v2, Punto v3) {
		vertices = new Punto[] {v1, v2, v3};
	}
	
	public Poligono(Punto[] vertices) {
		
		if(vertices.length < 3) {
			throw new RuntimeException("No se puede crear un polígono con " + vertices.length + " vértices.");
		}
		
		this.vertices = vertices;
	}
	
	@Override
	public abstract double getArea();

	@Override
	public double getPerimetro() {
		
		double perimetro = 0.0;
		
		//TODO 
		
		return perimetro;
	}

	@Override
	public void trasladar(double deltaX, double deltaY) {
		
		for(Punto vertice: vertices) {
			vertice.trasladar(deltaX, deltaY);
		}
		
	}

}
