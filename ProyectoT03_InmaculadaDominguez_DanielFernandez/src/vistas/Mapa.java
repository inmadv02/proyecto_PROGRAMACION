package vistas;

public class Mapa {

	
	public static void imprimirMapa () {
		
		
		//Primer intento
		for(int i = 0; i < 10; i++) {
			System.out.print("**");
		}
		System.out.println();
		
		for(int i = 0; i < 8; i++) {
			System.out.print("* ");
			for(int j = 0; j < 14; j++) {
				System.out.print(" ");
				
				if(i == 0 && j == 1) {
					System.out.print("    ");
				}
				
				//Primera calle del supermercado
				
				if(i == 1 && j == 1) {
					System.out.print(" *");
				}
				
				if(i == 2 && j == 1) {
					System.out.print(" *");
				}
				
				if(i == 3 && j == 1) {
				System.out.print(" *");
				
				}
				
				if(i == 4 && j == 1) {
					System.out.print(" *");
				}
				
				if(i == 5 && j == 1) {
					System.out.print(" *");
				}
				
				//Segunda calle del super
				
				if(i == 1 && j == 5) {
					System.out.print("*");
				
				}
				
				if(i == 2 && j == 5) {
					System.out.print("*");
				
				}
				
				if(i == 3 && j == 5) {
					System.out.print("*");
				
				}
				
				if(i == 4 && j == 5) {
					System.out.print("*");
				
				}
				
				if(i == 5 && j == 5) {
					System.out.print("*");
				
				}
				
				//Tercera calle del super
				
				if(i == 1 && j == 9) {
					System.out.print("*");
				
				}
				
				if(i == 2 && j == 9) {
					System.out.print("*");
				
				}
				
				if(i == 3 && j == 9) {
					System.out.print("*");
				
				}
				
				if(i == 4 && j == 9) {
					System.out.print("*");
				
				}
				
				if(i == 5 && j == 9) {
					System.out.print("*");
				
				}
				
				if(i == 6 && j == 10) {
					System.out.print("    ");
				}
				
				if(i == 7 && j == 10) {
					System.out.print("    ");
				}
			
			}
			System.out.println("*");
			
//			if(i == 2) {
//				System.out.print("*  ");
//			}
		}
		
	
		for(int i = 0; i < 10; i++) {
			System.out.print("**");
		}
		
		//Segundo intento
		
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.print("* ");
//				
//				if(i != 9 && i != 0 && j == 2) {
//					System.out.print(" ");
//				}
//				
//				if(j == 1 && i == 1) {
//					System.out.print(" ");
//				}
//				
//			}System.out.println(" ");
//		}
//		
//		
//		System.out.println("**********************");
//		for (int i = 0; i < 9 ; i++) {
//			for (int j = 0; j < 8; j++) {
//				System.out.print("*  ");
//				
//				if( i == 1 && j == 0 && j == 8 ) {
//					System.out.print("   ");
//					
//				}
//		
//			}
//			System.out.println();
//			
//			
//		}
//		
//		
  }


}
