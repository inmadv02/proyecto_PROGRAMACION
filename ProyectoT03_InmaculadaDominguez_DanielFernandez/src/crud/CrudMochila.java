package crud;

import model.Objetos;
import controller.ControllerEnemigo;
import model.Enemigo;
import datos.DatosEnemigos;
import datos.DatosObjetos;


public class CrudMochila {
	
	public static void ganarObjeto (Enemigo [] listaEnemigos, Objetos [] objetos) {
		
		int cero = 0;
		
			if(listaEnemigos[0].getVida() == cero) {
				objetos[3].setActivo(true);
				
			}
			
			if(listaEnemigos[1].getVida() == cero) {
				objetos[4].setActivo(true);
				
			}
			
			if(listaEnemigos[2].getVida() == cero) {
				objetos[5].setActivo(true);
				
			}
			
		
		
	}
	

}
