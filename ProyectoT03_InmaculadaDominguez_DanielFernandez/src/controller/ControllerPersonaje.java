package controller;

import java.util.Random;

public class ControllerPersonaje {
	
	public static int generarVidaPersonaje() {
		
		Random r = new Random (System.nanoTime());
		int vida;
		int desde = 25 , hasta =30 , uno = 1;
		
		vida = r.nextInt(hasta-desde-uno)+desde;
		
		return vida;
		
	}
	
	public static int generarFuerzaPersonaje() {
		
		Random r = new Random (System.nanoTime());
		int fuerza;
		int desde = 10,hasta = 15 , uno = 1 ;
		
		fuerza = r.nextInt(hasta-desde-uno)+desde;
		
		return fuerza;
	}
	
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
	
	
	
	

}
