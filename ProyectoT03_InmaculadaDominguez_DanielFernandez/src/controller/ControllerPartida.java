package controller;

import model.Personaje;

public class ControllerPartida {
	
	public static boolean comprobarGanador(Personaje p) {
		
		boolean b = true;
		int tres = 3;
		
		if (p.getContadorMuertes() == tres && p.getPosI() ==1  && p.getPosJ() ==1 ) {
			
			b = false;
			
			return b;
			
		}else {
			
			return b;
		}
			
	}

}
