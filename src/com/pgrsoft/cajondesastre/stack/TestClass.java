package com.pgrsoft.cajondesastre.stack;

import java.util.List;
import java.util.ArrayList;


public class TestClass {

	public static List<String> lista = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			Foo foo = new Foo();
			
			System.out.println("main antes de m1");
			foo.m1();
			System.out.println("manin una vez hemos invocado a m1");
			
		} catch(Error e) {
			// ?
		}
	
	}

}
