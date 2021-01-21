package principal;

import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasTitulo;
import controller.ControllerPersonaje;
import model.Personaje;
import utilidades.Leer;
import datos.DatosMapa;
import datos.DatosObjetos;

public class PpalPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int op, op2, cero = 0;
		char nombreJ;
		Personaje p;
		int vida = 30, fuerza = 30;
		DatosMapa m = new DatosMapa();
		char a;
		
		p = new Personaje ('a',20,20,1,1);

		VistasHistoria.imprimirPantallaCarga();
		VistasHistoria.imprimirMision();
		System.out.println(p);
		System.out.println();
		
		while(true) {
			VistasMapa.imprimirMapa(DatosMapa.getMapaPrueba(),p);
			a= Leer.datoChar();
			VistasMapa.moverJugador(p, a);
			VistasMapa.imprimirMapa(DatosMapa.getMapaPrueba(),p);
		}
		
//		VistasMapa.comprobarPosicionesValidas(DatosMapa.getMapaPrueba(), p);
		
		
		
	}

}
