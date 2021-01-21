package vistas;

import controller.ControllerPersonaje;
import datos.DatosMapa;
import model.Personaje;

public class VistasMapa {

	
	public static void imprimirMapaInicio (char [][] mapa, Personaje p) {
		
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length; j++) { 
				
				mapa[1][1]= p.getNombre();
				
				System.out.print(mapa[i][j]);
				
			}
			
		}
		
	
	}
	
	public static void imprimirMapa (char [][] mapa, Personaje p) {
		
		ControllerPersonaje.dibujarPersonaje(p);
		
		for (int i = 0; i < mapa.length; i++) {
			
			System.out.println(mapa[i]);
			
		}
		
	
	}
	
	public static void moverJugador(Personaje p, char a) {
		
		boolean[][] posiciones;
		
		posiciones = posicionesValidas(DatosMapa.getMapa());
		
		if(a == 'a' || a == 'A') {
			int posJ = p.getPosJ()-1;
			
			if (posiciones[p.getPosI()][posJ] == false) {
				
				ControllerPersonaje.borrarPersonaje(p);
				p.setPosJ(posJ);
				ControllerPersonaje.dibujarPersonaje(p);
			}
		
		}
		
		if(a == 'd'|| a == 'D') {
			int posJ = p.getPosJ()+1;
			
			if (posiciones[p.getPosI()][posJ] == false) {
				
				ControllerPersonaje.borrarPersonaje(p);
				p.setPosJ(posJ);
				ControllerPersonaje.dibujarPersonaje(p);
			}
		
		}
		
		if(a == 'w'|| a == 'W') {
			int posI = p.getPosI()-1;
			
			if (posiciones[posI][p.getPosJ()] == false) {
				
				ControllerPersonaje.borrarPersonaje(p);
				p.setPosI(posI);
				ControllerPersonaje.dibujarPersonaje(p);
			}
		
		}
		
		if(a == 's'|| a == 'S') {
			int posI = p.getPosI()+1;
			
			if (posiciones[posI][p.getPosJ()] == false) {
				
				ControllerPersonaje.borrarPersonaje(p);
				p.setPosI(posI);
				ControllerPersonaje.dibujarPersonaje(p);
			}
		
		}
	}
	
	public static boolean [] [] posicionesValidas (char [][] mapa) {
		
		int num1 = 10;
		int num2 = 11;
		
		boolean [][] posicionesValidas = new boolean [num1][num2];
		
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				
				if(mapa[i][j] == '*' || mapa[i][j] == '|') {
					posicionesValidas[i][j] = true;
				}else {
					posicionesValidas[i][j] = false;
				}
				
			}
			
		}
		return posicionesValidas;
	}
	
	
//	public static void movimiento (char [][] mapaPrueba,Boolean [] [] posicionesValidas, String a, Personaje p) {
//		
//		int uno = 1;	
//		
//		mapaPrueba[p.getPosI()][p.getPosJ()] = p.getNombre();
//		
//		for (int i = 0; i < posicionesValidas.length; i++) {
//			for (int j = 0; j < posicionesValidas.length; j++) {
//				
//				if(posicionesValidas[i][j]) {
//					if(a == "s") {
//						mapaPrueba[i][j] = ' ';
//						p.setPosJ(p.getPosJ()+uno);
//						mapaPrueba[p.getPosI()][p.getPosJ()] = p.getNombre();
//						imprimirMapa(mapaPrueba, p);
//						
//					}else {
//						
//					System.out.println("Movimiento no válido");
//					imprimirMapa(mapaPrueba,p);
//					
//				}
//			}
//		}
//			
//	}
//		
//		
//		
////		if (a == "w") {
////			
////			mapaPrueba[posI][posJ] = "  ";
////			posI++;
////			mapaPrueba[posI][posJ]=p.getNombre()+ " ";
////			imprimirMapa(mapaPrueba,p);
////			
////		}
//	}
		

	
//	public static void comprobarPosicionesValidas(char [][] mapaPrueba, Personaje p) {
//		
//		
//		ControllerPersonaje.dibujarPersonaje(p);
//		
//		for (int i = 0; i < mapaPrueba.length; i++) {
//			
//			System.out.println(mapaPrueba[i]);
//			
//		}
//		
//		boolean [][] posicionesValidas = posicionesValidas(DatosMapa.getMapaPrueba());
//		
//		
//		for (int i = 0;  i < posicionesValidas.length; i++) {
//			
//			System.out.println("\n");
//			
//			for (int j = 0; j < posicionesValidas.length; j++) {
//				
//				if(posicionesValidas[i][j]==true) {
//					
//					System.out.print("1");
//					
//				}else {
//					System.out.println("2");
//				}
//			}
//		}
//	}
//	
	


		
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



