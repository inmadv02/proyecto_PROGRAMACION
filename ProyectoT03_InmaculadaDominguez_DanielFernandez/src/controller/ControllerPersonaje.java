package controller;

import java.util.Random;

import model.Personaje;
import datos.DatosMapa;

public class ControllerPersonaje {
	
	
	public static int generarVidaEnemigos() {
		
		Random r = new Random (System.nanoTime());
		int vida;
		int desde = 10 , hasta =20, uno = 1 ;
		
		vida = r.nextInt(hasta-desde-uno)+desde;
		
		return vida;
		
	}
	
	public static int generarFuerzaEnemigos() {
		
		Random r = new Random (System.nanoTime());
		int fuerza;
		int desde = 8,hasta = 10, uno = 1;
		
		fuerza = r.nextInt(hasta-desde-uno)+desde;
		
		return fuerza;
	}
	
	public static void dibujarPersonaje (Personaje p) {
		
		int posI = p.getPosI();
		int posJ = p.getPosJ();
		DatosMapa.mapa[posI][posJ] = p.getNombre();
	}
	
	public static void borrarPersonaje(Personaje p) {
		
		int posI = p.getPosI();
		int posJ = p.getPosJ();
		DatosMapa.mapa[posI][posJ] = ' '; 
	}
	
	
	
	

}
