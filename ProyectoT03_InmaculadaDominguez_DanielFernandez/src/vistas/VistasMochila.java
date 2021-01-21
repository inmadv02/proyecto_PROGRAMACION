package vistas;

import model.Objetos;
import datos.DatosObjetos;

public class VistasMochila {
	
	public static void imprimirMochila (Objetos [] objetos) {
		
		System.out.println();
		System.out.println();
		System.out.println("\t \t ============================================================");
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t||  Nombre\t \t \tVida \t \t Fuerza\t    ||");
		System.out.println("\t \t|| \t \t \t  \t    \t    \t   \t    ||");
		
		for (int i = 0; i < objetos.length; i++) {
			
		System.out.println("\t \t|| ["+ i +"] " + objetos[i].getNombre()+ "\t  \t " + objetos[i].getBonusVida() + "\t \t   " + objetos[i].getBonusFuerza() + " \t    ||");
		
		}
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t ============================================================");
	}
		

}
