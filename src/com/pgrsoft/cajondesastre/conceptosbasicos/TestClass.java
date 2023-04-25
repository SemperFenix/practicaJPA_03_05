package com.pgrsoft.cajondesastre.conceptosbasicos;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings({"unused", "removal"})
class TestClass {

	public static void main(String[] args) {
		
		demoIf();
		demoOperadorTernario();
		demoWhile();
		demoFor();
		demoArray();
		demoConversion();
		demoStringMethods();
		demoBasicOperations();
		demoLinkedList();
		
	}
	
	private static void demoLinkedList() {
		
		LinkedList<String> miembros = new LinkedList<>();
		
		miembros.add("a");
		miembros.add("b");
		miembros.add("c");
		miembros.add("d");
		
		System.out.println(miembros);
		
		Collections.shuffle(miembros);
		
		// Métodos pop() y push() perfectos para trabajar con una pila (LIFO)
		
		while(!miembros.isEmpty()) {
			String miembro = miembros.pop();
			System.out.println(miembro);
		}
		
	}
	
	private static void demoBasicOperations() {
		
		System.out.println("\n*********************** Demo Operaciones aritméticas básicas ****************************\n");
		
		// Colocar parantesis aunque la operación sea obvia
		
		System.out.println(10 + (4 * 5));   // 
		
		// Resto de la división
		
		System.out.println(11 % 2);
		
		// Para redondear números
		// Importante el uso de la clase Math
		
		System.out.println(Math.floor(10.34));
			
	}
	
	private static void demoStringMethods() {
		
		System.out.println("\n*********************** Demo métodos String ****************************\n");
		
		String frase = "Are you talking to me?";
		
		// Número caracteres
		
		int numeroCaracteres = frase.length();
		
		// Mirar si contiene string
		
		boolean contiene = frase.contains("you");
		
		// Obtener una subcadena
		
		String subcadena = frase.substring(2, 5);
		
		// Obtener el caracter en una determinada posición
		
		char caracter = frase.charAt(0);
		
		// Obtener posición del caracter
		
		int posicion = frase.indexOf("t");
		
		frase.toUpperCase();		// OJO! Esto no cambia nada! Simplemente devuelve un nuevo String
		
		System.out.println(frase);  // La frase es inmutable
		
		System.out.println("Numero de caractres: " +  numeroCaracteres);
		System.out.println("Contiene you: " +  contiene);
		System.out.println("Subcadena desde 2 a 5: " +  subcadena);
		System.out.println("Caracter en posicion 0: " +  caracter);
		System.out.println("Posición de l t: " +  posicion);
		
		// Cambiar una parte del String por otra
		
		System.out.println(frase.replace("a", "*"));
		
		// Obtner un string en mayúsculas...
		
		System.out.println(frase.toUpperCase());
		
	}
	
	private static void demoConversion() {
		
		System.out.println("\n*********************** Demo Conversion ****************************\n");
		
		// Típico convertir un String a un numero (int, long, double) necesitaremos de clases envoltorio
		
		// Conversión a int...
		
		Integer numeroPuertas = null;   // esta
		Double d1 = null;				// esta
		Long l1 = null;
		Short s1 = null;
		Byte b1 = null;
		
		Boolean aprobado = null;		// esta
		Character c1 = null;
		Float f = null;
		
		Integer i1 = new Integer(10);  // deprecated
		Integer i2 = 10;			   // Autoboxing   
		
		Number numero = 2003;		// Integer "envuelve" a un int. Patrón de diseño Wrapper.
		
		Integer numeroInteger = 40;
			
		String nombre1 = "Pepín";
		String nombre2 = new String("Pepín"); // Hay una muy muy sutil diferencia
		
		// ****************** EJEMPLO *******************
		
		int numero1 = Integer.parseInt("100000");
		double numero2 = Double.parseDouble("445.4");
		long numero3 = Long.parseLong("10000000000");
		
		Integer numero4 = Integer.valueOf("100000");   // Observar diferencia de parseInt vs valueOf
		
		boolean correcto = Boolean.parseBoolean("true");
		
		System.out.println("numero1: " + numero1);
		System.out.println("numero2: " + numero2);
		System.out.println("numero3: " + numero3);
		
		System.out.println("correcto: " + correcto);
		
		// **************************************************
		
		// Conversión de un String a una fecha (Date)
		

		// Date es una clase muy antigua.... 90% de sus métodos son deprecated
		
		// API de fechas se llama JodaTime ahora mismo es substituida por una nueva API de java que se incorporó con la versión 8
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date fecha = sdf.parse("23/10/2020");
			System.out.println(fecha);
		} catch(Exception e) {
			System.out.println("Lo sentimos mucho... algo ha ido mal...");
		}
	
	}
	
	private static void demoArray() {
		
		System.out.println("\n*********************** Demo Arrays ****************************\n");
		
		int[] numeros1 = new int[4];  			// [0, 0, 0, 0]
		int[] numeros2 = new int[] {3, -4};		// [3, -4]
		int[] numeros3 = {100, 0, -6};			// [100, 0, -6]
		
		// Cómo se itera un array con el for "clásico"
		
		for(int i = 0; i < numeros3.length; i++) {
			System.out.println(i + ": " + numeros3[i]);
		}
		
		// Iteración de array con "for each"
		
		System.out.println("\n");
		
		for(int numero: numeros3) {
			System.out.println(numero);
		}
		
		// Nos interesa mostrar "de un plumazo" el array por la consola....
		
		System.out.println("\n");
		
		System.out.println(numeros1);  					// no funciona
		System.out.println(Arrays.toString(numeros1));	// sí funciona
		System.out.println(Arrays.toString(numeros2));	// sí funciona
		
		// Intento de acceder a una posición de un elemento inexistente
		
		// System.out.println(numeros3[20]);    // Esto causa el lanzamiento de una exception
		
		// Pueden haber arrays de arrays de arrays de arrays de arrays...
		
		double [][] superArray = {{55.9, 10.4, 2.56E-12}, {10.3}, {10.2, 4.2, 9.02}, {}};
		
		/*
		 * superArray => {arr1, arr2, arr3, arr4 }
		 * 
		 * arr1 => {55.9, 10.4, 2.56E-12}
		 * arr2 => {10.3}
		 * arr3 => {10.2, 4.2, 9.02}
		 * arr4 => {}
		 */
			
		double elemento = superArray[2][2];
		
		System.out.println("elemento: " + elemento);
		
		// Se pueden declarar arrays de arrays de una manera "peculiar"...
		
		String[] superArray2[] = { {"Honorio", "Carlota"}, {"Anna", "Pepín"} };
		int[][][][] arrayRaro = null;		
	}
	
	private static void demoFor() {
		
		System.out.println("*********************** Demo For 'clasico' ****************************\n");
		
OUTER:	for(int i = 0; i < 9 ; i++ ){
	    	for(int k = 0; k < 9; k++) {
	    		System.out.println(i + " x " + k + " = " + (i * k));
	    		if(k == 4) {
	    			break OUTER;
	    		}
	        }
		}

		System.out.println("\n ****** n");
	
		for(int i = 0; i < 9 ; i++ ){
			for(int k = 0; k < 9; k++) {
				if(k == 4) {
					continue;			// En verdad hace lo contrario! :-)   En verdad NO continua...
				}
				// aqui
				System.out.println(i + " x " + k + " = " + (i * k));
        	}
		}
		
	}
	
	private static void demoWhile() {
		
		System.out.println("*********************** Demo While ****************************\n");
		
		int contador = 0;
		
		while(contador < 6) {
			
			System.out.println("contador: " + contador);
			
			//contador = contador + 1;
			//++contador;
			//contador++;
			contador += 1;
			
			if (contador == 3) {
				break;				// MALA PRÁCTICA (spagethi code)
			}
			
		}
		
		// Para garantizar la ejecución del bloque de código como mínimo una vez utilizaremos el do-while
		
		do {
			
			System.out.println("-> " + contador);
			
			contador++;
			
		} while(contador < 6);
		
	}
	
	private static void demoOperadorTernario() {
		
		System.out.println("\n*********************** Demo Operador Ternario ****************************\n");
		
		String resultado = "";
		int nota = 6;
		
		// *********************************
		
		if(nota >= 5) {
			resultado = "APROBADO";
		} else {
			resultado = "SUSPENDIDO";
		}
		
		// *********************************
		
		resultado = nota >= 5 ? "APROBADO" : "SUSPENDIDO";
			
		System.out.println(resultado);
		
	}
	
	private static void demoIf() {
		
		System.out.println("\n*********************** Demo If ****************************\n");
		
		if(Math.random() > 0.5) {
			System.out.println("Número mayor que 0.5");
		} else {
			System.out.println("Número menor que 0.5");
		}
		
		boolean permisoConcedido = true;
		
	//	if(permisoConcedido == true) {    // MALA PRÁCTICA
		if(permisoConcedido) {
			System.out.println("Permiso concedido...");
		}
		
		boolean condicion1 = true;
		boolean condicion2 = false;
		
		// Operadores lógicos tipo AND (&&)  Nunca utilizar (&)
		
		if (condicion1 && condicion2) {
			System.out.println("se cumplen las dos condiciones");
		} else {
			System.out.println("no se cumplen las dos condiciones");
		}
		
		// Operadores lógicos tipo OR (||)  Nunca utilizar (|)
		
		if (condicion1 || condicion2) {
			System.out.println("se cumplen las dos condiciones");
		} else {
			System.out.println("no se cumplen las dos condiciones");
		}
			
	}


}
