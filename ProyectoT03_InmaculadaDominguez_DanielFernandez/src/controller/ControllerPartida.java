package controller;

import model.Personaje;

public class ControllerPartida {
	
	public static boolean comprobarGanador(Personaje p) {
		
		boolean b = true;
		int tres = 3, uno = 1;
		
		if (p.getContadorMuertes() == tres && p.getPosI() ==uno  && p.getPosJ() ==uno ) {
			
			b = false;	
		}
			
			return b;
		
			
	}

}
