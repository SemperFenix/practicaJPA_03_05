package com.pgrsoft.cajondesastre.trianguloderoles;

public class TestClass {

	public static void main(String[] args) {
		
		GeneradorMensajes gm = new GeneradorMensajes();
		
		String mensaje = gm.generarMensaje("Honorio Martín Salvador", "37622387T", 672);
		
		System.out.println(mensaje);

	}

}
