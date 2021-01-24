package principal;

import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasTitulo;
import controller.ControllerPartida;
import controller.ControllerPersonaje;
import crud.CrudObjetos;
import model.Personaje;
import utilidades.Leer;
import datos.DatosMapa;
import model.Mochila;
import model.Objetos;
import datos.DatosObjetos;
import datos.DatosTasks;
import vistas.VistasMochila;
import crud.CrudPersonaje;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, op2, cero = 0, usar;
		char nombreJ;
		Personaje p;
		int vida = 30, fuerza = 30;
		DatosMapa m = new DatosMapa();
		//Objetos [] objetos = new Objetos [DatosObjetos.mascarilla, DatosObjetos.pulverizador, DatosObjetos.gel, DatosObjetos.papel, DatosObjetos.harina, DatosObjetos.mecha];
		CrudPersonaje crp = new CrudPersonaje();
		DatosObjetos dob = new DatosObjetos();
		DatosTasks dtk = new DatosTasks();
		char a;

		Mochila mc = new Mochila (datos.DatosObjetos.getObjetos());

		VistasTitulo.imprimirTitulo();
		
		do {
		
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

			
			p = new Personaje (nombreJ, 50, 30, 1, 1,0);
			
			System.out.println("Pulsa 1 para empezar.");
			
			op2 = Leer.datoInt();
			
			switch (op2) {
			
			case 1:
				
				VistasHistoria.imprimirPantallaCarga();
				VistasHistoria.imprimirMisionInicio(dob.objetos);
				System.out.println(p);
				System.out.println();
				
				VistasMapa.imprimirMapa(m.getMapa(),p);

				a= Leer.datoChar();
				VistasMapa.moverJugador(p, a);
				VistasMapa.imprimirMapa(m.getMapa(),p);
				
				do{
					
					a= Leer.datoChar();
					VistasMapa.moverJugador(p, a);
					VistasMapa.imprimirMapa(m.getMapa(),p);
					VistasHistoria.imprimirTasks(dtk.getTasks());
		
				
					System.out.println("¿Qué objeto quieres usar?");
					VistasMochila.imprimirMochilaInicio(dob.getObjetos());
					usar = Leer.datoInt();
					CrudObjetos.borrarObjeto(usar, dob.getObjetos());
					VistasMochila.imprimirMochilaUpdate(dob.getObjetos());
					crp.modificarFuerzayVidaObj(p, dob.getObjetos(), usar);
					System.out.println(p);
					
					
				}while(ControllerPartida.comprobarGanador(p));
					
				break;
				
			default:
				
				System.out.println("Opción incorrecta. Prueba de nuevo.");
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
		
		}while (op != cero);
		

		
		
		//System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
