package vistas;

import java.util.Random;

import datos.DatosObjetos;
import model.Objetos;

public class VistasHistoria {
	
	public static void imprimirIntro () {
		
		System.out.println("\n_________________________________________________________________________________________________________");
		
		System.out.println("\n \nBienvenido al a�o 2020, un a�o donde la humanidad se ha visto\n"
				+ "amenazada por un virus nuevo y desconocido: el Coronavirus.");
		System.out.println("Este pat�geno no solo afecta a la salud de las personas, sino que\n"
				+ "con el paso de los d�as, la persona contagiada pierde la raz�n y se vuelve \ntotalmente"
				+ " agresiva contra cualquier ser viviente.");
		System.out.println("\nComo consecuencia, los humanos se encuentran en una situaci�n pr�cticamente"
				+ " \napocal�ptica, en la que viven en constante miedo, ya que su d�a a d�a se ha \nconvertido en una"
				+ "continua lucha por la supervivencia. ");
		System.out.println("\nCualquier objeto o pertenencia adicional proporciona ventaja sobre el resto\nde la poblaci�n, as� que, "
				+ "�por qu� no sales afuera para ver qu� m�s puedes conseguir?");
		System.out.println();
	
		
	}
	
	public static void imprimirPantallaCarga () {
		
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n \t  \t  \t \tC A R G A N D O...18%");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n \t  \t  \t \tC A R G A N D O...59%");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n \t  \t  \t \tC A R G A N D O...97%");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\n \t \t \t    C A R G A   C O M P L E T A D A\n");
		System.out.println();
		System.out.println();
		
	}
	
	public static void imprimirMisionInicio (Objetos [] objetos) {
		
		System.out.println();
		System.out.println("\t \t \t  ___________________________________");
		System.out.println("\t \t \t | \t    \t    \t   \t     |");
		System.out.println("\t \t \t | M I S I � N : ASALTO AL MERCADONA |");
		System.out.println("\t \t \t |___________________________________|");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Como hemos dicho antes, cualquier OBJETO proporciona ventajas sobre los otros");
		System.out.println("Por eso, si quieres seguir sobreviviendo, debes hacer una parada en el supermercado\n"
				+ "m�s cercano: tu Mercadona de confianza.");
		System.out.println("All� tendr�s que comprar los siguientes productos: ");
		System.out.println();
		System.out.println();
		System.out.println("\t \t \t    ______||________||_______||______");
		System.out.println("\t \t \t   |      ||        ||       ||      |");
		System.out.println("\t \t \t   |\t\t\t \t     |");
		System.out.println("\t \t \t   |     L I S T A   C O M P R A     |");
		System.out.println("\t \t \t   |   \t\t\t\t     |");
		//for (int i = 3; i < objetos.length; i++) {
		System.out.println("\t \t \t   | \t     " + objetos[3].getNombre() + "\t     |" );
		System.out.println("\t \t \t   |\t \t " + objetos[4].getNombre() + "\t     |" );
		System.out.println("\t \t \t   | \t     " + objetos[5].getNombre() + "\t     |" );
		//}
		System.out.println("\t \t \t   | \t\t\t\t     |");
		System.out.println("\t \t \t   |_________________________________|");
		System.out.println();	
		System.out.println();
		System.out.println("Todos los objetos los tendr�s que coger de los pasillos del supermercado\n"
				+ "y se guardar�n en tu MOCHILA. Solo necesitar�s usar las teclas "
				+ "W, S, A y D \npara MOVERTE.");
		System.out.println();
		System.out.println();
		System.out.println("\t \t \t      ___________________________");
		System.out.println("\t \t \t     | \t\t\t\t |");
		System.out.println("\t \t \t     | W: arriba      S: abajo   |");
		System.out.println("\t \t \t     | A: izquierda   D: derecha |");
		System.out.println("\t \t \t     |___________________________|");
		System.out.println();
		System.out.println("\t \t \t \t \t   �");
		System.out.println("\t \t \t \t \t   �");
		System.out.println("\t \t \t \t \t   �");
		System.out.println("\t \t \t \t \t   �");
		System.out.println("\t \t \t \t \t   �");
		
	}
	
	public static void imprimirTask (Objetos [] objetos) {
		
		Random r = new Random (System.nanoTime());
		int hasta = 5;
		int desde = 3;
		int ale;
		
		ale = r.nextInt(hasta-desde+1)+desde;
		
		
//		if (objetos[ale].isActivo() == true)
//			
//		System.out.println();
//		System.out.println();
//		System.out.println("\t  _________________________________________");
//		System.out.println("\t |  \t\t\t\t  |");
//		System.out.println("\t |   Objetivo: Coger " + objetos[ale].getNombre() + "\t |");
//		System.out.println("\t |   Pista: ");
//		
		
	}

}
