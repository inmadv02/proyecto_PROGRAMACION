package vistas;

import model.Personaje;

public class VistasMapa {

	
	public static void imprimirMapaInicio (String [][] mapaPrueba, Personaje p) {
		
		for (int i = 0; i < mapaPrueba.length; i++) {
			for (int j = 0; j < mapaPrueba.length; j++) { 
				
				mapaPrueba[1][1]= p.getNombre()+" ";
				
				System.out.print(mapaPrueba[i][j]);
				
			}
			
		}
		
	
	}
	
	public static void imprimirMapa (String [][] mapaPrueba, Personaje p) {
		
		for (int i = 0; i < mapaPrueba.length; i++) {
			for (int j = 0; j < mapaPrueba.length; j++) { 

				System.out.print(mapaPrueba[i][j]);
				
			}
			
		}
		
	
	}
	
		
	public static void movimiento (String [][] mapaPrueba, String a, Personaje p) {
		
		int posI = 1;
		int posJ = 1;
		
		mapaPrueba[posI][posJ] = p.getNombre()+ " ";
		
		if (a == "d") {
			mapaPrueba[posI][posJ] = "  ";
			posI++;
			mapaPrueba[posI][posJ]=p.getNombre()+ " ";
			imprimirMapa(mapaPrueba,p);
			
		}
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



