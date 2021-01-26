package vistas;

import java.util.Random;

import datos.DatosObjetos;
import datos.DatosMapa;
import model.Enemigo;
import model.Objetos;
import model.Tasks;
import datos.DatosTasks;

public class VistasHistoria {
	
public static void imprimirInstrucciones() {
		
		System.out.println("\n_________________________________________________________________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println("\t \t \t      I N S T R U C C I O N E S");
		System.out.println();
		System.out.println();
		System.out.println("\t        Solo necesitarás usar las teclas W, S, A y D para MOVERTE.");
		System.out.println();
		System.out.println();
		System.out.println("\t \t \t      ___________________________");
		System.out.println("\t \t \t     | \t\t\t\t |");
		System.out.println("\t \t \t     | W: arriba      S: abajo   |");
		System.out.println("\t \t \t     | A: izquierda   D: derecha |");
		System.out.println("\t \t \t     |___________________________|");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t   Mientras te mueves por el mapa, encontrarás enemigos por los pasillos.\n"
				+ "\t   Tendrás que vencer, y a cambio conseguirás los objetos que se te piden\n"
				+ "\t  en la introducción. Todos los objetos se guardarán en tu MOCHILA y podrás\n"
				+ "\t \t \t \tusarlos en las peleas.");
		System.out.println();
	
		System.out.println("\tAdemás, debes de saber que debes tener suficiente vida en cada COMBATE como para\n"
				+ "\trecibir MÁS DE UN GOLPE. Eso dependerá del daño que hagas y la vida del enemigo.\n\n"
				+ "       IMPORTANTE: para GANAR la partida deberás conseguir los 3 objetos y volver a la caja\n"
				+ "\t    para pagar. La caja es la posición inicial donde parte el personaje(1,1)");
		System.out.println("\n\n\t\t\t\t     Buena suerte.");
		System.out.println();
		System.out.println();
		System.out.println("\n_________________________________________________________________________________________________________");
		System.out.println();
	}
	
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
		System.out.println("\t \t \t   | \t     " + objetos[3].getNombre() + "\t     |" );
		System.out.println("\t \t \t   |\t     " + objetos[4].getNombre() + "\t     |" );
		System.out.println("\t \t \t   | \t \t " + objetos[5].getNombre() + "\t     |" );
		System.out.println("\t \t \t   | \t\t\t\t     |");
		System.out.println("\t \t \t   |_________________________________|");
		System.out.println();	
		System.out.println();
		
	}
	
	public static void imprimirTasks (Tasks [] tasks) {
		
		for (int i = 0; i < tasks.length; i++) {
			
			if(tasks[i].isActivo() == true) {
				System.out.println(tasks[i]);
			
			}
		
		}
		
		
	}
	
	public static void imprimirAccionEnemigo (int index) {
		
		int cero = 0, uno = 1, dos = 2;
		
		if(index  == cero) {
			System.out.println("Con todo el lío del Coronavirus, ya nadie se detiene unos segundos\n"
					+ "para que Antonio le pueda hacer publicidad de la pescadería Mercadona.\nSin embargo,eso no"
					+ " hace que se rinda. Por ello, cuando te ha visto, no ha \ndudado en correr "
					+ "hacia ti.");
		}
		
		if(index  == uno) {
			System.out.println("Las personas mayores también quieren sobrevivir a esta pandemia; \n"
					+ "pero claro la edad los limita, así que ha estado esperando a que \napareciera"
					+ " alguien para pedirle que le coja la lata de sardinas\nque está en la última "
					+ "balda, que ella no llega.");
			System.out.println();
			System.out.println("Tú te niegas a ser su víctima, porque el tiempo apremia y decides\n"
					+ "seguir buscando lo que necesitas. A la señora mayor no le sienta\nnada bien,"
					+ "así que decide acercarse con su andador para enseñarte\nque debes respetar"
					+ "a tus mayores.");
		}
		
		if(index  == dos) {
			System.out.println("Estaba limpiando el suelo, y parece que no se ha puesto muy contenta\n"
					+ "al verte llegar con los zapatos llenos de barro.");
			System.out.println("Ves que se acerca ti con actitud hostil y la fregona en mano.");
		}
	
	}
	
	public static void imprimirAccionPersonaje (int index) {
		
		int cero = 0, uno = 1, dos = 2;
		
		if(index  == cero) {
			System.out.println("No obstante, tú has contratacado con un estornudo y lo has podido ahuyentar.");
			System.out.println("Ahora puedes coger el papel higiénico.");
		}
		
		if(index  == uno) {
			System.out.println("Como no quieres oír más discursos, le pides que te deje el andador para poder\n"
					+ "llegar a la última balda y coger la lata de atún junto con la carne mechá.");
		}
		
		if(index  == dos) {
			System.out.println("No quieres perder más tiempo, así que le quitas la fregona, limpias lo que\n"
					+ "has ensuciado y consigues que te deje coger la harina.");
		}
	
	}
	
	public static void imprimirAccionObjeto (int usar) {//HACER EN CLASE
		
		int cero = 0, uno = 1, dos = 2;
	
		if(usar-uno == cero) {
			System.out.println("Esto te permite tirarle la mascarilla a la cara del enemigo, haciendo que\n"
					+ "se asuste y te vengas arriba.");
		}
		
		if(usar-uno == uno) {
			System.out.println("Esto te permite echarle el líquido del frufrú al enemigo en los ojos, haciendo\nque"
					+ " no pueda ver durante un rato.");
		}
		if(usar-uno == dos) {
			System.out.println("Con el gel, tus manos serán más pegajosas y tus ataques serán más fuertes.");
		}
		
	}
	
	public static void imprimirDerrota () {
		System.out.println();
		System.out.println();
		System.out.println("  ________                        ________                     \r\n"
				+ " /  _____/_____    _____   ____   \\_____  \\___  __ ___________ \r\n"
				+ "/   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\\r\n"
				+ "\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/\r\n"
				+ " \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   \r\n"
				+ "        \\/     \\/      \\/     \\/          \\/          \\/       ");
	}
	
	public static void imprimirFinalAlternativo () {
		
		System.out.println("Ya has conseguido los tres objetos que necesitabas y ya has pagado rápidamente\n"
				+ "en caja, así que decides irte.");
		System.out.println();
		System.out.println("Sin embargo, cuando empiezas a caminar hacia la puerta, escuchas que un hombre\n"
				+ "infectado entra por una de las puertas laterales, y va hacia el cajero, dispuesto a\n"
				+ "contagiarle.");
		System.out.println();
		System.out.println("¿Qué haces?");
		System.out.println("1. Ayudar al cajero.");
		System.out.println("2. Esto no va contigo. No quieres arriesgarte y prefieres irte a casa.");
	}
	
	public static void imprimirFinalAlternativo1 () {
		
		System.out.println("Decides ayudar al cajero.");
		System.out.println();
		System.out.println("Corres hacia el contagiado con un estintor para defenderte, pero en el forcejeo,\n"
				+ "tu enemigo te muerde en el brazo.");
		System.out.println();
		System.out.println("Encima, tus objetos se han caído al suelo y han quedado inservibles.");
		System.out.println();
		System.out.println("Para colmo, el cajero te ha utilizado como distracción para salir de allí.");
		System.out.println();
		System.out.println("Una vez que te ha mordido, consigues deshacerte del hombre, pero ya es demasiado\n"
				+ "tarde porque te ha infectado.");
		
	}
	
	public static void imprimirFinalAlternativo2 () {
		
		System.out.println("Huyes de Mercadona sin mirar atrás. No te puedes arriesgar a contagiarte después\n"
				+ "de todo por lo que has pasado. Por el camino consigues esconderte de los infectados que vas\n"
				+ "encontrando y finalmente llegas sano y salvo a casa.");
		System.out.println();
		System.out.println("No obstante, sabes que te debes seguir manteniendo alerta, porque aún te queda\n"
				+ "sobrevivir al 2020");
		
	}
	
	public static void imprimirFin () {
		
		System.out.println("______________ ______________    ___________ _______  ________   \r\n"
				+ "\\__    ___/   |   \\_   _____/    \\_   _____/ \\      \\ \\______ \\  \r\n"
				+ "  |    | /    ~    \\    __)_      |    __)_  /   |   \\ |    |  \\ \r\n"
				+ "  |    | \\    Y    /        \\     |        \\/    |    \\|    `   \\\r\n"
				+ "  |____|  \\___|_  /_______  /    /_______  /\\____|__  /_______  /\r\n"
				+ "                \\/        \\/             \\/         \\/        \\/");
	}
	
	
	
	
}
