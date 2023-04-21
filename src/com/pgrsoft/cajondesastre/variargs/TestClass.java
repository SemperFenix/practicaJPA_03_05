package com.pgrsoft.cajondesastre.variargs;

import java.util.Arrays;

public class TestClass {

	public static void main(String... args) {
		
//		doSomeThing(new int[] {100, 50, -8});
		doSomeThing(100, 50, -8, 40, 10, 34);
	
	}
	
//	public static void doSomeThing(int[] numeros) {
	
	public static void doSomeThing(int primero, int... numeros) {
		
		System.out.println("primero: " + primero);
		
		System.out.println(Arrays.toString(numeros));
		
	}
	
}
