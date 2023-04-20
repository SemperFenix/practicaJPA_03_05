package com.pgrsoft.cajondesastre.modelogeometrico;

public abstract class Poligono implements Figura{

	protected Punto[] vertices;
	
	public Poligono(Punto[] vertices) {
		
		if(vertices.length < 3) {
			throw new RuntimeException("No se puede crear un polígono con " + vertices.length + " vértices.");
		}
		
		this.vertices = vertices;
	}
	
	@Override
	public double getPerimetro() {
		
		double perimetro = 0.0;
		
		int numeroVertices = vertices.length;
		
		for(int i = 0; i < numeroVertices -1; i++) {
			perimetro += vertices[i].getDistancia(vertices[i + 1]);
		}
		
		perimetro += vertices[numeroVertices - 1].getDistancia(vertices[0]);
		
		return perimetro;
	}

	@Override
	public void trasladar(double deltaX, double deltaY) {
		
		for(Punto vertice: vertices) {
			vertice.trasladar(deltaX, deltaY);
		}
		
	}

}
