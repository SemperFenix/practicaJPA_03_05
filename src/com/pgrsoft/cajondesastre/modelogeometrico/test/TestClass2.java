package com.pgrsoft.cajondesastre.modelogeometrico.test;

import com.pgrsoft.cajondesastre.modelogeometrico.Figura;
import com.pgrsoft.cajondesastre.modelogeometrico.Cuadrado;
import com.pgrsoft.cajondesastre.modelogeometrico.Punto;

public class TestClass2 {

	public static void main(String[] args) {
		
		Punto vertice1 = new Punto(0, 0);
		Punto vertice2 = new Punto(5, 0);
		Punto vertice3 = new Punto(5, 5);
		Punto vertice4 = new Punto(0, 5);
		
		
		Figura cuadrado = new Cuadrado(vertice1, vertice2, vertice3, vertice4);
		
		//System.out.println(cuadrado.getArea());
		System.out.println(cuadrado.getPerimetro());

	}

}
