package vistas;

import java.util.Random;

import datos.DatosObjetos;
import datos.DatosMapa;
import model.Enemigo;
import model.Objetos;
import model.Tasks;
import datos.DatosTasks;

public class VistasHistoria {
	
	public static void imprimirIntro () {
		
		System.out.println("\n_________________________________________________________________________________________________________");
		
		System.out.println("\n \nBienvenido al año 2020, un año donde la humanidad se ha visto\n"
				+ "amenazada por un virus nuevo y desconocido: el Coronavirus.");
		System.out.println("Este patógeno no solo afecta a la salud de las personas, sino que\n"
				+ "con el paso de los días, la persona contagiada pierde la razón y se vuelve \ntotalmente"
				+ " agresiva contra cualquier ser viviente.");
		System.out.println("\nComo consecuencia, los humanos se encuentran en una situación prácticamente"
				+ " \napocalíptica, en la que viven en constante miedo, ya que su día a día se ha \nconvertido en una"
				+ "continua lucha por la supervivencia. ");
		System.out.println("\nCualquier objeto o pertenencia adicional proporciona ventaja sobre el resto\nde la población, así que, "
				+ "por qué no sales afuera para ver qué más puedes conseguir?");
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
		System.out.println("\t \t \t | M I S I Ó N : ASALTO AL MERCADONA |");
		System.out.println("\t \t \t |___________________________________|");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Como hemos dicho antes, cualquier OBJETO proporciona ventajas sobre los otros");
		System.out.println("Por eso, si quieres seguir sobreviviendo, debes hacer una parada en el supermercado\n"
				+ "más cercano: tu Mercadona de confianza.");
		System.out.println("Allí tendrás que comprar los siguientes productos: ");
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
		System.out.println("Todos los objetos los tendrás que coger de los pasillos del supermercado\n"
				+ "y se guardarán en tu MOCHILA. Solo necesitarás usar las teclas "
				+ "W, S, A y D \npara MOVERTE.");
		System.out.println();
		System.out.println();
		System.out.println("\t \t \t      ___________________________");
		System.out.println("\t \t \t     | \t\t\t\t |");
		System.out.println("\t \t \t     | W: arriba      S: abajo   |");
		System.out.println("\t \t \t     | A: izquierda   D: derecha |");
		System.out.println("\t \t \t     |___________________________|");
		System.out.println();
		System.out.println("\t \t \t \t \t   ·");
		System.out.println("\t \t \t \t \t   ·");
		System.out.println("\t \t \t \t \t   ·");
		System.out.println("\t \t \t \t \t   ·");
		System.out.println("\t \t \t \t \t   ·");
		
	}
	
	public static void imprimirTasks (Tasks [] tasks) {
		
		for (int i = 0; i < tasks.length; i++) {
			
			if(tasks[i].isActivo() == true) {
				System.out.println(tasks[i]);
			
			}
		
		}
		
		
	}

}
