package principal;

import vistas.Historia;
import vistas.Mapa;

import vistas.Titulo;

import controller.ControllerPersonaje;
import utilidades.Leer;


public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, cero = 0;
		
		
		Titulo.imprimirTitulo();
		
		do {
		
		System.out.println("\t \t \t  _________________________");
		System.out.println("\t \t \t | \t    \t    \t   |");
		System.out.println("\t \t \t | [1] Nueva partida       |");
		System.out.println("\t \t \t | [2] Cómo jugar          |");
		System.out.println("\t \t \t | [0] Salir del juego     |");
		System.out.println("\t \t \t |_________________________|");
		op = Leer.datoInt();
		
		switch (op) {
		
		case 1:
			
			Historia.imprimirIntro();
			
			Historia.imprimirPantallaCarga();
			
			Historia.imprimirMision();
		
			//Mapa.imprimirMapa();
			
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
