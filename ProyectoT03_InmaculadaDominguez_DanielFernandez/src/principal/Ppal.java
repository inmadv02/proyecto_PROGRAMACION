package principal;

import vistas.Historia;
import vistas.Mapa;
import vistas.Titulo;
import controller.ControllerPersonaje;
import model.Personaje;
import utilidades.Leer;
import datos.DatosMapa;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, op2, cero = 0;
		String nombreJ;
		Personaje p;
		int vida, fuerza;
		DatosMapa m = new DatosMapa();
		
		
		Titulo.imprimirTitulo();
		
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
			
			Historia.imprimirIntro();
			
			System.out.println("Di tu nombre. Debe contener solo una letra");
			nombreJ = Leer.dato();
			
			vida = ControllerPersonaje.generarVidaPersonaje();
			fuerza = ControllerPersonaje.generarFuerzaPersonaje();
			
			p = new Personaje (nombreJ, vida, fuerza);
			
			System.out.println("Pulsa 1 para empezar.");
			
			op2 = Leer.datoInt();
			
			switch (op2) {
			
			case 1:
				
				Historia.imprimirPantallaCarga();
				Historia.imprimirMision();
				System.out.println(p);
				System.out.println();
				Mapa.imprimirMapa(m.getMapaPrueba());
			
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
