package principal;

import controller.ControllerPartida;
import controller.ControllerPersonaje;
import datos.DatosMapa;
import model.Personaje;
import utilidades.Leer;
import vistas.VistasMapa;

public class PpalPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, op2, cero = 0;
		char nombreJ;
		Personaje p, p1;
		int vida = 30, fuerza = 30;
		DatosMapa m = new DatosMapa();
		char a;
		
		p = new Personaje ('a',20,20,1,1,0);
		p1 = new Personaje ('b',10,10,3,3,0);

		VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
		
		System.out.println();
		
		do {
			
		
			while(true) {
				
			
				a= Leer.datoChar();
				VistasMapa.moverJugador(p, a);
				VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
				
			if(ControllerPersonaje.comprobarPosicion(p, p1)) {
				
				ControllerPersonaje.pelear(p, p1);
				ControllerPersonaje.sumarContadorMuertes(p);
				System.out.println(p);
				}
			}
			
		}while(ControllerPartida.comprobarGanador(p));
	    
	}

}
