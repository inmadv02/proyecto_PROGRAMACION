package principal;

import controller.ControllerPartida;
import controller.ControllerPersonaje;
import datos.DatosEnemigos;
import datos.DatosMapa;
import model.Personaje;
import utilidades.Leer;
import vistas.VistasMapa;

public class PpalPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Personaje p;
		char a;
		int index = 0;
		
		p = new Personaje ('a',20,20,1,1,0);
		

		VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
		
		System.out.println();
		
		do {
			
		
			do {
		
					a= Leer.datoChar();
					VistasMapa.moverJugador(p, a);
					VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
					
				if(ControllerPersonaje.comprobarPosicion(p, DatosEnemigos.getListaEnemigos())) {
					
				
					index = ControllerPersonaje.posicionEnemigos(p);
					
					ControllerPersonaje.pelear(p, DatosEnemigos.getListaEnemigos(),index);
				
<<<<<<< HEAD
					ControllerPersonaje.sumarContadorMuertes(p);
					System.out.println(p);
					}
				
				
			}while(ControllerPartida.comprobarGanador(p));

		
		System.out.println("Has ganado");
		
		}while(ControllerPersonaje.comprobarVidaJugador(p));
		System.out.println("Has perdido");
=======
				ControllerPersonaje.pelear(p, p1);
				ControllerPersonaje.sumarContadorMuertes(p);
				System.out.println(p);
				}
			
			
		}while(ControllerPartida.comprobarGanador(p));

		
		System.out.println("Has ganado");
>>>>>>> f101ece78b8ee3ff9a951ee8e991184d91d83473

	}

}
