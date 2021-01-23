package principal;

import controller.ControllerPartida;
import controller.ControllerPersonaje;
import crud.CrudObjetos;
import crud.CrudPersonaje;
import datos.DatosEnemigos;
import datos.DatosMapa;
import datos.DatosObjetos;
import model.Personaje;
import utilidades.Leer;
import vistas.VistasMapa;
import vistas.VistasMochila;

public class PpalPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Personaje p;
		char a;
		int index = 0, opPelea,opObjeto;
		
		p = new Personaje ('a',20,20,1,1,0);
		
		VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
		
		System.out.println();
		
		while(ControllerPartida.comprobarGanador(p) && ControllerPersonaje.comprobarVidaJugador(p)) {
			
					a= Leer.datoChar();
					VistasMapa.moverJugador(p, a);
					VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
					
			if(ControllerPersonaje.comprobarPosicion(p, DatosEnemigos.getListaEnemigos())) {
					
				System.out.println("Opciones 1.-Pelear/2.-Usar objeto");
				opPelea = Leer.datoInt();
					
				switch (opPelea) {
					
					case 1:
							
							
						index = ControllerPersonaje.posicionEnemigos(p);
						System.out.println(DatosEnemigos.getListaEnemigos()[index]);
		
						ControllerPersonaje.pelear(p, DatosEnemigos.getListaEnemigos(),index);
						ControllerPersonaje.sumarContadorMuertes(p);
						System.out.println(p);
						System.out.println("Vuelva a introducir movimiento: ");
							
						break;
							
					case 2:
							
						System.out.println("Elige el objeto que quieras");
						VistasMochila.imprimirMochilaInicio(DatosObjetos.getObjetos());
						opObjeto = Leer.datoInt();
						CrudObjetos.borrarObjeto(opObjeto, DatosObjetos.getObjetos());
						VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos(), opObjeto);
						CrudPersonaje.modificarFuerzayVidaObj(p,DatosObjetos.getObjetos(),opObjeto);
						System.out.println("vida actualizada :"+p);
						
						ControllerPersonaje.pelear(p, DatosEnemigos.getListaEnemigos(),index);
						ControllerPersonaje.sumarContadorMuertes(p);
						System.out.println(p);
						System.out.println("Vuelva a introducir movimiento: ");
						break;
							
					default:
						System.out.println("dakjdfbsd");
						break;
						
				}
			}
		}
			
		if(ControllerPartida.comprobarGanador(p)) {
			
			System.out.println("Has perdido");
			
		}else {
		
			System.out.println("Has ganado");
		}

	}

}
