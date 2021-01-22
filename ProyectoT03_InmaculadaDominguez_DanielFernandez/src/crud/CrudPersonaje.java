package crud;

import model.Personaje;
import model.Objetos;


public class CrudPersonaje {
	
	public void modificarVida (Personaje p1,Personaje p2){
		
		p1.setVida(p1.getVida()-p2.getFuerza());
	}
	
	public void modificarFuerzaObjeto (Personaje p1, Objetos o1){
		
		p1.setFuerza(p1.getFuerza()+o1.getBonusFuerza());
	}
	
	public void modificarVidaObjeto (Personaje p1, Objetos o1) {
		
		p1.setVida(p1.getVida()+o1.getBonusVida());
	}
		
		
}
