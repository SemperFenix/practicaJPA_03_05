package com.pgrsoft.cajondesastre.modelogeometrico;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void trasladar(double deltaX, double deltaY) {
		x += deltaX;
		y += deltaY;
	}
	
	public double getDistancia(Punto otro) {
	
		return Math.sqrt(Math.pow((otro.x - x), 2) +  Math.pow((otro.y - y), 2));
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}

}
