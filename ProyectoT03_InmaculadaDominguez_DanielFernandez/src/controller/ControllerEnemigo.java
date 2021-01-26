package controller;

import java.util.Random;

public class ControllerEnemigo {

	
	public static int generarFuerzaEnemigos() {
		
		Random r = new Random (System.nanoTime());
		int fuerza;
		int desde = 15,hasta = 20, uno = 1;
		
		fuerza = r.nextInt(hasta-desde-uno)+desde;
		
		return fuerza;
	}
	
	public static int generarVidaEnemigos() {
		
		Random r = new Random (System.nanoTime());
		int fuerza;
		int desde = 30,hasta = 50, uno = 1;
		
		fuerza = r.nextInt(hasta-desde-uno)+desde;
		
		return fuerza;
	}

}
