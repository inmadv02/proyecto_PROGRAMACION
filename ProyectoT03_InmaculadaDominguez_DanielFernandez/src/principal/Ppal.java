package principal;

import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasTitulo;
import controller.ControllerMochila;
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
		
		/*
		 * El trabajo ha sido realizado por Inmaculada Domínguez y Daniel Fernández.
		 * 
		 * Nos hemos repartido el trabajo de la siguiente forma:
		 * 
		 * Ambos: Main,DatosEnemigos,DatosMapa,DatosObjetos,Model
		 * Inma:ControllerObjeto,CrudEnemigo,CrudObjetos,CrudTasks,CrudMochila,DatosTasks,VistaHistoria,VistaMochila,VistaTitulo
		 * Dani:ControllerEnemigo,ControllerPartida,ControllerPersonaje,ControllerMochila,CrudPersonaje,VistaMapa
		 * 
		 * 
		 *   
		 * 
		 * 
		 * */
		
		
		int op, op2, cero = 0, usar, contadorPelea = 0, uno = 1, dos = 2, vida = 50, fuerza = 20,index = 0, opPelea;
		char nombreJ, a, enter;
		Personaje p;
		p = new Personaje (vida, fuerza, uno, uno, cero);
		
		

		VistasTitulo.imprimirTitulo();
		
		do {
			
		ControllerPartida.actualizarPartida(DatosMapa.getMapa(), DatosMapa.getMapaNuevo(), DatosEnemigos.getListaEnemigos(), DatosEnemigos.getListaEnemigosNueva(), DatosTasks.getTasks(), DatosObjetos.getObjetos(), DatosObjetos.getObjetosNuevos(), p);
			
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
			
			System.out.println("\t \t      Di tu nombre. Debe contener solo una letra");
			nombreJ = Leer.datoChar();

			p.setNombre(nombreJ);
				
				VistasHistoria.imprimirPantallaCarga();
				System.out.println("Pulse enter para continuar.");
				enter = Leer.datoChar();
				VistasHistoria.imprimirMisionInicio(DatosObjetos.objetos);
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
				VistasHistoria.imprimirTasks(DatosTasks.getTasks());
				System.out.println();
				System.out.println("Que la fuerza te acompañe.");
				System.out.println();
				System.out.println();
				System.out.println();
				VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
				System.out.println();
				System.out.println("Introduce algún movimiento:");
				
				
				while(ControllerPartida.comprobarGanador(p) && ControllerPersonaje.comprobarVidaJugador(p)) {
					
					a= Leer.datoChar();
					VistasMapa.moverJugador(p, a);
					VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
				
					if(ControllerPersonaje.comprobarPosicion(p, DatosEnemigos.getListaEnemigos())) {
					
						index = ControllerPersonaje.posicionEnemigos(p);
						System.out.println();
						System.out.println();
						System.out.println("Al entrar en el pasillo, te has encontrado con "+DatosEnemigos.getListaEnemigos()[index].getNombre() +  ".");
						System.out.println(DatosEnemigos.getListaEnemigos()[index]);
						System.out.println();
						System.out.println();
						VistasHistoria.imprimirAccionEnemigo(index);
						System.out.println();
						
					do {
						
						System.out.println("¿Qué es lo que quieres hacer?");
						System.out.println("1.-Pelear.\n2.-Usar objeto.");
						System.out.println();
						System.out.println(p);
						opPelea = Leer.datoInt();
						
						
						switch (opPelea) {
							
							case 1:
									
								System.out.println("Parece que ha usado el ataque "+ DatosEnemigos.getListaEnemigos()[index].getAtaque());
								
								while(DatosEnemigos.getListaEnemigos()[index].getVida() >= cero) {
									
									ControllerPersonaje.pelear(p,DatosEnemigos.getListaEnemigos(),index);
									contadorPelea++;
									
								}
								
								System.out.println("Te ha quitado "+DatosEnemigos.getListaEnemigos()[index].getFuerza() * contadorPelea+ " de vida.");
								contadorPelea = cero;
								
								if (ControllerPersonaje.comprobarVidaJugador(p)) {
									
									System.out.println();
									VistasHistoria.imprimirAccionPersonaje(index);
									ControllerPersonaje.sumarContadorMuertes(p);
									System.out.println();
									System.out.println(p);
									System.out.println();
									System.out.println("Has ganado la pelea y has conseguido: \n \n"+ DatosEnemigos.getListaEnemigos()[index].getObjeto());
									CrudMochila.ganarObjeto(DatosEnemigos.getListaEnemigos(), DatosObjetos.getObjetos());
									VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
									System.out.println();
									System.out.println();
									System.out.println();
									CrudTasks.desactivarTasks(DatosTasks.getTasks(), DatosEnemigos.getListaEnemigos());
									VistasHistoria.imprimirTasks(DatosTasks.getTasks());
									System.out.println();
									System.out.println();
									System.out.println("Vuelve a introducir movimiento: ");
									System.out.println();
									VistasMapa.imprimirMapa(DatosMapa.getMapa(),p);
								}
								
									
								break;
									
							case 2:
								
								
								if(ControllerMochila.comprobarMochilaVacia(DatosObjetos.getObjetos())) {

								
									System.out.println("Elige el objeto que quieras.");
									VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
									usar = Leer.datoInt();
									VistasMochila.imprimirObjetoUsado(DatosObjetos.getObjetos(), usar);
									VistasMochila.imprimirAccionObjeto(DatosObjetos.getObjetos(), usar);
									System.out.println();
									System.out.println();
									CrudObjetos.borrarObjeto(usar, DatosObjetos.getObjetos());
									VistasMochila.imprimirMochilaUpdate(DatosObjetos.getObjetos());
									CrudPersonaje.modificarFuerzayVidaObj(p,DatosObjetos.getObjetos(),usar);
									System.out.println();
									System.out.println(p);
									System.out.println();
									System.out.println();
									System.out.println("\t \t--Este objeto no volverá a aparecer en la mochila--");
									System.out.println();
									
								
								}else {
									
									System.out.println("No te quedan más objetos de momento");
								}
								
								
								break;
									
							default:
								System.out.println("Opción incorrecta. Vuelve a intentarlo.");
								break;
								
						}
						
					}while(opPelea != uno);
				}
			}
				
			if(ControllerPartida.comprobarGanador(p)) {
				
				VistasHistoria.imprimirDerrota();
				
			}else {
			
				VistasHistoria.imprimirFinalAlternativo();
				op2 = Leer.datoInt();
				
				switch(op2) {
				
					case 1:
						VistasHistoria.imprimirFinalAlternativo1();
						VistasHistoria.imprimirFin();
						break;
						
					case 2:
						VistasHistoria.imprimirFinalAlternativo2();
						VistasHistoria.imprimirFin();
						break;
						
					default:
						System.out.println("Opción incorrecta. Inténtalo de nuevo.");
						break;
				}
				
			}

					
			break;
			
		case 2:
			VistasHistoria.imprimirInstrucciones();
			
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
