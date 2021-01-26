package principal;

import controller.ControllerPartida;
import controller.ControllerPersonaje;
import crud.CrudMochila;
import crud.CrudObjetos;
import crud.CrudPersonaje;
import crud.CrudTasks;
import datos.DatosEnemigos;
import datos.DatosMapa;
import datos.DatosObjetos;
import datos.DatosTasks;
import model.Personaje;
import utilidades.Leer;
import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasMochila;
import vistas.VistasTitulo;

public class PpalPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, op2, cero = 0, usar, contadorPelea = 0, uno = 1, dos = 2, vida = 40, fuerza = 30,index = 0, opPelea;
		char nombreJ, a, enter;
		Personaje p;
		DatosObjetos datosObjetos = new DatosObjetos();
		DatosTasks datosTareas = new DatosTasks();
		DatosEnemigos datosEnemigos = new DatosEnemigos();
		DatosMapa datosMapa = new DatosMapa();
		VistasHistoria vistaHistoria = new VistasHistoria();
		VistasTitulo vistaTitulo = new VistasTitulo();
		VistasMapa vistaMapa = new VistasMapa();
		VistasMochila vistaMochila = new VistasMochila();
		ControllerPartida conPartida = new ControllerPartida();
		ControllerPersonaje conPersonaje = new ControllerPersonaje();
		CrudMochila crudMochila = new CrudMochila ();
		CrudTasks crudTareas = new CrudTasks ();
		CrudPersonaje crudPersonaje = new CrudPersonaje();
		CrudObjetos crudObjeto = new CrudObjetos();

		vistaTitulo.imprimirTitulo();
		
		p = new Personaje (vida, fuerza, uno, uno, cero);
		
		do {
			
		conPartida.actualizarPartida(datosMapa.getMapa(), datosMapa.getMapaNuevo(), datosEnemigos.getListaEnemigos(), datosEnemigos.getListaEnemigosNueva(), datosTareas.getTasks(), datosObjetos.getObjetos(), datosObjetos.getObjetosNuevos(), p);
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
			
			vistaHistoria.imprimirIntro();
			
			System.out.println("Di tu nombre. Debe contener solo una letra");
			nombreJ = Leer.datoChar();

			
			p.setNombre(nombreJ);
				
				vistaHistoria.imprimirPantallaCarga();
				System.out.println("Pulse enter para continuar.");
				enter = Leer.datoChar();
				vistaHistoria.imprimirMisionInicio(datosObjetos.objetos);
				System.out.println("Pulse enter para continuar.");
				enter = Leer.datoChar();
				System.out.println();
				System.out.println(p);
				System.out.println();
				System.out.println();
				System.out.println("Acabas de entrar en Mercadona. Debido a la situación caótica que te rodea,\n"
						+ "todo está desordenado. Tienes poco tiempo para comprar antes de que llegue\nalguna "
						+ "persona infectada.");
				System.out.println("Por eso, te hemos facilitado las tareas que debes completar:");
				System.out.println();
				vistaHistoria.imprimirTasks(datosTareas.getTasks());
				System.out.println();
				System.out.println("Que la fuerza te acompañe.");
				System.out.println();
				System.out.println();
				System.out.println();
				vistaMapa.imprimirMapa(datosMapa.getMapa(),p);
				System.out.println();
				System.out.println("Introduce algún movimiento:");
				
				
				while(conPartida.comprobarGanador(p) && conPersonaje.comprobarVidaJugador(p)) {
					
					a= Leer.datoChar();
					vistaMapa.moverJugador(p, a);
					vistaMapa.imprimirMapa(DatosMapa.getMapa(),p);
				
					if(conPersonaje.comprobarPosicion(p, datosEnemigos.getListaEnemigos())) {
					
						index = conPersonaje.posicionEnemigos(p);
						System.out.println();
						System.out.println();
						System.out.println("Al entrar en el pasillo, te has encontrado con "+datosEnemigos.getListaEnemigos()[index].getNombre() +  ".");
						System.out.println(datosEnemigos.getListaEnemigos()[index]);
						System.out.println();
						System.out.println();
						vistaHistoria.imprimirAccionEnemigo(index);
						System.out.println();
						
					do {
						
						System.out.println("¿Qué es lo que quieres hacer?");
						System.out.println("1.-Pelear.\n2.-Usar objeto.");
						System.out.println();
						System.out.println(p);
						opPelea = Leer.datoInt();
						
						
						switch (opPelea) {
							
							case 1:
									
								System.out.println("Parece que ha usado el ataque "+ datosEnemigos.getListaEnemigos()[index].getAtaque());
								
								while(datosEnemigos.getListaEnemigos()[index].getVida() >= cero) {
									
									conPersonaje.pelear(p,datosEnemigos.getListaEnemigos(),index);
									contadorPelea++;
									
								}
								
								System.out.println("Te ha quitado "+datosEnemigos.getListaEnemigos()[index].getFuerza() * contadorPelea+ " de vida.");
								contadorPelea = cero;
								
								if (conPersonaje.comprobarVidaJugador(p)) {
									
									System.out.println();
									vistaHistoria.imprimirAccionPersonaje(index);
									conPersonaje.sumarContadorMuertes(p);
									System.out.println();
									System.out.println(p);
									System.out.println();
									System.out.println("Has ganado la pelea y has conseguido: \n \n"+ datosEnemigos.getListaEnemigos()[index].getObjeto());
									crudMochila.ganarObjeto(datosEnemigos.getListaEnemigos(), datosObjetos.getObjetos());
									vistaMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
									System.out.println();
									System.out.println();
									System.out.println();
									crudTareas.desactivarTasks(datosTareas.getTasks(), datosEnemigos.getListaEnemigos());
									vistaHistoria.imprimirTasks(datosTareas.getTasks());
									System.out.println();
									System.out.println();
									System.out.println("Vuelve a introducir movimiento: ");
									System.out.println();
									vistaMapa.imprimirMapa(DatosMapa.getMapa(),p);
								}
								
									
								break;
									
							case 2:
									
								System.out.println("Elige el objeto que quieras.");
								vistaMochila.imprimirMochilaUpdate(datosObjetos.getObjetos());
								usar = Leer.datoInt();
								crudObjeto.borrarObjeto(usar, datosObjetos.getObjetos());
								vistaMochila.imprimirMochilaUpdate(datosObjetos.getObjetos());
								crudPersonaje.modificarFuerzayVidaObj(p,datosObjetos.getObjetos(),usar);
								System.out.println();
								System.out.println("Has usado " + datosObjetos.getObjetos()[usar-uno].getNombre());
								System.out.println();
								VistasHistoria.imprimirAccionObjeto(usar);
								System.out.println();
								System.out.println(p);
								System.out.println();
								System.out.println();
								System.out.println("\t \t--Este objeto no volverá a aparecer en la mochila--");
								System.out.println();
								
								
								break;
									
							default:
								System.out.println("Opción incorrecta. Vuelve a intentarlo.");
								break;
								
						}
						
					}while(opPelea != uno);
				}
			}
				
			if(conPartida.comprobarGanador(p)) {
				
				vistaHistoria.imprimirDerrota();
				
			}else {
			
				vistaHistoria.imprimirFinalAlternativo();
				op2 = Leer.datoInt();
				
				switch(op2) {
				
					case 1:
						vistaHistoria.imprimirFinalAlternativo1();
						vistaHistoria.imprimirFin();
						break;
						
					case 2:
						vistaHistoria.imprimirFinalAlternativo2();
						vistaHistoria.imprimirFin();
						break;
						
					default:
						System.out.println("Opción incorrecta. Inténtalo de nuevo.");
						break;
				}
				
			}

					
			break;
			
		case 2:
			vistaHistoria.imprimirInstrucciones();
			
			break;
			
		case 0:
			
			System.out.println("\n \t \t \t    C E R R A N D O   J U E G O\n");
			break;
			
		default:
			
			System.out.println("Opción incorrecta. Prueba de nuevo.");
		
		}
		
	}while(op!=0);
		
		

		
		
		//System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}
}


