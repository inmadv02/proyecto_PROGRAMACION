package principal;

import vistas.VistasHistoria;
import vistas.VistasMapa;
import vistas.VistasTitulo;
import controller.ControllerPersonaje;
import model.Personaje;
import utilidades.Leer;
import datos.DatosMapa;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, op2, cero = 0;
		char nombreJ;
		Personaje p;
		int vida = 30, fuerza = 30;
		DatosMapa m = new DatosMapa();
		char a;
		
		
		VistasTitulo.imprimirTitulo();
		
		do {
		
		System.out.println();	
		System.out.println("\t \t \t       _________________________");
		System.out.println("\t \t \t      |\t\t\t\t|");
		System.out.println("\t \t \t      | [1] Nueva partida       |");
		System.out.println("\t \t \t      | [2] C�mo jugar          |");
		System.out.println("\t \t \t      | [0] Salir del juego     |");
		System.out.println("\t \t \t      |_________________________|");
		System.out.println();
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			
			VistasHistoria.imprimirIntro();
			
			System.out.println("Di tu nombre. Debe contener solo una letra");
			nombreJ = Leer.datoChar();
			
			p = new Personaje (nombreJ, vida, fuerza, 1, 1);
			
			System.out.println("Pulsa 1 para empezar.");
			
			op2 = Leer.datoInt();
			
			switch (op2) {
			
			case 1:
				
				VistasHistoria.imprimirPantallaCarga();
				VistasHistoria.imprimirMision();
				System.out.println(p);
				System.out.println();
				a= Leer.datoChar();
				VistasMapa.moverJugador(p, a);
				VistasMapa.imprimirMapa(DatosMapa.getMapaPrueba(),p);
				break;
				
			default:
				
				System.out.println("Opci�n incorrecta. Prueba de nuevo.");
			}
			
			break;
			
		case 2:
			System.out.println("En mantenimiento. Volver despu�s.");
			
			break;
			
		case 0:
			
			System.out.println("\n \t \t \t    C E R R A N D O   J U E G O\n");
			break;
			
		default:
			
			System.out.println("Opci�n incorrecta. Prueba de nuevo.");
		
		}
		
		}while (op != cero);
		

		
		
		//System.out.println(ControllerPersonaje.generarFuerzaEnemigos());
	}

}
