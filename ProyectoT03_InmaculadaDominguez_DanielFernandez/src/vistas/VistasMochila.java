package vistas;

import model.Objetos;
import datos.DatosObjetos;
import crud.CrudObjetos;

public class VistasMochila {
	
	public static void imprimirMochilaInicio (Objetos [] objetos) {		
		
		int uno = 1;
		int tres = 3;
		System.out.println();
		System.out.println();
		System.out.println("\t \t ============================================================");
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t||  Nombre\t \t \tVida \t \t Fuerza\t    ||");
		System.out.println("\t \t|| \t \t \t  \t    \t    \t   \t    ||");
		
		for (int i = 0; i < tres; i++) {
			
			System.out.println("\t \t|| ["+ (i+uno) +"] " + objetos[i].getNombre()+ "\t  \t " 
			+ objetos[i].getBonusVida() + "\t \t   " + objetos[i].getBonusFuerza() + " \t    ||");
		
		}
	
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t ============================================================");
	
	}
	
	public static void imprimirMochilaUpdate (Objetos [] objetos) {		
		
		int contador = 0;
		System.out.println();
		System.out.println();
		System.out.println("\t \t ============================================================");
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t||  Nombre\t \t \tVida \t \t Fuerza\t    ||");
		System.out.println("\t \t|| \t \t \t  \t    \t    \t   \t    ||");
		
		for (int i = 0; i < objetos.length; i++) {
			
			if (objetos[i].isActivo() == true) {
				
				contador++;
			
			System.out.println("\t \t|| ["+ contador +"] " + objetos[i].getNombre()+ "\t  \t " 
			+ objetos[i].getBonusVida() + "\t \t   " + objetos[i].getBonusFuerza() + " \t    ||");
			
			}
		}
		
		System.out.println("\t \t||\t \t \t  \t    \t    \t   \t    ||");
		System.out.println("\t \t ============================================================");
	
	}
}
