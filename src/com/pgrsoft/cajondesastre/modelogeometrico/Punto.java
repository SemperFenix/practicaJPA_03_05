package com.pgrsoft.cajondesastre.modelogeometrico;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

}
