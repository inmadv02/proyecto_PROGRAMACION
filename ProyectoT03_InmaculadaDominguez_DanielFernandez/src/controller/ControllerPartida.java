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
	
	public static void actualizarPartida(char [][]mapaNuevo, Enemigo[]listaEnemigos, Tasks[]listaTareas,Objetos[]listaObjetos, Personaje p) {
		
		DatosMapa.setMapa(mapaNuevo);
		DatosEnemigos.setListaEnemigos(listaEnemigos);
		DatosObjetos.setObjetos(listaObjetos);
		p.setVida(20);
		p.setPosI(1);
		p.setPosJ(1);
		
		for (int i = 0; i < listaTareas.length; i++) {
			
			listaTareas[i].setActivo(true);
		}
		
		
		
	}

}
