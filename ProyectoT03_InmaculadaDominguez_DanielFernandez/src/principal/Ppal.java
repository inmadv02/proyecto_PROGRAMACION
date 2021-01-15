package principal;

import vistas.Mapa;
import controller.ControllerPersonaje;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mapa.imprimirMapa();

		
		
		System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
