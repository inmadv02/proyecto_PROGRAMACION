package principal;

import vistas.Mapa;

import vistas.Titulo;

import controller.ControllerPersonaje;


public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Titulo.imprimirTitulo();
		
		Mapa.imprimirMapa();

		
		
		System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
