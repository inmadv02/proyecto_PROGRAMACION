package principal;

import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasTitulo;
import controller.ControllerPartida;
import controller.ControllerPersonaje;
import crud.CrudMochila;
import crud.CrudObjetos;
import model.Personaje;
import utilidades.Leer;
import datos.DatosEnemigos;
import datos.DatosMapa;
import model.Mochila;
import model.Objetos;
import datos.DatosObjetos;
import datos.DatosTasks;
import vistas.VistasMochila;
import crud.CrudPersonaje;
import crud.CrudTasks;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, op2, cero = 0, usar;
		char nombreJ;
		Personaje p;
		int vida = 30, fuerza = 30,index = 0, opPelea;
		DatosMapa m = new DatosMapa();
		//Objetos [] objetos = new Objetos [DatosObjetos.mascarilla, DatosObjetos.pulverizador, DatosObjetos.gel, DatosObjetos.papel, DatosObjetos.harina, DatosObjetos.mecha];
		CrudPersonaje crp = new CrudPersonaje();
		DatosObjetos dob = new DatosObjetos();
		DatosTasks dtk = new DatosTasks();
		char a, enter;

		Mochila mc = new Mochila (datos.DatosObjetos.getObjetos());

		VistasTitulo.imprimirTitulo();
		
		
		System.out.println();	
		System.out.println("\t \t \t       _________________________");
		System.out.println("\t \t \t      |\t\t\t\t|");
		System.out.println("\t \t \t      | [1] Nueva partida       |");
		System.out.println("\t \t \t      | [2] Cómo jugar          |");
		System.out.println("\t \t \t      | [0] Salir del juego     |");
		System.out.println("\t \t \t      |_________________________|");
		System.out.println();
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			
			VistasHistoria.imprimirIntro();
			
			System.out.println("Di tu nombre. Debe contener solo una letra");
			nombreJ = Leer.datoChar();

			
			p = new Personaje (nombreJ, 10, 30, 1, 1,0);
				
				VistasHistoria.imprimirPantallaCarga();
				System.out.println("Pulse enter para continuar.");
				enter = Leer.datoChar();
				VistasHistoria.imprimirMisionInicio(dob.objetos);
				System.out.println("Pulse enter para continuar.");
				enter = Leer.datoChar();
				System.out.println(p);
				System.out.println();
				System.out.println();
				VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
				System.out.println();
				System.out.println();
				System.out.println("Acabas de entrar en Mercadona. Debido a la situación caótica que te rodea,\n"
						+ "todo está desordenado. Tienes poco tiempo para comprar antes de que llegue\nalguna "
						+ "persona infectada.");
				System.out.println("Por eso, te hemos facilitado las tareas que debes completar:");
				System.out.println();
				VistasHistoria.imprimirTasks(DatosTasks.getTasks());
				System.out.println();
				System.out.println("Que la fuerza te acompañe.");
				System.out.println();
				System.out.println();
				System.out.println("Introduce algún movimiento:");
				
				while(ControllerPartida.comprobarGanador(p) && ControllerPersonaje.comprobarVidaJugador(p)) {
					
					a= Leer.datoChar();
					VistasMapa.moverJugador(p, a);
					VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
				
					if(ControllerPersonaje.comprobarPosicion(p, DatosEnemigos.getListaEnemigos())) {
					
						index = ControllerPersonaje.posicionEnemigos(p);
						System.out.println();
						System.out.println("Al entrar en el pasillo, te has encontrado con "+DatosEnemigos.getListaEnemigos()[index].getNombre());
						System.out.println(DatosEnemigos.getListaEnemigos()[index]);
						VistasHistoria.imprimirAccionEnemigo(index);
						System.out.println("¿Qué des lo que quieres hacer?");
						System.out.println("1.-Pelear.\n2.-Usar objeto.");
						opPelea = Leer.datoInt();
						
						
						switch (opPelea) {
							
							case 1:
									
								System.out.println("Parece que ha usado el ataque "+ DatosEnemigos.getListaEnemigos()[index].getAtaque());
								
								while(DatosEnemigos.getListaEnemigos()[index].getVida() >= 0) {
									
									ControllerPersonaje.pelear(p, DatosEnemigos.getListaEnemigos(),index);
									System.out.println("Te ha quitado "+DatosEnemigos.getListaEnemigos()[index].getFuerza()+ " de vida.");
								}
								
								if (ControllerPersonaje.comprobarVidaJugador(p)) {
									
									ControllerPersonaje.sumarContadorMuertes(p);
									System.out.println(p);
									System.out.println("Has ganado la pelea y has conseguido \n"+ DatosEnemigos.getListaEnemigos()[index].getObjeto());
									CrudMochila.ganarObjeto(DatosEnemigos.getListaEnemigos(), DatosObjetos.getObjetos());
									VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
									System.out.println("Te quedan todavía estas tareas: ");
									CrudTasks.desactivarTasks(DatosTasks.getTasks(), DatosEnemigos.getListaEnemigos());
									VistasHistoria.imprimirTasks(DatosTasks.getTasks());
									System.out.println("Vuelva a introducir movimiento: ");
								}
								
									
								break;
									
							case 2:
									
								System.out.println("Elige el objeto que quieras");
								VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
								usar = Leer.datoInt();
								CrudObjetos.borrarObjeto(usar, DatosObjetos.getObjetos());
								VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
								CrudPersonaje.modificarFuerzayVidaObj(p,DatosObjetos.getObjetos(),usar);
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

					
			break;
			
		case 2:
			System.out.println("En mantenimiento. Volver después.");
			
			break;
			
		case 0:
			
			System.out.println("\n \t \t \t    C E R R A N D O   J U E G O\n");
			break;
			
		default:
			
			System.out.println("Opción incorrecta. Prueba de nuevo.");
		
		}
		
//	}while(op!=0);
		
		

		
		
		//System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
