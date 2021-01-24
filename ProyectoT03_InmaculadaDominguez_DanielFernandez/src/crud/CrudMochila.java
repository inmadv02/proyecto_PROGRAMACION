package crud;

import model.Objetos;
import controller.ControllerEnemigo;
import model.Enemigo;
import datos.DatosEnemigos;
import datos.DatosObjetos;


public class CrudMochila {
	
	public static void ganarObjeto (Enemigo [] listaEnemigos, Objetos [] objetos) {
		
		int cero = 0;
		for (int i = 0; i < listaEnemigos.length; i++) {
			
			if(listaEnemigos[i].getVida() == cero) {
				objetos[i].setActivo(false);
			}
		}
		
	}
	

}
