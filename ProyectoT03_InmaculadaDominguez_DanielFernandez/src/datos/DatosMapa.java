package datos;

import java.util.Arrays;

public class DatosMapa {
	
	String [][] mapaPrueba = {{"*", "*", "*", "*", "*"}, 
							{"*", " ", " ", " ", "*"},
							{"*", " ", "||", " ", "*"},
							{"*", " ", "||", " ", "*"},
							{"*", " ", " ", " ", "*"},
							{"*", "*", "*", "*", "*"}};
	
	String [][] mapa = {{"*", "*", "*", "*", "*", "*", "*", "*",  "*"}, 
					    {"*", " ", " ", " ", " ", " ", " ", " ",  "*"},
					    {"*", " ", " ", " ", " ", " ", " ", " ",  "*"},
				        {"*", " ", "||", " ", "||", " ", "||", " " , "*"},
				        {"*", " ", "||", " ", "||", " ", "||", " ", "*"},
				        {"*", " ", "||", " ", "||", " ", "||", " ", "*"},
				        {"*", " ", "||", " ", "||", " ", "||", " ", "*"},
				        {"*", " ", "||", " ", "||", " ", "||", " ", "*"},
				        {"*", " ", " ", " ", " ", " ", " ", " ",  "*"},
					    {"*", " ", " ", " ", " ", " ", " ", " ",  "*"},
					    {"*", "*", "*", "*", "*", "*", "*", "*",  "*"}};

	public String[][] getMapaPrueba() {
		return mapaPrueba;
	}

	public void setMapaPrueba(String[][] mapaPrueba) {
		this.mapaPrueba = mapaPrueba;
	}

	public String[][] getMapa() {
		return mapa;
	}

	public void setMapa(String[][] mapa) {
		this.mapa = mapa;
	}

	@Override
	public String toString() {
		return "DatosMapa [mapaPrueba=" + Arrays.toString(mapaPrueba) + "]";
	}
	
	
	

}
