package com.pgrsoft.cajondesastre.modelogeometrico;

public class Circulo {
	
	private Punto centro; 
	private double radio; 
	
	public Circulo(double radio) {
		this.centro = new Punto(0.0, 0.0);
		this.radio = radio;
	}
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	public Circulo(double x, double y, double radio) {
		this.centro = new Punto(x, y);
		this.radio = radio;	
	}
	
	public void trasladar(double deltaX, double deltaY) {
		
		// TODO
	}
	
	public double getPerimetro() {
		
		// TODO
		
		return 0.0;
	}
	
	public double getArea() {
		
		// TODO
		
		return 0.0;
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}
	
	public String toString() {
		return "Centro " + this.centro + " Radio: " + this.radio;
	}
	

}

