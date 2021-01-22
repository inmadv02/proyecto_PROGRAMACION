package crud;

import model.Enemigo;
import model.Objetos;

public class CrudEnemigo {
	
	public static void eleminarEnemigo(int usar, Enemigo [] enemigos){
		
		int posicion;
		posicion = usar - 1;
		
		enemigos[posicion].setActivo(false);
		
	}

}
