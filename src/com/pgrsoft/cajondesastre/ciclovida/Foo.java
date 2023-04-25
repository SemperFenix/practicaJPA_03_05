package com.pgrsoft.cajondesastre.ciclovida;

public class Foo {
	
	static {			// 2
		n1 = 444;
		System.out.println("bloque static 1");
	}
	
	static int n1 = 666;   // 1
	int n2 = 500;          // 4, 8  12     
	
	{		//5 9 13
		n2 = -20;
		System.out.println("bloque pululante 1");
	}
		
	public Foo() {
		
		// 7 11 15
		n2 = 2000;
		System.out.println("Constructor");
	}
	
	
	{  // 6 10 14
		n2 = 40;
		System.out.println("bloque pululante 2");
	}
	
	static {  // 3
		System.out.println("bloque static 2");
		n1 = 50;
	}

}

// bloque static 1
// bloque static 2
