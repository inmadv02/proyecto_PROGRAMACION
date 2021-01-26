package controller;

import datos.DatosEnemigos;
import datos.DatosMapa;
import datos.DatosObjetos;
import model.Enemigo;
import model.Mapa;
import model.Objetos;
import model.Personaje;
import model.Tasks;

public class ControllerPartida {
	
	public static boolean comprobarGanador(Personaje p) {
		
		boolean b = true;
		int tres = 3, uno = 1;
		
		if (p.getContadorMuertes() == tres && p.getPosI() ==uno  && p.getPosJ() ==uno ) {
			
			b = false;	
		}
			
			return b;
		
			
	}
	
	
	public static void actualizarPartida(char[][]mapa,char [][]mapaNuevo, Enemigo[]listaEnemigos,Enemigo[]listaEnemigosNueva, Tasks[]listaTareas,Objetos[]listaObjetos,Objetos[]listaObjetosNueva, Personaje p) {
		
		int cero = 0;
		
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) {
				
				mapa [i][j] = mapaNuevo[i][j];
			}
		}
		
		for (int i = 0; i < listaEnemigos.length; i++) {
			
			//listaEnemigos[i] = listaEnemigosNueva[i];
			
			listaEnemigos[i].setActivo(true);
			listaEnemigos[i].setVida(listaEnemigosNueva[i].getVida());
			
		}
		
		for (int i = 0; i < listaObjetos.length; i++) {
			
			listaObjetos[i] = listaObjetosNueva[i];
			
		}
		
		for (int i = 0; i < listaTareas.length; i++) {
			
			listaTareas[i].setActivo(true);
		}
		
		p.setContadorMuertes(cero);
		
		
		
	}

}
