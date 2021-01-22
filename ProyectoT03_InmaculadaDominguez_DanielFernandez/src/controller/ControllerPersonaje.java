package controller;

import java.util.Random;

import model.Enemigo;
import model.Personaje;
import datos.DatosMapa;

public class ControllerPersonaje {
	
	
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
	
	public static boolean comprobarVidaJugador(Personaje p) {
		
		boolean b = true;
		
		if(p.getVida() <= 0) {
			b = false;
		}
		return b;
	}
	
	public static int posicionEnemigos(Personaje p) {
		
		int index = 0;
		
		if (p.getPosI() == 3 && p.getPosJ() == 3) {
			index = 0;
		}
		if (p.getPosI() == 3 && p.getPosJ() == 6) {
			index = 1;
		}
		if (p.getPosI() == 3 && p.getPosJ() == 9) {
			index = 2;
		}
		
		return index;
		
	}
	
	public static void pelear(Personaje p ,Enemigo[]listaEnemigos, int index) {
			
			p.setVida(p.getVida()-listaEnemigos[index].getFuerza());	
			
	}
	
	public static void sumarContadorMuertes(Personaje p) {
		
		int uno = 1;
		
		p.setContadorMuertes(p.getContadorMuertes()+uno);
	}
	
	public static boolean comprobarPosicion (Personaje p, Enemigo [] listaEnemigos) {
		
		boolean b = false;
		
		for (int i = 0; i < listaEnemigos.length; i++) {
			
			if (p.getPosI() == listaEnemigos[i].getPosI() && p.getPosJ() == listaEnemigos[i].getPosJ() && listaEnemigos[i].isActivo() == true) {
				
				b = true;
				listaEnemigos[i].setActivo(false);
				return 	b;
				
			}
			
		}
		return b;
		
			
	}
	
	
	
	

}
