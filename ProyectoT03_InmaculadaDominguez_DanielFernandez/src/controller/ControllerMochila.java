package controller;

import model.Objetos;

public class ControllerMochila {

	
	public static boolean comprobarMochilaVacia (Objetos[]listaObjetos) {
		
		boolean b = false;
		int contadorObjetos = 0, cero = 0;
		
		for (int i = 0; i < listaObjetos.length; i++) {
			
			if (listaObjetos[i].isActivo() == true) {
				
				contadorObjetos++;	
			}	
		}
		
		if (contadorObjetos == cero) {
			
			b = false;
			
		}else {
			
			b = true;
		}
		
		return b;
	}
}
