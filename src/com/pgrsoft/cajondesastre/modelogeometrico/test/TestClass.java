package com.pgrsoft.cajondesastre.modelogeometrico.test;

import com.pgrsoft.cajondesastre.modelogeometrico.Circulo;
import com.pgrsoft.cajondesastre.modelogeometrico.Figura;
import com.pgrsoft.cajondesastre.modelogeometrico.Punto;
import com.pgrsoft.cajondesastre.modelogeometrico.Triangulo;

public class TestClass {

	public static void main(String[] args) {
		
		// Instanciación de puntos...
		
		Punto p1 = new Punto(0.0, 0.0);
		Punto p2 = new Punto(1.0, 0.0);
		
		double distancia = p1.getDistancia(p2);
				
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		System.out.println("Distancia entre p1 y p2: " + distancia);
		
		p2.trasladar(10.0, 0.0);
		
		System.out.println("Distancia entre p1 y p2: " + p1.getDistancia(p2));
		
		p2.trasladar(-1.0, 10.0);
		
		System.out.println("Distancia entre p1 y p2: " + p1.getDistancia(p2));
	
		// Necesitamos un circulo...
		
		Circulo circulo1 = new Circulo(10.0);							// el centro estará en [0.0, 0.0]
		Circulo circulo2 = new Circulo(new Punto(10.0, 10.0), 50.0);
		Circulo circulo3 = new Circulo(10.0, 10.0, 50.0);
		
		System.out.println(circulo1);
		System.out.println(circulo2);
		System.out.println(circulo3);
		
		// Pruebas de getPerimetro(), getArea() y trasladar() con círculos
		
		double perimetroCirculo1 = circulo1.getPerimetro();
		double perimetroCirculo2 = circulo2.getPerimetro();
		
		double areaCirculo1 = circulo1.getArea();
		double areaCirculo2 = circulo2.getArea();
		
		System.out.println("perímetro del circulo1: " + perimetroCirculo1);
		System.out.println("perímetro del circulo2: " + perimetroCirculo2);
		System.out.println("área del circulo1: " + areaCirculo1);
		System.out.println("área del circulo2: " + areaCirculo2);
		
		circulo1.trasladar(100.0, 100.0);
		
		circulo1.saluda();
		
		System.out.println("Nueva posición de circulo1: " + circulo1);
		
		Punto vertice1 = new Punto(0.0, 0.0);
		Punto vertice2 = new Punto(5.0, 0.0);
		Punto vertice3 = new Punto(0.0, 5.0);
			
		Triangulo triangulo = new Triangulo(vertice1, vertice2, vertice3);
		
		double areaTriangulo = triangulo.getArea();
		double perimetroTriangulo = triangulo.getPerimetro();
		
		System.out.println("Área del triángulo: " + areaTriangulo);
		System.out.println("Perímetro del triángulo " + perimetroTriangulo);
		
		System.out.println(triangulo);
		
		triangulo.getVerticeA().setX(100000000.0);
		triangulo.getVerticeA().setY(-10000000.0);
		
		System.out.println(triangulo);
		
		// **************** Demostración de polimorfismo ******************+
		
		
		Figura[] figuras = {circulo1, triangulo, circulo2};
		
		System.out.println("\n************** DEMO POLIMORFISMO ********************\n");
		
		for(Figura figura: figuras) {
			figura.trasladar(10.0, -2.0);
			System.out.println(figura.getArea());
			System.out.println(figura.getPerimetro() + "\n");
		}
		
		
	}

}
