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
	
	public static void pelear(Personaje p ,Personaje p1) {
			
			p.setVida(p.getVida()-p1.getFuerza());	
			
	}
	
	public static void sumarContadorMuertes(Personaje p) {
		
		int uno = 1;
		
		p.setContadorMuertes(p.getContadorMuertes()+uno);
	}
	
	public static boolean comprobarPosicion (Personaje p, Personaje p1) {
		
		boolean b = false;
		
		if (p.getPosI() == p1.getPosI() && p.getPosJ() == p1.getPosJ()) {
			
			b = true;
			
			return 	b;
			
		}else {
			
			return b;
		}
			
	}
	
	
	
	

}
