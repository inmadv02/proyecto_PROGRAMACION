package principal;

import vistas.Historia;
import vistas.Mapa;

import vistas.Titulo;

import controller.ControllerPersonaje;


public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Titulo.imprimirTitulo();
		
		Mapa.imprimirMapa();

		Historia.imprimirIntro();
		
		Historia.imprimirPantallaCarga();
		
		Historia.imprimirMision();
		
		//System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
