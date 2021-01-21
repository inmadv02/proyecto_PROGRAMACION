package vistas;

import controller.ControllerPersonaje;
import datos.DatosMapa;
import model.Personaje;

public class VistasMapa {

	
	public static void imprimirMapaInicio (char [][] mapaPrueba, Personaje p) {
		
		for (int i = 0; i < mapaPrueba.length; i++) {
			for (int j = 0; j < mapaPrueba.length; j++) { 
				
				mapaPrueba[1][1]= p.getNombre();
				
				System.out.print(mapaPrueba[i][j]);
				
			}
			
		}
		
	
	}
	
	public static void imprimirMapa (char [][] mapaPrueba, Personaje p) {
		
		ControllerPersonaje.dibujarPersonaje(p);
		
		for (int i = 0; i < mapaPrueba.length; i++) {
			
			System.out.println(mapaPrueba[i]);
			
		}
		
	
	}
	
	public static void moverJugador(Personaje p, String a) {
		
		boolean[][] posiciones;
		
		posiciones = posicionesValidas(DatosMapa.mapaPrueba);
		
		if(a == "a") {
			int posI = p.getPosI()-1;
			
			if (posiciones[p.getPosJ()][posI] == false) {
				
				ControllerPersonaje.borrarPersonaje(p);
				p.setPosI(posI);
				ControllerPersonaje.dibujarPersonaje(p);
			}
		
		}
	}
	
	
	public static void movimiento (char [][] mapaPrueba,Boolean [] [] posicionesValidas, String a, Personaje p) {
		
		int posI = 1;
		int posJ = 1;
		int uno = 1;
		
		p.setPosI(posI);
		p.setPosJ(posJ);
		
		
		mapaPrueba[p.getPosI()][p.getPosJ()] = p.getNombre();
		
		for (int i = 0; i < posicionesValidas.length; i++) {
			for (int j = 0; j < posicionesValidas.length; j++) {
				
				if(posicionesValidas[i][j]) {
					if(a == "s") {
						mapaPrueba[i][j] = ' ';
						p.setPosJ(p.getPosJ()+uno);
						mapaPrueba[p.getPosI()][p.getPosJ()] = p.getNombre();
						imprimirMapa(mapaPrueba, p);
						
					}else {
						
					System.out.println("Movimiento no válido");
					imprimirMapa(mapaPrueba,p);
					
				}
			}
		}
			
	}
		
		
		
//		if (a == "w") {
//			
//			mapaPrueba[posI][posJ] = "  ";
//			posI++;
//			mapaPrueba[posI][posJ]=p.getNombre()+ " ";
//			imprimirMapa(mapaPrueba,p);
//			
//		}
	}
		
	public static boolean [] [] posicionesValidas (char [][] mapaPrueba) {
		
		boolean [][] posicionesValidas;
		posicionesValidas = new boolean [4][4];
		
		for (int i = 0; i < posicionesValidas.length; i++) {
			for (int j = 0; j < posicionesValidas.length; j++) {
				
				if(mapaPrueba[i][j] == '*' || mapaPrueba[i][j] == '|') {
					posicionesValidas[i][j] = true;
				}else {
					posicionesValidas[i][j] = false;
				}
				
			}
			
		}
		return posicionesValidas;
	}
	
	


		
//		//Primer intento
//		for(int i = 0; i < 10; i++) {
//			System.out.print("**");
//		}
//		System.out.println();
//		
//		for(int i = 0; i < 8; i++) {
//			System.out.print("*");
//			for(int j = 0; j < 11; j++) {
//				System.out.print(" ");
//				
//				if(i == 0 && j == 1) {
//					System.out.print("\t  ");
//				}
//				
//				//Primera calle del supermercado
//				
//				if(i == 1 && j == 1) {
//					System.out.print(" ||");
//				}
//				
//				if(i == 2 && j == 1) {
//					System.out.print(" ||");
//				}
//				
//				if(i == 3 && j == 1) {
//				System.out.print(" ||");
//				
//				}
//				
//				if(i == 4 && j == 1) {
//					System.out.print(" ||");
//				}
//				
//				if(i == 5 && j == 1) {
//					System.out.print(" ||");
//				}
//				
//				//Segunda calle del super
//				
//				if(i == 1 && j == 4) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 2 && j == 4) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 3 && j == 4) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 4 && j == 4) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 5 && j == 4) {
//					System.out.print("||");
//				
//				}
//				
//				//Tercera calle del super
//				
//				if(i == 1 && j == 7) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 2 && j == 7) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 3 && j == 7) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 4 && j == 7) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 5 && j == 7) {
//					System.out.print("||");
//				
//				}
//				
//				if(i == 6 && j == 10) {
//					System.out.print("\t   ");
//				}
//				
//				if(i == 7 && j == 10) {
//					System.out.print("\t   ");
//				}
//			
//			}
//			System.out.println("* ");
//			
//		}
//		
//	
//		for(int i = 0; i < 10; i++) {
//			System.out.print("**");
//		}
//		
//		
  }



