package datos;

import java.util.Arrays;

public class DatosMapa {
	
	
	public static char [][] mapaPrueba = {{'*','*','*','*','*'}, 
							 {'*' , ' ', ' ', ' ', '*'}, 
							 {'*',' ','|',' ', '*'},
							 {'*',' ','|',' ', '*'},
							 {'*','*','*','*','*'} };
	
	public static char [][] mapa = {{'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}, 
					    {'*', ' ', ' ', ' ',' ',' ', ' ',' ',' ',' ',' ',' ',' ',' ','*'},
					    {'*', ' ', ' ', ' ',' ',' ', ' ',' ',' ',' ',' ',' ',' ',' ','*'},
					    {'*', ' ', ' ', ' ', '|',' ', ' ', '|',' ', ' ','|',' ', ' ',' ','*'},
					    {'*', ' ', ' ', ' ', '|',' ', ' ', '|',' ', ' ','|',' ', ' ',' ','*'},
					    {'*', ' ', ' ', ' ', '|',' ', ' ', '|',' ', ' ','|',' ', ' ',' ','*'},
					    {'*', ' ', ' ', ' ', '|',' ', ' ', '|',' ', ' ','|',' ', ' ',' ','*'},
					    {'*', ' ', ' ', ' ', '|',' ', ' ', '|',' ', ' ','|',' ', ' ',' ','*'},
					    {'*', ' ', ' ', ' ',' ',' ', ' ',' ',' ',' ',' ',' ',' ',' ','*'},
					    {'*','*','*','*','*','*','*','*','*','*','*','*','*','*','*'}};

	public static char[][] getMapaPrueba() {
		return mapaPrueba;
	}

	public static void setMapaPrueba(char[][] mapaPrueba) {
		DatosMapa.mapaPrueba = mapaPrueba;
	}

	public static char[][] getMapa() {
		return mapa;
	}

	public static void setMapa(char[][] mapa) {
		DatosMapa.mapa = mapa;
	}


	
	


	
	

}
